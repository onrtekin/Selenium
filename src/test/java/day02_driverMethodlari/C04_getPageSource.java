package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        //amazon sitesine gidip kaynak kodlarinda "Gateway" yazdigini test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String sayfaKaynakKodlari=driver.getPageSource();// getPageSource() sayfanin kaynak kodlarini verir
        String arananKelime="Gateway";
        if(sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak Kodu Testi PASSED");
        }else{
            System.out.println("Kaynak Kodlarinda "+arananKelime+" yok, Test FAILED");
        }


        driver.close();
    }
}
