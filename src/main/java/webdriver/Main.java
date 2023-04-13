package webdriver;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Properties;

public class Main extends BaseClass {

    static  By widgetlocator=By.className("widget-gift-certificate_body");

    public static void main(String[] args) throws InterruptedException {
        WebElement widget;

        Properties props = System.getProperties();
        driver.get("https://ithillel.ua/courses/qa-automation");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        widget = driver.findElement(widgetlocator);

        if (widget.isEnabled()){
        System.out.println("сертификат на месте статус " +widget.isEnabled());
        }
        else {
        System.out.println("сертификат не отобразился статус " +widget.isEnabled());
        }
        Thread.sleep(5000);
        driver.quit();

    }
}