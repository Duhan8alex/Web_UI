package org.example.home_work6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//выбор
public class FreeSuggestBlock extends BaseViev {
    public FreeSuggestBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class= 'tab_item_name'][.='Coromon']")
    private WebElement indiGameButton;
    @Step("Клик на выбраную игру")
    public IndiGamePage indiGameButtonClick() {
        indiGameButton.click();
        return new IndiGamePage(driver);
    }


    public static class indiGameClick {
    }
}
