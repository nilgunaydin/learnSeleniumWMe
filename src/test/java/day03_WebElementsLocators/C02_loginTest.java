package day03_WebElementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_loginTest {

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a. http://a.testaddressbook.com adresine gidiniz.

        driver.navigate().to("http://a.testaddressbook.com");

        //    b. Sign in butonuna basin

        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        WebElement emailtextbox = driver.findElement(By.id("session_email"));
        WebElement passwordtextbox = driver.findElement(By.id("session_password"));
        WebElement signinbutton = driver.findElement(By.name("commit"));

        //    Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //    Username : testtechproed@gmail.com Password : Test1234!

        emailtextbox.sendKeys("testtechproed@gmail.com");
        passwordtextbox.sendKeys("Test1234!");

        signinbutton.click();

        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).


        WebElement girisYazisiElementi=driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());
        String actualGirisYazisi= girisYazisiElementi.getText();
        String expectedGirisYazisi="Welcome to Address Book";
        if (actualGirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Sayfaya giris testi PASS");
        }else{
            System.out.println("sayfaya giris testi FAILED");
        }

        //    f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement addresses=driver.findElement(By.linkText("Addresses"));
        WebElement sign_out = driver.findElement(By.linkText("Sign out"));
        if(addresses.isDisplayed()){
            System.out.println("displayed test PASS");
        }else{
            System.out.println("displayed test FAILED");
        }
        if(sign_out.isDisplayed()){
            System.out.println("sign_out test PASS");
        }else{
            System.out.println("sign_out test FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linklerListesi.size() + " adet link bulunmaktadir");
        driver.quit();
}}
