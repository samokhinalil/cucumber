package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class RegistrationTest {
	@Дано("Новый посетитель открыл сайт")
	public void новый_посетитель_открыл_сайт() {
		Assert.assertTrue(true);
	}

	@Если("Новый посетитель ввел логин и пароль")
	public void новый_посетитель_ввел_логин_и_пароль() {
		Assert.assertTrue(true);
	}

	@То("Пользователь добавляется в систему и входит в свою учетную запись")
	public void пользователь_добавляется_в_систему_и_входит_в_свою_учетную_запись() {
		Assert.assertTrue(true);
	}
}
