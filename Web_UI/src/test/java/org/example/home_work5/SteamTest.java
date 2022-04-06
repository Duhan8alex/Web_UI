package org.example.home_work5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SteamTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String STEAM_BASE_URL = "https://store.steampowered.com/u";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(STEAM_BASE_URL);
    }

    @Test
    void chooseRandomGameTest()  {
        driver.findElement(By.xpath("//div[@class= 'tab_item_name'][.='Coromon']")).click();
        driver.findElement(By.id("btn_add_to_cart_421781")).click();
        driver.findElement(By.id("btn_purchase_self")).click();
        driver.findElement(By.xpath("//input[@id='input_username']")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//div[@class='input_title']")).getText(),"Имя аккаунта Steam");

    }
    @Test
    void praisGameTest() {
        driver.findElement(By.xpath("//div[@class= 'tab_item_name'][.='Dangeon Village']")).click();
        driver.findElement(By.id("btn_add_to_cart_669076")).click();
        Assertions.assertEquals(driver.findElement(By.id("cart_estimated_total")).getText(),600);


    }


    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
