package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steam3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        Cookie authCookie =  new Cookie("_identity_","##########################");
        driver.manage().addCookie(authCookie);
        driver.navigate().refresh();

        driver.findElement(By.xpath("//a[.='Обсуждение']")).click();
        driver.findElement(By.id("tab_games")).click();
        driver.findElement(By.id("associate_game")).sendKeys("factorio");
        driver.findElement(By.id("forum_General_12002589_3189118358007494343")).click();
        driver.quit();


    }
}
