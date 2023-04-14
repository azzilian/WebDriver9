import config.BaseClass;
import org.apache.commons.exec.ExecuteException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.sql.Statement;

public class HomeWork10 extends BaseClass {
    static Statement statement;
    @BeforeClass
    public static void initPage() {
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void  test1() throws ExecuteException{
        WebElement inputName = driver.findElement(By.id("userName-wrapper"));
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Vlad");
    }
    @Test
   public void  test2() throws ExecuteException{
        WebElement inputName = driver.findElement(By.id("userEmail-wrapper"));
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("testInHurry@maildro.cc");
    }
    @Test
    public void  test3() throws ExecuteException {
        WebElement inputName = driver.findElement(By.id("currentAddress-wrapper"));
        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Made In haste but with love");
    }

    @Test
        public void  test4() throws ExecuteException {
        WebElement inputName = driver.findElement(By.id("permanentAddress-wrapper"));
        driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("We can check mailbox i supose at maildrop.cc");
    }
        @Test
        public void  test5() throws ExecuteException{
            WebElement inputElement = driver.findElement(By.id("submit"));
            inputElement.sendKeys(Keys.ENTER);

  }
  @AfterClass
     public static void closePage() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
  }
}

