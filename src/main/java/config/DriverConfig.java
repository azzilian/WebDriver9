package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {

    private static WebDriver driver;

    public static  WebDriver createDriver (Browsers browser) {
        if (driver == null){
            switch (browser){
                case CRHOME ->  createChrome();
                case CHROMEINCOGNITO ->  createChromeIncognito();
            }
        }
        return driver;
    }

    private static void createChromeIncognito() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized","--remote-allow-origins=*");

        driver = new ChromeDriver(chromeOptions);
    }

    private static void createChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized","--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
    }
}
