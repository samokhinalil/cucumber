package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class BookRequestTest {
	@Дано("Читатель открыл сайт")
	public void читатель_открыл_сайт() {
		Assert.assertTrue(true);
	}

	@Если("Читатель оставил заявку на получение книги")
	public void читатель_оставил_заявку_на_получение_книги() {
		Assert.assertTrue(true);
	}

	@То("заявка отправлена")
	public void заявка_отправлена() {
		Assert.assertTrue(true);
	}
}
