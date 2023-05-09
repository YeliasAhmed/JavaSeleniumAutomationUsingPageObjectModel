package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatePage {

  public WebDriver driver;

    By signBtn = (By.xpath("//a[normalize-space()='Sign in']"));
    By createEmailField = (By.xpath("//input[@id='email_create']"));
    By createBtn = (By.xpath("//span[normalize-space()='Create an account']"));

    By genderTitle = (By.xpath("//input[@id='id_gender1']"));
    By firstName = (By.xpath("//input[@id='customer_firstname']"));
    By lastName = (By.xpath("//input[@id='customer_lastname']"));
    By password = (By.xpath("//input[@id='passwd']"));
    By days = (By.xpath("//select[@id='days']"));
    By months = (By.xpath("//select[@id='months']"));
    By years = (By.xpath("//select[@id='years']"));
    By register = (By.xpath("//button[@id='submitAccount']"));




    public CreatePage(WebDriver driver){
        this.driver = driver;
    }


    public WebElement getSignBtn(){
        return driver.findElement(signBtn);
    }
    public WebElement getCreateEmailField(){
        return driver.findElement(createEmailField);
    }
    public WebElement getCreateButton(){
        return driver.findElement(createBtn);
    }
    public WebElement getGenderTitle(){
        return driver.findElement(genderTitle);
    }
    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }
    public WebElement getLastName(){
        return driver.findElement(lastName);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public void getDays(){
        Select select  = new Select(driver.findElement(days));
        select.selectByValue("5");

    }
    public void getMonths(){
        Select select  = new Select(driver.findElement(months));
        select.selectByValue("5");

    }
    public void getYears(){
        Select select  = new Select(driver.findElement(years));
        select.selectByValue("2000");
    }
    public WebElement getRegister(){
        return driver.findElement(register);
    }

}
