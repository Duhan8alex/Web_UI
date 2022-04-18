package org.example.home_work6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseViev {
    @FindBy(xpath = "//a[@class='global_action_link']")
    public WebElement signInButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    @Step("Клик на кнопку Войти")
    public LoginPage clickSignInButton() {
        signInButton.click();
        return new LoginPage(driver);
    }

}
