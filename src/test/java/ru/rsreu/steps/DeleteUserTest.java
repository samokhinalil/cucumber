package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class DeleteUserTest {
	@Дано("Администратор открыл список профилей")
	public void администратор_открыл_список_профилей() {
		Assert.assertTrue(true);
	}

	@Если("Администратор удалил информацию о пользователе")
	public void администратор_удалил_информацию_о_пользователе() {
		Assert.assertTrue(true);
	}

	@То("Информация о пользователе удалена")
	public void информация_о_пользователе_удалена() {
		Assert.assertTrue(true);
	}
}
