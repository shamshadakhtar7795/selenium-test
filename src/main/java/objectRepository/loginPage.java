package objectRepository;

import GenericUtilities.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage  {


    @FindBy(xpath = "//input[@type='email']")//Webelement ele=driver.findElement(By.xpath("");
   private WebElement emailAddressTextBox;

    @FindBy(xpath = "//input[@type='password']")
  private  WebElement passwordTextBox;


@FindBy(xpath = "//button[@id='signin-button']")
    private WebElement singInButton;

    public WebElement getEmailAddressTextBox() {
        return emailAddressTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public WebElement getSingInButton() {
        return singInButton;
    }


    public loginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }





    public void login(String emailAddress,String password) throws InterruptedException {
        Thread.sleep(3000);
        emailAddressTextBox.sendKeys(emailAddress);
Thread.sleep(3000);
        passwordTextBox.sendKeys(password);
        Thread.sleep(3000);
        singInButton.submit();
    }


}
