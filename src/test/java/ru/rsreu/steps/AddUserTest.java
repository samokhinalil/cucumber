package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class AddUserTest {
	@Дано("Администратор открыл сайт")
	public void администратор_открыл_сайт() {
		Assert.assertTrue(true);
	}

	@Если("Администратор добавил нового пользователя")
	public void администратор_добавил_нового_пользователя() {
		Assert.assertTrue(true);
	}

	@То("Пользователь добавлен")
	public void пользователь_добавлен() {
		Assert.assertTrue(true);
	}
}
