package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass {
    public static  WebDriver driver = initDriverChrome();
    private static WebDriver initDriverChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized","--remote-allow-origins=*");
        return new ChromeDriver(chromeOptions);
    }
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--start-maximized","--remote-allow-origins=*");
//        WebDriver driver =new ChromeDriver(chromeOptions);


}
