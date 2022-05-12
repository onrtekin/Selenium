package estudioDeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

        6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1) Bu siteye gidin. -> https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

        //2) Username kısmına "ttechno@gmail.com" girin.
        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        Thread.sleep(1000);

        //3) Password kısmına "techno123." girin
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        Thread.sleep(1000);

        //4) "Sign in" buttonunan tıklayınız.
        WebElement signInButonu=driver.findElement(By.id("log-in"));
        signInButonu.click();

        Thread.sleep(2000);

        //5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        String actuelText=driver.findElement(By.id("time")).getText();
        String expectedText="Your nearest branch closes in: 30m 5s";
        if(expectedText.equals(actuelText)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
Thread.sleep(2000);
        driver.quit();







    }
}
