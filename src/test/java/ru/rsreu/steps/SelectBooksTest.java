package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class SelectBooksTest {
	@Дано("Читатель открыл каталог книг")
	public void читатель_открыл_каталог_книг() {
		Assert.assertTrue(true);
	}

	@Если("Читатель просмотрел каталог книг на сайте")
	public void читатель_просмотрел_каталог_книг_на_сайте() {
		Assert.assertTrue(true);
	}

	@То("Читатель просмотрел книги")
	public void читатель_просмотрел_книги() {
		Assert.assertTrue(true);
	}
}
