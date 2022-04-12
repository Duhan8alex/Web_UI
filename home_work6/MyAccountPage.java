package org.example.home_work6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//выбор категории
public class MyAccountPage extends BaseViev{
    public MyAccountPage(WebDriver driver) {
        super(driver);
        freeSuggestBlock = new FreeSuggestBlock(driver);
    }

    @FindBy(xpath = "//div[@class='home_page_gutter_block']//a[contains(@href, 'B5')]")
    private WebElement freeButton;

    public FreeSuggestBlock hoverFreeButton() {
        actions.moveToElement(freeButton).build().perform();
        return freeSuggestBlock;
    }

    public FreeSuggestBlock freeSuggestBlock;
}
