package pratctice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(5000);
        driver.findElement(By.id("cookieChoiceDismiss")).click();




        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("markus");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='exp-6']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("2022");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        driver.findElement(By.xpath("//button[@id='submit'")).click();













    }
}
