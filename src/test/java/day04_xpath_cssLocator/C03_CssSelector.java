package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
                   a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
                   b. Locate email textbox
                     c. Locate password textbox ve
                    d. Locate signin button
                     e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement eMailTextBox=driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[placeholder='Password']"));

        WebElement signButton=driver.findElement(By.cssSelector("input[name='commit']"));

        eMailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signButton.click();
        driver.close();

    }
}
