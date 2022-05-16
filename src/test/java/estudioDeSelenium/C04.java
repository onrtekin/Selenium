package estudioDeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    /*
1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html
2) Login'e "username" -- Password'a "password" yazin . Sign in button'ına tiklayiniz.
3) Transfer founds butonuna tiklayiniz.
4) From account kismindan herhangi bir(Random'la tıklatın) değer seçiniz.
5) To account kismindan herhangi bir(Random'la tıklatın.) değer seçiniz.
6) Her hangi bir amount giriniz.
7) Her hangi bir description giriniz.
8)Continue butonuna tiklayiniz.
9)Submit butonuna tiklayiniz.
10) "You successfully submitted your transaction" Yazisi gözükmesi gerekiyor.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("username");
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("password");

    }
}
