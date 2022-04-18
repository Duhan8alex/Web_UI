package org.example.lesson8;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("Пользователь авторизован на сайте")
    public void userAuthorized() {
        Configuration.timeout = 10000;
        //Configuration.headless = true;
        open("https://store.steampowered.com/");
        new MainPage().clickSignInButton()
                .login("spartalex93@test.test", "123456");
    }

    @When("Я навожу мышь на раздел Приключение")
    public void hoverFreeButton() {
        new MyAccountPage().hoverFreeButton();
    }

    @And("^Я кликаю .* на кнопку Игры")
    public void clickTShirtsButton() {
        new FreeSuggestBlock().indiGameButtonClick();
    }

    @And("Добавляю в корзину игру Coromon")
    public void seccessGame() {
        new IndiGamePage().hoverAndClickAddToCartProductByName("Coromon");
    }

    @Then("Проверяем корректность суммы заказа")
    public void checkSumm() {
        new SuccessGamePage().checkSuccessWithSum("549");
    }

    @After(value = "@close")
    public void quitBrower() {
        Selenide.closeWebDriver();
    }

}
