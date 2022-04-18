package org.example.home_work8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class FreeSuggetsBlock {
    private SelenideElement IndiGamePage = $(By.xpath("//div[@class= 'tab_item_name'][.='Coromon']"));

    @Step("Кликнуть на кнопку игры'Coromon'")
    public IndiGamePage indiGameClick() {
        successGameButton().click();
        return page(IndiGamePage.class);
    }

    private SelenideElement successGameButton() {
        return null;
    }
}
