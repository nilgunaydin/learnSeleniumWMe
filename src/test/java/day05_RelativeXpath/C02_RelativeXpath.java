package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // once uzerlerinden tarif yapacagimiz web elemntlerini locate etmeliyiz
        WebElement sailor=driver.findElement(By.id("pid11_thumb"));
        WebElement boston=driver.findElement(By.id("pid6_thumb"));
        WebElement byArea=driver.findElement(By.id("pid8_thumb"));
        WebElement nyc=driver.findElement(By.id("pid3_thumb"));

        // 2 ) Berlin’i  3 farkli relative locator ile locate edin
        WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).toLeftOf(byArea));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).toLeftOf(byArea));
        WebElement berlin3=driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).above(sailor));

        // 3 ) Relative locator’larin dogru calistigini test edin
        String expectedId = "pid7_thumb";
        String actualId = berlin1.getAttribute("id");
        String actualId2 = berlin2.getAttribute("id");
        String actualId3 = berlin3.getAttribute("id");
    if(expectedId.equals(actualId)){
        System.out.println("1.relavite locate test PASS");
    }else{
        System.out.println("1.relavite locate test FAILED");
    }
        if(expectedId.equals(actualId2)){
            System.out.println("2.relavite locate test PASS");
        }else{
            System.out.println("2.relavite locate test FAILED");
        }
        if(expectedId.equals(actualId3)){
            System.out.println("3.relavite locate test PASS");
        }else{
            System.out.println("3.relavite locate test FAILED");
        }
driver.close();
    }

}
