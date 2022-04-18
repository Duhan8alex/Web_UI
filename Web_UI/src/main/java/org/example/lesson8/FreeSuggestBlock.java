package org.example.lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class FreeSuggestBlock {
    private SelenideElement indiGameButton = $(By.xpath("//div[@class= 'tab_item_name'][.='Coromon']"));

    @Step("Кликнуть на кнопку игры 'Coromon'")
    public IndiGamePage indiGameButtonClick() {
        indiGameButton.click();
        return page(IndiGamePage.class);
    }


}
