package estudioDeSelenium;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {
         /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratin ve  Search butonuna tiklayin.

        3) Bu yazinin göründüğünü doğrulayiniz. -> (We've got 223 results for 'teddy bear')
        Not: Bu yazidaki sayi değişiklik gösterebilir. Önemli olan cümle kalibi.

        4) Snepdeal logosuna tiklayiniz.

        5) URL'in bu olduğunu doğrulayin. (https://www.snapdeal.com/)

     */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.snapdeal.com/");
        WebElement search=driver.findElement(By.xpath("//input[@name='keyword'][1]"));
        search.sendKeys("teddy bear");
        WebElement searchButton=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        searchButton.click();
        WebElement actualText=driver.findElement(By.xpath("//span[@class='nnn'][1]"));
        String expectedtext="We've got 223 results for 'teddy bear'";
        System.out.println(actualText.getText());

        if(expectedtext.equals(actualText.getText())){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Text FAILD");
        }

       driver.findElement(By.xpath("//img[@title='Snapdeal'][1]")).click();

        String expectedUrl=driver.getCurrentUrl();
        System.out.println(expectedUrl);

        String actualUrl="https://www.snapdeal.com/";

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Url Testi PASSED");
        }else{
            System.out.println("Url Testi FAILD");
        }



driver.close();


    }
}
