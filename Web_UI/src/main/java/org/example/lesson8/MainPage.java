package org.example.lesson8;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.example.lesson6.BaseView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private SelenideElement signInButton = $(By.xpath("//a[@class='global_action_link']"));

    @Step("Клик на кнопку авторизации")
    public LoginPage clickSignInButton() {
        signInButton.click();
        return page(LoginPage.class);
    }

}
