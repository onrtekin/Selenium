package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmozonSearch {
    public static void main(String[] args) {
        /*
        a.google web sayfasına gidin. https://www. amazon.com/
 b. Search(ara) “city bike”
 c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

 e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com/");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

       List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi=istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        List<WebElement> urunResimleriListesi=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleriListesi.get(0);
        ilkUrunResmi.click();
        driver.close();





    }
}
