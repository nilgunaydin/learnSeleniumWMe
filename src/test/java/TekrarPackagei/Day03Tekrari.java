package TekrarPackagei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03Tekrari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nltlb\\com.seleniumIlkProje\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //youtube a git
        driver.navigate().to("https://www.youtube.com");
        //youtube arama cubugunu location et.
        WebElement aramaCubugu = driver.findElement(By.name("search_query"));
        aramaCubugu.sendKeys("ebru gundes yaparim bilirsin");
        aramaCubugu.submit();
        //ebru gundesin ilk cikan sarkisini ac
        WebElement yaparimBilirsin = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/ytd-thumbnail/a/yt-img-shadow/img"));
        yaparimBilirsin.click();

    }
    }

