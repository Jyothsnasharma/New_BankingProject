package com.banking.testCases;
import com.banking.WebPages.loginPage;
import com.banking.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginPage_Test extends BaseClass {

    public loginPage lp;


    @Test(priority = 0)
    public void clickLoginButtonTest() throws InterruptedException {
        lp = new loginPage(driver);
        lp.clickLoginButton();
    }

    @Test(priority = 1)

    public void clickAddNewCustomerTest() {
        lp = new loginPage(driver);
        lp.clickAddNewCustomer();
    }
    @Test(priority = 2)
    public void customerNameTest(){
        lp=new loginPage(driver);
        lp.customerName();

    }
    @Test(priority = 3)
    public void genderTest(){
        lp=new loginPage(driver);
        lp.gender();
    }
    @Test(priority = 4)
    public void dateOfBirthTest(){
        lp=new loginPage(driver);
        lp.DateOfBirth();
    }
    @Test(priority = 5)
    public void addressTest(){
        lp=new loginPage(driver);
        lp.address();
    }
    @Test(priority = 6)
    public void cityTest(){
        lp=new loginPage(driver);
        lp.city();
    }
    @Test(priority = 7)
    public void stateTest(){
        lp=new loginPage(driver);
        lp.state();
    }
    @Test(priority = 8)

    public void pinNoTest(){
        lp=new loginPage(driver);
        lp.pinNo();
    }
    @Test(priority = 9)
    public void phoneNoTest(){
        lp=new loginPage(driver);
        lp.PhoneNo();
    }
    @Test(priority = 10)
    public void emailTest(){
        lp=new loginPage(driver);
        lp.email();
    }
    @Test(priority = 11)
   public void clickSubmitTest() {
    lp = new loginPage(driver);
    lp.clickSubmit();
}
}