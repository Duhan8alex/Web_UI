package org.example.lesson6;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;


public class SuccessBlock extends BaseView {
    public SuccessBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='ajax_block_products_total']")
    private WebElement sumElement;

    private final static String successIconXpathLocator = "//i[@class='icon-ok']";

    @FindBy(xpath = successIconXpathLocator)
    private WebElement successIcon;

    public void checkSuccessWithSum(String summ) {
        webDriverWait.until(ExpectedConditions.visibilityOf(successIcon));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successIconXpathLocator)));

        Assertions.assertAll(
                () -> MatcherAssert.assertThat(driver.findElement(By.xpath("//span[@class='ajax_block_products_total']")), hasText(summ)),
                () -> MatcherAssert.assertThat(driver.findElement(By.xpath("//i[@class='icon-ok']")), isDisplayed())
        );
        }


}
