package org.example.lesson6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseView {
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;
    private WebDriver driver;

    public LoginPage clickSignInButton() {
        signInButton.click();

        return new LoginPage(driver);
    }

    public MainPage(WebDriver driver) {
        super(driver);

    }
}
