import config.BaseClass;
import org.apache.commons.exec.ExecuteException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import java.sql.Statement;

public class TestLink extends BaseClass {
    static Statement statement;
    @BeforeClass
    public static void b() {
        driver.get("https://ithillel.ua/courses/qa-automation");
    }
    @Test
    public void  test1() throws ExecuteException{
        System.out.println(driver.findElements(By.id("15")));

    }
}

