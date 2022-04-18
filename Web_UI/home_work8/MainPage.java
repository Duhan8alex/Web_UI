package org.example.home_work8;



import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private SelenideElement signInButton = $(By.xpath("//a[@class='global_action_link']"));

    @Step("Клик на кнопку Войти")
    public LoginPage clickSignInButton() {
        signInButton.click();
        return page(LoginPage.class);
    }

}