package ru.netology.web.test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import ru.netology.web.data.DBConnector;
import ru.netology.web.data.DataGenerator;
import ru.netology.web.page.DebitPage;
import ru.netology.web.page.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DebitCardTest {

    private MainPage mainPage;
    private DebitPage debitPage;

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDown() {
        SelenideLogger.removeListener("allure");
    }

    @BeforeEach
    void setUpMainPage() {
        mainPage = new MainPage();
    }

    @SneakyThrows
    @Test
    //Вручную проходит
    @DisplayName("1. Покупка с оплатой дебетовой картой со статусом APPROVED: отправка формы в введенными во все поля валидными данными")
    void approvedDebitCardTest() {
        debitPage = mainPage.goToDebitPage();
        DBConnector.PaymentData beforeRequest = DBConnector.getLastPaymentData("payment_entity");
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkIfSuccess();
        DBConnector.PaymentData afterRequest = DBConnector.getLastPaymentData("payment_entity");
        assertNotEquals(beforeRequest.getId(), afterRequest.getId());
        assertEquals("APPROVED", afterRequest.getStatus());
    }



    @Test
    //Вручную не проходит, тексты уведомлений должны быть иными
    @DisplayName("2. Отправка пустой формы")
    void showAllErrorsDebitCard() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getEmptyCardsNumber(), DataGenerator.getEmptyMonth(), DataGenerator.getEmptyYear(), DataGenerator.getEmptyOwnercCards(), DataGenerator.getEmptyCVV());
        debitPage.checkCardNumberText("Поле обязательно для заполнения");
        debitPage.checkMonthText("Поле обязательно для заполнения");
        debitPage.checkYearText("Поле обязательно для заполнения");
        debitPage.checkOwnerText("Поле обязательно для заполнения");
        debitPage.checkCVVText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("3. Номер карты из 16 цифр, отличный от 1111 2222 3333 4444")
    void showsAnErrorIfADifferentDebitCardNumberIsSpecified() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getCardNumberNotFromRange(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkIfFail();
    }

    @Test
    //Вручную проходит
    @DisplayName("4. Номер карты из 16 нулей")
    void showDebitCardRefusalWithAllZeros() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getCardNumberWithAllZeros(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkIfFail();
    }

    @Test
    //Вручную проходит
    @DisplayName("5. Номер карты, состоящий из менее чем 16 цифр")
    void showDebitCardVerificationError() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getCardNumberWithLessNumbers(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkCardNumberText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("6. Пустой номер карты")
    void showErrorСheckingУmptyDebitСardNumber() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getEmptyCardsNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkCardNumberText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("7. В поле 'Номер карты' введены буквы и специальные символы")
    void showErrorInputtingLettersAndSymbolsInDebitCardNumber() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardNumber(DataGenerator.getCardNumberWithLettersAndSymbols());
        debitPage.emptyCardNumberInField();
    }

    @Test
    //Вручную проходит
    @DisplayName("8. Месяц, больше 12")
    void showDebitCardErrorCheckingMonthAndExpirationDateIfYouHaveMoreThan12() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getMonthWithMoreThan12(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkMonthText("Неверно указан срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("9. Месяц из 1 цифры")
    void showDebitCardErrorCheckingForWrongMonthFormat() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getMonthWith1Symbol(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkMonthText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("10. Пустое поле 'Месяц'")
    void showDebitCardEmptyMonthInputError() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getEmptyMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkMonthText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную не проходит, форма отправляется без ошибок
    @DisplayName("11. Месяц из двух нулей")
    void showDebitCardInvalidErrorCheckingMonthExpirationDateFrom00() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getMonthWith00(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkMonthText("Неверно указан срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("12. В поле 'Месяц' введены буквы и специальные символы")
    void showDebitCardErrorWhenEnteringLettersAndSymbols() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInMonth(DataGenerator.getMonthWithLettersAndSymbols());
        debitPage.emptyMonthInField();
    }

    @Test
    //Вручную проходит
    @DisplayName("13. Год меньше текущего")
    void showDebitCardIncorrectExpirationDateIfTheYearIsLessThanTheCurrentOne() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getYearLessThanCurrent(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkYearText("Истёк срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("14. Год из 1 цифры")
    void showDebitCardErrorWhenEnteringOneDigitinTheYearField() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getYearWith1Symbol(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkYearText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("15. Пустое поле 'Год'")
    void showDebitCardErrorIfTheYearFieldIsEmpty() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getEmptyYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkYearText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("16. Год из двух нулей")
    void
    showDebitCardErrorWhenEntering00InTheYearField() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getYearWith00(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        debitPage.checkYearText("Истёк срок действия карты");
    }
    @Test
    //Вручную проходит
    @DisplayName("17. В поле 'Год' введены буквы и специальные символы")
    void showErrorWhenEnteringLettersAndSymbolsInTheYearField() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInYear(DataGenerator.getYearWithLettersAndSymbols());
        debitPage.emptyYearInField();
    }

    @Test
    //Вручную не проходит, поле принимает любые значения
    @DisplayName("18. В поле 'Владелец' введены кириллические символы")
    void showErrorWhenEnteringTheDebitCardNameInCyrillic() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getOwnerWithCyrillicLetters(), DataGenerator.getApprovedCVV());
        debitPage.checkOwnerText("Неверный формат");
    }

    @Test
    //Вручную не проходит, поле принимает любые значения
    @DisplayName("19. В поле 'Владелец' введены цифры и специальные символы кроме дефиса, пробела и апострофа")
    void ShowErrorWhenEnteringNumericAndSpecialCharactersInTheOwnersDebitCardField() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInOwner(DataGenerator.getOwnerWithSymbols());
        debitPage.emptyCardOwnerInField();
    }

    @Test
    //Вручную проходит
    @DisplayName("20. Пустое поле 'Владелец'")
    void ShowDebitCardErrorWhenEnteringEmptyNameInTheOwnerNameField() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getEmptyOwnercCards(), DataGenerator.getApprovedCVV());
        debitPage.checkOwnerText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("21. Поле 'CVC/CVV' из 1 или 2 цифр")
    void ShowDebitCardErrorWhenEnteringOneOrTwoDigitsInAFieldCVV() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getCVVWith2Symbols());
        debitPage.checkCVVText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("22. Пустое поле 'CVC/CVV'")
    void ShowDebitCardErrorWhenEnteringAFieldEmptyCVV() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getEmptyCVV());
        debitPage.checkCVVText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную не проходит, форма отправляется без ошибок
    @DisplayName("23. Поле 'CVC/CVV' из трех нулей")
    void ShowDebitCardErrorWhenEntering000InTheFieldCVV() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getCVVWith00());
        debitPage.checkCVVText("Неверное значение");
    }

    @Test
    //Вручную проходит
    @DisplayName("24. В поле 'CVC/CVV' введены буквы и специальные символы")
    void ShowDebitCardErrorWhenEnteringLettersAndSymbolsInTheField() {
        debitPage = mainPage.goToDebitPage();
        debitPage.fillInCVV(DataGenerator.getCVVWithLettersAndSymbols());
        debitPage.emptyCVVInField();
    }
}