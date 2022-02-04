package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationAlert {
        public static void main(String args[]) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("file:///C:/Users/hp/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/Confirmation.html");
        driver.findElement(By.xpath("//*[text()='Click on me']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
    }
}
