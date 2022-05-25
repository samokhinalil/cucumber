package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class AddAuthorTest {
	@Дано("Модератор открыл сайт")
	public void модератор_открыл_сайт() {
		Assert.assertTrue(true);
	}

	@Если("Модератор добавил нового автора")
	public void модератор_добавил_нового_автора() {
		Assert.assertTrue(true);
	}

	@То("Автор добавлен")
	public void автор_добавлен() {
		Assert.assertTrue(true);
	}
}
