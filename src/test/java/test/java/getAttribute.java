package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute
{
    public static void main(String agrs[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=common/home");

        WebElement searchTextBox=driver.findElement(By.id("search"));
        String typevalue=searchTextBox.getAttribute("type");
        System.out.println("value of type attribute:"+typevalue);

        String nameValue=searchTextBox.getAttribute("name");
        System.out.println("value of name attribute:"+nameValue);
    }

    }
