package ru.netology.web.test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import ru.netology.web.data.DBConnector;
import ru.netology.web.data.DataGenerator;
import ru.netology.web.page.CreditPage;
import ru.netology.web.page.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CreditCardTest {
    private MainPage mainPage;
    private CreditPage creditPage;

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
    @DisplayName("1. Покупка с оплатой в кредит по карте со статусом APPROVED: отправка формы с введенными во всем поля валидными данными")
    void approvedCreditCardTest() {
        creditPage = mainPage.goToCreditPage();
        DBConnector.PaymentData beforeRequest = DBConnector.getLastPaymentData("credit_request_entity");
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkIfSuccess();
        DBConnector.PaymentData afterRequest = DBConnector.getLastPaymentData("credit_request_entity");
        assertNotEquals(beforeRequest.getId(), afterRequest.getId());
        assertEquals("APPROVED", afterRequest.getStatus());
    }



    @Test
    //Вручную не проходит, тексты уведомлений должны быть иными
    @DisplayName("2. Отправка пустой формы")
    void showAllErrorsCreditCard() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getEmptyCardsNumber(), DataGenerator.getEmptyMonth(), DataGenerator.getEmptyYear(), DataGenerator.getEmptyOwnercCards(), DataGenerator.getEmptyCVV());
        creditPage.checkCardNumberText("Поле обязательно для заполнения");
        creditPage.checkMonthText("Поле обязательно для заполнения");
        creditPage.checkYearText("Поле обязательно для заполнения");
        creditPage.checkOwnerText("Поле обязательно для заполнения");
        creditPage.checkCVVText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("3. Номер карты из 16 цифр, отличный от 1111 2222 3333 4444")
    void showsAnErrorIfADifferentCreditCardNumberIsSpecified() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getCardNumberNotFromRange(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkIfFail();
    }

    @Test
    //Вручную проходит
    @DisplayName("4. Номер карты из 16 нулей")
    void showCrebitCardRefusalWithAllZeros() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getCardNumberWithAllZeros(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkIfFail();
    }

    @Test
    //Вручную проходит
    @DisplayName("5. Номер карты, состоящий из менее чем 16 цифр")
    void showCrebitCardVerificationError() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getCardNumberWithLessNumbers(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkCardNumberText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("6. Пустой номер карты")
    void showErrorСheckingУmptyCreditСardNumber() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getEmptyCardsNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkCardNumberText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("7. В поле 'Номер карты' введены буквы и специальные символы")
    void showErrorInputtingLettersAndSymbolsInCreditCardNumber() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardNumber(DataGenerator.getCardNumberWithLettersAndSymbols());
        creditPage.emptyCardNumberInField();
    }

    @Test
    //Вручную проходит
    @DisplayName("8. Месяц, больше 12")
    void showCreditCardErrorCheckingMonthAndExpirationDateIfYouHaveMoreThan12() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getMonthWithMoreThan12(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkMonthText("Неверно указан срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("9. Месяц из 1 цифры")
    void showCreditCardErrorCheckingForWrongMonthFormat() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getMonthWith1Symbol(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkMonthText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("10. Пустое поле 'Месяц'")
    void showCreditCardEmptyMonthInputError() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getEmptyMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkMonthText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную не проходит, форма отправляется без ошибок
    @DisplayName("11. Месяц из двух нулей")
    void showCreditCardInvalidErrorCheckingMonthExpirationDateFrom00() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getMonthWith00(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkMonthText("Неверно указан срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("12. В поле 'Месяц' введены буквы и специальные символы")
    void showCreditCardErrorWhenEnteringLettersAndSymbols() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInMonth(DataGenerator.getMonthWithLettersAndSymbols());
        creditPage.emptyMonthInField();
    }

    @Test
    //Вручную проходит
    @DisplayName("13. Год меньше текущего")
    void shouldThrowInvalidExpDateYearVerificationErrorInCredit() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getYearLessThanCurrent(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkYearText("Истёк срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("14. Год из 1 цифры")
    void showCreditCardErrorWhenEnteringOneDigitinTheYearField() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getYearWith1Symbol(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkYearText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("15. Пустое поле 'Год'")
    void showCreditCardErrorIfTheYearFieldIsEmpty() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getEmptyYear(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkYearText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("16. Год из двух нулей")
    void showCreditCardErrorWhenEntering00InTheYearField() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getYearWith00(), DataGenerator.getApprovedOwner(), DataGenerator.getApprovedCVV());
        creditPage.checkYearText("Истёк срок действия карты");
    }

    @Test
    //Вручную проходит
    @DisplayName("17. В поле 'Год' введены буквы и специальные символы")
    void showCreditCardErrorWhenEnteringLettersAndSymbolsInTheYearField() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInYear(DataGenerator.getYearWithLettersAndSymbols());
        creditPage.emptyYearInField();
    }

    @Test
    //Вручную не проходит, поле принимает любые значения
    @DisplayName("18. В поле 'Владелец' введены кириллические символы")
    void showErrorWhenEnteringTheCreditCardNameInCyrillic() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getOwnerWithCyrillicLetters(), DataGenerator.getApprovedCVV());
        creditPage.checkOwnerText("Неверный формат");
    }

    @Test
    //Вручную не проходит, поле принимает любые значения
    @DisplayName("19. В поле 'Владелец' введены цифры и специальные символы кроме дефиса, пробела и апострофа")
    void ShowErrorWhenEnteringNumericAndSpecialCharactersInTheOwnersCreditCardField() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInOwner(DataGenerator.getOwnerWithSymbols());
        creditPage.emptyCardOwnerInField();
    }

    @Test
    //Вручную проходит
    @DisplayName("20. Пустое поле 'Владелец'")
    void ShowCreditCardErrorWhenEnteringEmptyNameInTheOwnerNameField() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getEmptyOwnercCards(), DataGenerator.getApprovedCVV());
        creditPage.checkOwnerText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную проходит
    @DisplayName("21. Поле 'CVC/CVV' из 1 или 2 цифр")
    void ShowCreditCardErrorWhenEnteringOneOrTwoDigitsInAFieldCVV() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getCVVWith2Symbols());
        creditPage.checkCVVText("Неверный формат");
    }

    @Test
    //Вручную не проходит, текст уведомления должен быть иной
    @DisplayName("22. Пустое поле 'CVC/CVV'")
    void ShowCreditCardErrorWhenEnteringAFieldEmptyCVV() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getEmptyCVV());
        creditPage.checkCVVText("Поле обязательно для заполнения");
    }

    @Test
    //Вручную не проходит, форма отправляется без ошибок
    @DisplayName("23. Поле 'CVC/CVV' из трех нулей")
    void ShowCreditCardErrorWhenEntering000InTheFieldCVV() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCardInfo(DataGenerator.getApprovedCardNumber(), DataGenerator.getApprovedMonth(), DataGenerator.getApprovedYear(), DataGenerator.getApprovedOwner(), DataGenerator.getCVVWith00());
        creditPage.checkCVVText("Неверное значение");
    }

    @Test
    //Вручную проходит
    @DisplayName("50. В поле 'CVC/CVV' введены буквы и специальные символы")
    void ShowCreditCardErrorWhenEnteringLettersAndSymbolsInTheField() {
        creditPage = mainPage.goToCreditPage();
        creditPage.fillInCVV(DataGenerator.getCVVWithLettersAndSymbols());
        creditPage.emptyCVVInField();
    }
}