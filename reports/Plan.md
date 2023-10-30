# Планирование автоматизации тестирования

## *Перечень автоматизируемых сценариев "Покупка тура"*


<table><tr><th colspan="1" valign="top">ID</th><th colspan="1" valign="top">Название </th><th colspan="1" valign="top">Шаги</th><th colspan="1" valign="top">Ожидаемый результат</th></tr>
<tr><td colspan="1" rowspan="8" valign="top">1</td><td colspan="1" rowspan="8" valign="top">Покупка тура по  карте</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 В поле «CVC/CVV» ввести любое трехзначное число</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">8 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top"><p>Появляется сообщение «Успешно! Операция одобрена банком».</p></td></tr>

  
<tr><td colspan="1" rowspan="8" valign="top">2</td><td colspan="1" rowspan="8" valign="top">Покупка тура в кредит по  карте</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333  4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 В поле «CVC/CVV» ввести любое трехзначное число</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">8 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top"><p>Появляется сообщение «Успешно! Операция одобрена банком».»</p></td></tr>


<tr><td colspan="1" rowspan="3" valign="top">3</td><td colspan="1" rowspan="3" valign="top">Ввод пустого номера карты</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 Нажать кнопку «Продолжить» </td><td colspan="1" valign="top">Появляется сообщение «Неверный формат»</p></td></tr>


<tr><td colspan="1" rowspan="4" valign="top">4</td><td colspan="1" rowspan="4" valign="top">Ввод значение в поле номера карты в ввиде одной цифры</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести 1 любую цифру</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 Нажать кнопку «Продолжить» </td><td colspan="1" valign="top">Появляется сообщение «Неверный формат» </p></td></tr>



<tr><td colspan="1" rowspan="4" valign="top">5</td><td colspan="1" rowspan="4" valign="top">Ввод значение в поле номера карты в ввиде 15 цифр</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести 15 любых цифр </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 Нажать кнопку «Продолжить» </td><td colspan="1" valign="top">Появляется сообщение «Неверный формат»</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="3" valign="top">6</td><td colspan="1" rowspan="3" valign="top">Ввод значение в поле номера карты в ввиде 17 цифр</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести 17 любых цифр  </td><td colspan="1" valign="top"> В поле отображаются только первые 16  цифр</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="3" valign="top">7</td><td colspan="1" rowspan="3" valign="top">Ввод значения номера карты с буквенным отображением (латиница)</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3  В поле "Номер карты" ввести 16 любых букв на латинице </td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="3" valign="top">8</td><td colspan="1" rowspan="3" valign="top">Ввод значения сномера карты с спец. символами</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top"> Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле "Номер карты" ввести 16 любых символов</td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="3" valign="top">9</td><td colspan="1" rowspan="3" valign="top">Ввод значения номера карты с буквенным отображением (кириллица)</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле "Номер карты" ввести 16 любых букв на кириллице </td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="5" valign="top">10</td><td colspan="1" rowspan="5" valign="top">Ввод пустого значение в поле "Месяц"</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 Поле "Месяц" оставить пустым </td><td colspan="1" valign="top">Поле остается пустым</td></tr>
<tr><td colspan="1" valign="top">5  Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Неверный формат»</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="5" valign="top">11</td><td colspan="1" rowspan="5" valign="top">Ввод значения в поле "Месяц" в ввиде 1 - ой цифры</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить »</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 Поле "Месяц"  ввести 1  любую цифру от 0 до 9 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Неверный формат»</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="4" valign="top">12</td><td colspan="1" rowspan="4" valign="top">Ввод значения в поле "Месяц" в ввиде 3-х цифр</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить в кредит»</td><td colspan="1" valign="top">Появляется раздел «Кредит по данным карты» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 Поле "Месяц"  ввести 3 любые цивры </td><td colspan="1" valign="top">В поле отображаются первые две цифры</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="5" valign="top">13</td><td colspan="1" rowspan="5" valign="top">Ввод значения в поле "Месяц" в ввиде 2-х нулей</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле "Месяц"  ввести 00 (два нуля) </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Неверный формат»</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="5" valign="top">14</td><td colspan="1" rowspan="5" valign="top">Ввод в поле "Месяц" значение, превышающее значение месяцев в году</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 Поле "Месяц"  ввести любое значение от 13 до 99 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Неверный формат»</td></tr>
</p></td></tr>


<tr><td colspan="1" rowspan="4" valign="top">15</td><td colspan="1" rowspan="4" valign="top">Ввод значения в поле "Месяц" в ввиде буквенного значения </td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4  Поле "Месяц"  ввести любое значение в ввиде 2-х букв</td><td colspan="1" valign="top">Поле остается пустым</td></tr>
</p></td></tr>


<tr><td colspan="1" rowspan="4" valign="top">16</td><td colspan="1" rowspan="4" valign="top">Ввод значения в поле "Месяц" в ввиде спец. символов</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить в кредит»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4  Поле "Месяц"  ввести любое значение в ввиде 2-х символов </td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">17</td><td colspan="1" rowspan="6" valign="top">Ввод пустого значение в поле "Год"</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 Поле "Год" оставить пустым</td><td colspan="1" valign="top">Поле остается пустыме</td></tr>
<tr><td colspan="1" valign="top">6 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Неверный формат» </p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">18</td><td colspan="1" rowspan="6" valign="top">Ввод  значение в поле "Год" меньше текущего года</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле "Год" ввести любое значение, меньше текущего  года</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Истёк срок действия карты »</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">19</td><td colspan="1" rowspan="6" valign="top">Ввод значения в поле "Год" в ввиде 2-х нулей</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле "Год"  ввести 00 (два нуля)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение «Истёк срок действия карты »</td></tr>
</p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">20</td><td colspan="1" rowspan="6" valign="top">Ввод  значение в поле "Год" больше текущего года, превышающий значение более 5 лет</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле "Год"  ввести значение,превышающие текущее (от 6 лет)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top"> Появляется сообщение « Неверно указан срок действия карты»</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="5" valign="top">21</td><td colspan="1" rowspan="5" valign="top">Ввод значения в поле "Год" в ввиде спец. символов</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле "Год" ввести любые два спец. символа</td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="5" valign="top">22</td><td colspan="1" rowspan="5" valign="top">Ввод значения в поле "Год" в ввиде букв</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле "Год" ввести любые две буквы</td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="7" valign="top">23</td><td colspan="1" rowspan="7" valign="top">Ввод пустого значение в поле "Владелец"</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 Поле «Владелец» оставить пустым</td><td colspan="1" valign="top">Поле пустое</td></tr>
<tr><td colspan="1" valign="top">7 Нажать кнопку "Продолжить"</td><td colspan="1" valign="top">Появляется сообщение "Поле обязательно для заполнения"</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">24</td><td colspan="1" rowspan="6" valign="top">Ввод значения в поле "Владелец" в ввиде букв (кириллица)</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить в кредит»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 Ввести имя и фамилию через пробел на кириллице (макс. 21 символ) </td><td colspan="1" valign="top">Поле пустое</td></tr></td></tr></p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">25</td><td colspan="1" rowspan="6" valign="top">Ввод значения в поле "Владелец" в ввиде спец. символов</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 Ввести имя и фамилию через пробел спец. символами (макс. 21 символ) </td><td colspan="1" valign="top">Поле пустое</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">26</td><td colspan="1" rowspan="6" valign="top">Ввод граничного значения для поля «Владелец»</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (свыше 21 символа)</td><td colspan="1" valign="top">В поле отображается только первые 21 значение</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="7" valign="top">27</td><td colspan="1" rowspan="7" valign="top">Ввод  значения для поля «Владелец» в ввиде одной буквы</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести одну букву</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top">Выходит сообщение "Отказ! Операция не одобрена Банком"</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="6" valign="top">28</td><td colspan="1" rowspan="6" valign="top">Ввод  значения для поля «Владелец» в ввиде цифр</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести любые цифры (макс. 21 значение)</td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="7" valign="top">29</td><td colspan="1" rowspan="7" valign="top">Ввод  значения для поля «Владелец» без пробела</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию  без пробела латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top">Выходит сообщение "Неверно указан  владелец карты"</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="8" valign="top">30</td><td colspan="1" rowspan="8" valign="top">Ввод пустого значение в поле "CVC/CVV"</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 Поле «CVC/CVV» оставить пустым</td><td colspan="1" valign="top">Данное поле пустое</td></tr>
<tr><td colspan="1" valign="top">8 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top"><p>Появляется сообщение «Неверный формат».</p><p></p></td></tr>


<tr><td colspan="1" rowspan="8" valign="top">31</td><td colspan="1" rowspan="8" valign="top">Ввод  значения для поля "CVC/CVV" в ввиде одной цифры</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 В поле «CVC/CVV» ввести одну цифру от 0 до 9</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">8 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top"><p>Появляется сообщение «Неверный формат»</p></td></tr>


<tr><td colspan="1" rowspan="8" valign="top">32</td><td colspan="1" rowspan="8" valign="top">Ввод  значения для поля "CVC/CVV" в ввиде двух цифры</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 В поле «CVC/CVV» ввести любые две цифры</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">8 Нажать кнопку «Продолжить»</td><td colspan="1" valign="top"><p>Появляется сообщение «Неверный формат»</p></td></tr>


<tr><td colspan="1" rowspan="7" valign="top">33</td><td colspan="1" rowspan="7" valign="top">Покупка тура по APPROVED карте</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 Ввод  значения для поля "CVC/CVV" в ввиде четырех цифр</td><td colspan="1" valign="top">В поле отображаются первые три цифры</p></td></tr>


<tr><td colspan="1" rowspan="7" valign="top">34</td><td colspan="1" rowspan="7" valign="top">Ввод  значения для поля "CVC/CVV" в ввиде трех спец. символов</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить»</td><td colspan="1" valign="top">Появляется раздел «Оплата по карте» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты» ввести: 1111 2222 3333 4444  </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 В поле «CVC/CVV» ввести любые три символа</td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>


<tr><td colspan="1" rowspan="7" valign="top">35</td><td colspan="1" rowspan="7" valign="top">Ввод  значения для поля "CVC/CVV" в ввиде трех букв</td><td colspan="1" valign="top">1 Зайти на страницу http://localhost:8080</td><td colspan="1" valign="top">Открывается страница «Путешествие дня»</td></tr>
<tr><td colspan="1" valign="top">2 Нажать кнопку «Купить в кредит»</td><td colspan="1" valign="top">Появляется раздел «Кредит по данным карты» с полями для заполнения</td></tr>
<tr><td colspan="1" valign="top">3 В поле «Номер карты ввести»: 1111 2222 3333 4444 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">4 В поле «Месяц» ввести одно из значений: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12 </td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">5 В поле «Год» в формате двух последних цифр ввести значение года больше текущего до плюс 5 лет</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">6 В поле «Владелец» ввести имя и фамилию через пробел латиницей (макс. 21 символ)</td><td colspan="1" valign="top">Данные отображаются в поле</td></tr>
<tr><td colspan="1" valign="top">7 В поле «CVC/CVV» ввести любые три буквы</td><td colspan="1" valign="top">Поле остается пустым</td></tr></p></td></tr>
</table>



## *Перечень используемых инструментов с обоснованием выбора*

||Используемый инструмент|Обоснование выбора|
| :- | :- | :- |
| |             |-  Популярность среди Java-разработчиков.|
| |             |-  Поддержка большого количества вспомогательных технологий.|
|1|IntelliJ IDEA|-  Интеграция с популярными инструментами сборки кода: Gradle, Maven, Ant и Gant.|
| |             |-  Регулярные обновления.|
| |             | - Интеграция с СУБД с возможностью управлять данными из IDE.|
| |        |- Мультифункциональность;
| |        |- Достаточно простой синтаксис;|
|2|Java    |- Независимость (код сможет работать на любой платформе, поддерживающей Java);|
| |        |- Надежность (благодаря строгой статической типизации);|
| |        |- Универсальность использования различных классов. |
|3|JUnit5  |Фреймворк для Java, полностью совместимый с самим языком и его инструментами, поэтому им удобнее всего пользоваться для тестирования Java-проектов |
| |        |Фреймворк для автоматизированного тестирования веб-приложений на основе Selenium WebDriver. Его преимущества:|
| |        |- изящный API|
|4|Selenide|- поддержка Ajax для стабильных тестов|
| |        |- мощные селекторы|
| |        |- простая конфигурация |
|5|Loombok |Библиотека Java, которая сокращает объем стандартного кода в классах|
|6|Gradle  |Инструмент с высокой производительностью для автоматизации сборки|
|7|Docker  |Многофункциональное приложения в виде переносимых автономных контейнеров|
|8|Faker   |Библиотека, которая позволяет генерировать случайные данные|
|9|AppVeyor|Распределенный веб-сервис непрерывной интегарции для сборки и тестирования кода, расположенного на GitHub|
|10|Allure |Фреймворк  для создания простых и понятных отчётов автотестов|
|11|GitHub |Крупнейший веб-сервис для хостинга IT-проектов и их совместной разработки. Веб-сервис основан на системе контроля версий Git|


## *Перечень и описание возможных рисков при автоматизации*
 - проблем с настройкой приложения и необходимых БД.		
 - проблема отсутствие тестовых меток		
 - иные технические недочеты приложения		


## *Интервальная оценка с учётом рисков в часах*

1. Подготовка к тестированию: 12 часов.	
	
2. Тестирование: 24 часов.	
	
3. Подготовка отчетов: 12 часов

## *План сдачи работ: когда будут проведены автотесты, результаты их проведения и отчёт по автоматизации*

1. Проведение автотестов: до 15.10.2023.	
	
2. Подготовка отчетов: до 22.10.2023.	


 **(Данный расчет взят из учета свободного временя для выполнения дипломной работы)**



