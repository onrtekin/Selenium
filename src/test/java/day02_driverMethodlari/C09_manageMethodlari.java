package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        /*
        ilerde wait konusunu daha genis ele alacagiz
        bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir yuklenme suresine ihtiyac
        vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac vardir
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek max sureyi belirleme
        olanagi tanir

         */
        driver.close();

    }
}
