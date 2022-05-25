package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class UpdateBookStateTest {
	@Дано("Модератор открыл информацию о книге")
	public void модератор_открыл_информацию_о_книге() {
		Assert.assertTrue(true);
	}

	@Если("Модератор обновил статус книги")
	public void модератор_обновил_статус_книги() {
		Assert.assertTrue(true);
	}

	@То("Статус обновлен")
	public void статус_обновлен() {
		Assert.assertTrue(true);
	}
}
