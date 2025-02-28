package GenericUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverUtilities {

    public void maximizeWindow(WebDriver driver)
    {

        driver.manage().window().maximize();

    }

    public void minimizeWindow(WebDriver driver)
    {

        driver.manage().window().minimize();
    }


    public void waitForAllElements(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

//public void enterText(WebDriver driver)
//{
//
//
//
//}


    public void waitForSpecificElement(WebDriver driver, By element)
    {

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));



    }


    public void handleDropDown(WebElement element,String value)
    {
        Select se=new Select(element);
        se.selectByValue(value);

    }

    public void handleDropDownByIndex(WebElement element,int index)

    {
        Select se=new Select(element);
        se.selectByIndex(index);


    }


    public void doubleClickAction(WebDriver driver,WebElement element)
    {

        Actions act=new Actions(driver);
        act.doubleClick(element).perform();

    }

    public void rightClickAction(WebDriver driver,WebElement element)
    {

        Actions act=new Actions(driver);
       act.contextClick(element).perform();

    }

    public void dragAndDrop(WebDriver driver,WebElement src, WebElement dest)

    {

        Actions act=new Actions(driver);
        act.dragAndDrop(src,dest);

    }

    public void acceptAlert(WebDriver driver)
    {

        driver.switchTo().alert().accept();

    }
    public void dismissAlert(WebDriver driver)
    {

        driver.switchTo().alert().dismiss();

    }

    public void sendTextAlert(WebDriver driver,String text)
    {

        driver.switchTo().alert().sendKeys(text);

    }

    public void switchToiFrameByvalue(WebDriver driver,String value)
    {
        driver.switchTo().frame(value);

    }

}
