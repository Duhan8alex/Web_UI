package org.example.home_work6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutomationSteamTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void addChessGameTest() throws InterruptedException {
        driver.get("https://store.steampowered.com/");
        new MainPage(driver)
                .clickSignInButton()
                .login("spartalex93@test.test", "123456")
                .hoverFreeButton()
                .indiGameButtonClick()
                .checkSuccessWithSum("549");



    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
