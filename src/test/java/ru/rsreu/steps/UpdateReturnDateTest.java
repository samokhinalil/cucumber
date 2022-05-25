package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class UpdateReturnDateTest {
	@Дано("Модератор просматривает информацию о книге")
	public void модератор_просматривает_информацию_о_книге() {
		Assert.assertTrue(true);
	}

	@Если("Модератор обновил срок возврата книги")
	public void модератор_обновил_срок_возврата_книги() {
		Assert.assertTrue(true);
	}

	@То("Срок обновлен")
	public void срок_обновлен() {
		Assert.assertTrue(true);
	}
}
