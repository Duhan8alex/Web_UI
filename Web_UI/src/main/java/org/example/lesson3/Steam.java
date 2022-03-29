package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Steam {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");

        driver.findElement(By.xpath("//a[.='Вход']")).click();
        driver.findElement(By.id("input_username")).sendKeys("#########");
        driver.findElement(By.id("input_password")).sendKeys("*********");

        driver.findElement(By.xpath("//a[.='СООБЩЕСТВО']")).click();
        driver.findElement(By.xpath("//span[.='Мастерская']"))
        driver.findElement(By.xpath("//a[.='Space Engineers']")).click();
        driver.findElement(By.id("app_header_view_store_page_btn")).click();
        driver.findElement(By.id("btn_add_to_cart_28952")).click();
        driver.findElement(By.id("btn_purchase_self")).click();
        driver.quit();

    }
}