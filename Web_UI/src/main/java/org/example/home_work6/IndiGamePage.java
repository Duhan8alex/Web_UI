package org.example.home_work6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//сама игра
public class IndiGamePage extends BaseViev{
    public IndiGamePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='btn_addtocart']//a[@href='http://store.steampowered.com/cart/?snr=1_5_9__403']")
    private WebElement successGameButton;
    @Step("Клик на кнопку 'В корзину'")
    public SuccessGamePage successGameClick() {
        successGameButton.click();
        return new SuccessGamePage(driver);
    }

    public void checkSuccessWithSum(String s) {
    }
}
