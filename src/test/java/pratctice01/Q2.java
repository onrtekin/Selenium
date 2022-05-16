package pratctice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    //  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
//  8-Ardindan "gittigidiyor.com" adresine gidelim
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
//  10-Bi onceki web sayfamiza geri donelim
//  11-sayfayi yenileyelim
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sahibinden.com");
        Thread.sleep(2000);
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        if(title.contains("Oto")&&(url.contains("Oto"))){
            System.out.println("Oto yazisi vardir");
        }else{
            System.out.println("Oto yazisi yoktur");
        }
        driver.get("https://www.gittigidiyor.com");
        Thread.sleep(2000);
        String gidiyorTitle=driver.getTitle();
        System.out.println(gidiyorTitle);
        boolean isTrue=gidiyorTitle.contains("Sitesi");
        if(isTrue){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();
        driver.quit();


    }
}
