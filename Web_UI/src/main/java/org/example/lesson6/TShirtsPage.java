package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TShirtsPage extends BaseView {
    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Size']/ancestor::div[@class='layered_filter']//a")
    private List<WebElement> sizesList;

    public TShirtsPage selectSizeInFilters(String size) {
        sizesList.stream().filter(s -> s.getText().contains(size)).findFirst().get().click();
        return this;
    }

    @FindBy(xpath = "//ul[contains(@class, 'product_list')]/li")
    private List<WebElement> productsList;

    @FindBy(xpath = "//span[.='Add to cart']")
    private WebElement addToCartButton;

    public SuccessBlock hoverAndClickAddToCartProductByName(String productName) {
        actions.moveToElement(productsList.stream().filter(s -> s.getText().contains(productName)).findFirst().get())
                .build().perform();
        addToCartButton.click();
        return new SuccessBlock(driver);
    }

}
