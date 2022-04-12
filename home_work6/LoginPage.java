package org.example.home_work6;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseViev{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    public MyAccountPage login(String email, String pass) {
        emailField.sendKeys(email);
        passwordField.sendKeys(pass);
        submitButton.click();
        return new MyAccountPage(driver);
    }
}
