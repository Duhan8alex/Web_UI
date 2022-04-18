package org.example.home_work8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class IndiGamePage {
    private SelenideElement addToCartButton = $(By.xpath("//div[@class='btn_addtocart']//a[@href='http://store.steampowered.com/cart/?snr=1_5_9__403']"));


    @Step("Навести курсор мыши на продукт и добавить его в корзину")
    public SuccessGamePage hoverAndClickAddToCartProductByName(String productName) {
        addToCartButton.click();
        return page(SuccessGamePage.class);
    }

}
