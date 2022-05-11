package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");


        //amazona gidip nutella aratalim

        //findelement (By......locator)--> istedigimiz webelementini bize dondurur bizde o webelementini
        //kullanmak icin bir objeye assign ederiz
       //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));

/*
<input type="text" id="twotabsearchtextbox"
value="" name="field-keywords" autocomplete="off" placeholder=""
class="nav-input nav-progressive-attribute"
dir="auto" tabindex="0" aria-label="Search">
 */

        //herhangi bir webelementine istedigimiz yaziyi yollamak istersek

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);



    }
}
