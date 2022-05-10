package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*
        Class imiza otomasyon icin gerekli olan webdriverin yerini gostermemiz gerekiyor
        bunun icin Java kutuphanesinden System.setProperties() merthodu kullaniriz
        method iki parametre istemektedir
        ilki kullanacagimiz driver:webdriver.chorome.driver
        ikincisi ise bu driverin fiziki yolu:
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        driver.close();




    }

}
