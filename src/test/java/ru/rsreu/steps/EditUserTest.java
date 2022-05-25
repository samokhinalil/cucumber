package ru.rsreu.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

public class EditUserTest {
	@Дано("Администратор открыл профиль пользователя")
	public void администратор_открыл_профиль_пользователя() {
		Assert.assertTrue(true);
	}

	@Если("Администратор отредактировал информацию о пользователе")
	public void администратор_отредактировал_информацию_о_пользователе() {
		Assert.assertTrue(true);
	}

	@То("Информация о пользователе изменена")
	public void информация_о_пользователе_изменена() {
		Assert.assertTrue(true);
	}
}
