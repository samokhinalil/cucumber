package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class SortBookTest {
	@Если("Читатель нажал на кнопку сортировки")
	public void читатель_нажал_на_кнопку_сортировки() {
		Assert.assertTrue(true);
	}

	@То("Каталог книг отсортирован")
	public void каталог_книг_отсортирован() {
		Assert.assertTrue(true);
	}
}
