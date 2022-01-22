package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_TekrarTesti {
    public static void main(String[] args) {

        //7- Birthday butonuna basin
        //8- Best Seller bolumunden ilk urunu tiklayin
        //9- Gift card details’den 25 $’i  secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //10-Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String Title = driver.getTitle();
        if(Title.contains("Spend less")){
            System.out.println("Title Test PASS");}else{System.out.println("Title Test FAILED");}
    WebElement Gift= driver.findElement(By.linkText("Gift Cards"));
        Gift.click();
        //7- Birthday butonuna basin

        driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Apple Gift Card - App Store, iTunes, iPhone, iPad, AirPods, MacBook, accessories and more (Email Delivery)'])[1]")).click();
        //9- Gift card details’den 25 $’i  secin
        driver.findElement(By.id("gc-mini-picker-amount-1")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucret = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        if(ucret.getText().equalsIgnoreCase("$25.00")){
            System.out.println("value test PASS");
        }else{
            System.out.println("value test FAILED");}
        //10-Sayfayi kapatin
driver.close();

    }
}
