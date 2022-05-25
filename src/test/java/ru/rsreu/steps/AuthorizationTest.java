package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class AuthorizationTest {
	@Дано("Неавторизованный посетитель открыл сайт")
	public void неавторизованный_посетитель_открыл_сайт() {
		Assert.assertTrue(true);
	}

	@Если("Неавторизованный посетитель ввел логин и пароль")
	public void неавторизованный_посетитель_ввел_логин_и_пароль() {
		Assert.assertTrue(true);
	}

	@То("Пользователь зашел в свою учетную запись")
	public void пользователь_зашел_в_свою_учетную_запись() {
		Assert.assertTrue(true);
	}
}
