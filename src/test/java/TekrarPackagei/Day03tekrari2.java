package TekrarPackagei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03tekrari2 {
    public static void main(String[] args){

    System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.navigate().to("https://www.youtube.com");
    driver.navigate().refresh();
//sayfanin title i youtube mu kontrol et.
    String actualTitle = driver.getTitle();
    String expectedTitle = "YouTube";
    if (actualTitle.equals(expectedTitle)){
        System.out.println("title test PASS");
    }else{
        System.out.println("title test FAILED");
    }
//sayfanin url si dogrumu kontrol edin https://www.youtube.com/

    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://www.youtube.com/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL test PASS");
        }else{
            System.out.println("URL test FAILED");
        }
    WebElement aramaKutusu = driver.findElement(By.name("search_query"));
        aramaKutusu.sendKeys("çatlak kurabiye");
aramaKutusu.submit();
    WebElement NesifYemekTarifleri = driver.findElement(By.xpath("//*[@id=\"thumbnail\"]"));
        NesifYemekTarifleri.click();

    }
}