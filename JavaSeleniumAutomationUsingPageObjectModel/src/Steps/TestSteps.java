package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreatePage;

import java.time.Duration;



public class TestSteps {

         WebDriver driver;
         CreatePage createPage;

       @BeforeTest
       public void setup(){
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("http://automationpractice.pl/");
       }

       @Test(priority = 0)
       public void Sign() throws InterruptedException {

             createPage = new CreatePage(driver);

             createPage.getSignBtn().click();
             Thread.sleep(2000);
             createPage.getCreateEmailField().sendKeys("abcd20@test.com");
             createPage.getCreateButton().click();



       }
       @Test(priority = 1)
       public void FormPage() throws InterruptedException {
           createPage.getGenderTitle().click();
           createPage.getFirstName().sendKeys("Hasib");
           createPage.getLastName().sendKeys("Hasan");
           createPage.getPassword().sendKeys("123456");
           createPage.getDays();
           createPage.getMonths();
           createPage.getYears();
           createPage.getRegister().click();
           Thread.sleep(4000);

       }

       @AfterTest
       public void driverClose(){
           driver.close();
       }
    }

