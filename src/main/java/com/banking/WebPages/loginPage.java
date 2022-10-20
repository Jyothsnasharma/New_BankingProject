package com.banking.WebPages;

import com.banking.utilities.ReadConfig;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loginPage {

   public ReadConfig rc;
        WebDriver driver;
        public loginPage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver,this);

        }


    @FindBy(how= How.XPATH,using = "//input[@name='uid']")
    WebElement userid;

    @FindBy(how=How.NAME,using = "password")
    WebElement password;

    @FindBy(how=How.NAME,using = "btnLogin")
    WebElement logInButton;

    //Validation Locators
    @FindBy(how=How.XPATH,using = "//h2[@class='barone']")
    WebElement bankTitle;
    @FindBy(how=How.XPATH,using = "//a[@href='Logout.php']")
    WebElement logOutBtn;



    //New Customer Locators
    @FindBy(how=How.XPATH,using = "//a[@href='addcustomerpage.php']")
    WebElement newCustomerBtn;
    @FindBy(how=How.XPATH,using = "//input[@type='submit']")
    WebElement submitBtn;
    @FindBy(how=How.XPATH,using = "//p[@class='heading3']")
    WebElement newCustomerTitle;
    @FindBy(how=How.NAME,using = "name")
    WebElement customerName;
    @FindBy(how=How.XPATH,using = "//input[@name='rad1'][2]")
    WebElement gender;

    @FindBy(how=How.NAME,using = "dob")
    WebElement dob;
    @FindBy(how=How.NAME,using = "addr")
    WebElement address;

    @FindBy(how=How.NAME,using = "city")
    WebElement city;
    @FindBy(how=How.NAME,using = "state")
    WebElement state;

    @FindBy(how=How.NAME,using = "pinno")
    WebElement pinNo;

    @FindBy(how=How.NAME,using = "telephoneno")
    WebElement phoneNo;
    @FindBy(how=How.XPATH,using = "//input[@maxlength='30']")
    WebElement  eMailId;
        public void clickLoginButton() throws InterruptedException {
            rc= new ReadConfig();
            userid.sendKeys(rc.getUserName());
            password.sendKeys(rc.getPassword());
            logInButton.click();
            Thread.sleep(20000);
            Assert.assertTrue(bankTitle.isDisplayed());
            Assert.assertTrue(logOutBtn.isDisplayed());

            //Alert  alert=driver.switchTo().alert();
            //alert.dismiss();

        }

        public void clickAddNewCustomer(){
            newCustomerBtn.click();
            WebDriverWait wait=new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(submitBtn));

           // ExpectedConditions  ec=new ExpectedConditions();
          //  ec.wait().
            Assert.assertTrue(submitBtn.isDisplayed());
            Assert.assertEquals(newCustomerTitle.getText(),"Add New Customer");
            //Alert  alert=driver.switchTo().alert();
            //alert.dismiss();
        }

        public void customerName()
        {
        customerName.sendKeys("Jyothsna Devi");
        }
        public void gender(){
            gender.click();
        }
        public void DateOfBirth(){
            dob.sendKeys("04/12/1987");
        }
        public void address(){
            address.sendKeys("Henrico, VA");
        }
        public void city(){
            city.sendKeys("Richmond");
        }
        public void state(){
            state.sendKeys("VA");
        }
        public void pinNo(){
            pinNo.sendKeys("202344");
        }
        public void PhoneNo(){
            phoneNo.sendKeys("4565654321");
        }
        public void email(){
            eMailId.sendKeys("abc@gmail.com");
        }
        public void clickSubmit(){
            submitBtn.click();
        }


}
