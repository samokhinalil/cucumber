package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class AddBookTest {
	@Если("Модератор добавил новую книгу")
	public void модератор_добавил_новую_книгу() {
		Assert.assertTrue(true);
	}

	@То("Книгу добавлен")
	public void книгу_добавлен() {
		Assert.assertTrue(true);
	}
}
