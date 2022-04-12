package org.example.home_work6;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

//Корзина
public class SuccessGamePage extends BaseViev {
        public SuccessGamePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn_purchase_self")
    private WebElement successElement;
    @FindBy(id = "btn_purchase_gift")
    private WebElement successfrendElement;

    @FindBy(xpath = "//div[@class='price']")
    private WebElement summElement;

    public void checkSuccessWithSum(String summ) {
        Assertions.assertAll(
                () -> assertThat(driver.findElement(By.id("cart_estimated_total")), hasText(summ)),
                () ->  assertThat(driver.findElement(By.id("btn_purchase_gift")), hasText("Купить в подарок")),
                () -> assertThat(driver.findElement(By.id("btn_purchase_self")), hasText("Купить для себя"))
        );
    }


}
