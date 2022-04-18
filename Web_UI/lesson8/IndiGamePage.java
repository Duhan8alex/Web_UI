package org.example.lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class IndiGamePage {
    private ElementsCollection sizesList = $$(By.xpath("//div[@class='btn_addtocart']//a[@href='http://store.steampowered.com/cart/?snr=1_5_9__403']"));


    private SelenideElement successGameButton = $(By.xpath("//div[@class= 'tab_item_name'][.='Coromon']"));

    @Step("Навести курсор мыши на игру и добавить ее в корзину")
    public SuccessGamePage hoverAndClickAddToCartProductByName(String productName) {
        successGameButton.click();
        return page(SuccessGamePage.class);
    }


}
