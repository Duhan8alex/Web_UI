package org.example.lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;


public class SuccessGamePage {
    private SelenideElement sumElement = $(By.id("btn_purchase_self"));

    private SelenideElement susseccIcon = $(By.xpath("//div[@class='price']"));

    @Step("Проверить корректность суммы заказа")
    public void checkSuccessWithSum(String summ) {
        Assertions.assertAll(
                () -> sumElement.shouldHave(Condition.text(summ)),
                () -> susseccIcon.shouldBe(Condition.visible)
        );
    }


}
