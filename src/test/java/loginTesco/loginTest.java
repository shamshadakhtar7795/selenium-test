package loginTesco;

import GenericUtilities.WebDriverUtilities;
import GenericUtilities.baseClass;
import objectRepository.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends baseClass {

WebDriverUtilities ul=new WebDriverUtilities();

  @Test(invocationCount = 5)
        public void verifySuccessfulLogin() throws InterruptedException {
//        loginPage lp = new loginPage(driver);
//        ul.maximizeWindow(driver);
//
//            lp.login("clubcardtesting9@gmail.com","Clubcard@456");
//      Assert.assertTrue(false);
      System.out.println("LoginPage");


   

        }


    @Test(enabled = false)
        public void homePageTest()
        {

            System.out.println("HomePage");
        }
    @Test(enabled = false)
    public void addToCartTest()
    {

        System.out.println("AddToCartPage");
    }

    }


