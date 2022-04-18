package org.example.lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MyAccountPage {
    private SelenideElement freeButton = $(By.xpath("//div[@class='home_page_gutter_block']//a[contains(@href, 'B5')]"));

    @Step("Навести кнопку мыши на раздел 'Приключение'")
    public FreeSuggestBlock hoverFreeButton() {
        freeButton.hover();
        return page(FreeSuggestBlock.class);
    }


}
