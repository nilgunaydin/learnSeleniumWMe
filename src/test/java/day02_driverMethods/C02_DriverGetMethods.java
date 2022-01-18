package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        //driver.getTitle();// bize string bir ifade dondurur sayfanın title'ni getirir
        System.out.println( driver.getTitle());//Amazon.com. Spend less. Smile more.
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/ sayfanin adresini getirir
        System.out.println(driver.getWindowHandle()); // CDwindow-89E8BBD531F0AC56E3F15F66FB780751 her bir sayfa icin chrome'in urettigi benzersiz bir sayidir
        System.out.println(driver.getPageSource());

    }
}