package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steam2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        Cookie authCookie = new Cookie("_identity_", "##################################3");
        driver.manage().addCookie(authCookie);
        driver.navigate().refresh();

        driver.findElement(By.xpath("//a[@class='gutter_item][12]")).click();
        driver.findElement(By.xpath("//div[@class='tab_item_name'] [.='Urbek City Builder: Prologue']")).click();
        driver.findElement(By.xpath("//div[@class='btnv6_blue_hoverfade btn_medium queue_btn_inactive']")).click();
        driver.quit();
    }
}
