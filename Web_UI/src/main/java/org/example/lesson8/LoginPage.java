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

public class LoginPage {
    private SelenideElement emailField = $(By.id("email"));

    private SelenideElement submitButton = $(By.id("SubmitLogin"));

    private SelenideElement passwordField = $(By.id("passwd"));

    @Step("Логин")
    public MyAccountPage login(String email, String pass) {
        emailField.sendKeys(email);
        passwordField.sendKeys(pass);
        submitButton.click();
        return page(MyAccountPage.class);
    }

}
