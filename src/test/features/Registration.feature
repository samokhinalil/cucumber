# language: ru
@withdrawal
Функция: Регистрация пользователя

    @success
    Сценарий: Регистрация неавторизованного пользователя на сайте
    Дано Новый посетитель открыл сайт
    Если Новый посетитель ввел логин и пароль
    То Пользователь добавляется в систему и входит в свою учетную запись