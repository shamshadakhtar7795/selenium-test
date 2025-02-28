import GenericUtilities.baseClass;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class seleniumFirstProgram extends baseClass {


    public static void main(String args[]) throws InterruptedException, IOException {

        seleniumFirstProgram sf= new seleniumFirstProgram();
        sf.browserConfig();





//       EdgeDriver driver = new EdgeDriver();

        // to maxi. the browser
//        driver.get("https://www.tesco.com/groceries/en-GB/search?query=milk&inputType=free+text");
//       driver.get("https://demo.guru99.com/test/upload/");
//        driver.get("https://demo.guru99.com/test/drag_drop.html");//enter the url
//        String str = driver.getCurrentUrl();
//        System.out.println(str);
//
//        driver.findElement(By.id("autocomplete")).sendKeys("hello");
//        WebElement element = driver.findElement(By.xpath("//input[@value='radio1']"));
//      ele.click();
//
//   List<WebElement> elements=  driver.findElements(By.name("radioButton"));
//
//
//for(int i=0;i<elements.size();i++)
//{
//
//   elements.get(i).click();
//}
//
////Select se=new Select(driver.findElement(By.xpath("//select[@id='sortBy']")));
//
////se.selectByIndex(1);
////se.selectByVisibleText("Price: Low to High");
////
////
//driver.findElement(By.id("checkBoxOption2")).click();
//
////JavascriptExecutor js= (JavascriptExecutor) driver;
////js.executeScript("window.scrollBy(0,1200)","");
////
////
////
////Actions ac=new Actions(driver);
////ac.moveToElement(driver.findElement(By.id("mousehover"))).click().perform();
//
//
////WebElement src=driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
////WebElement dist=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
////ac.dragAndDrop(src,dist))).click().perform();
////driver.findElement(By.linkText("Top")).click();
////
////
////
////
////
////List<WebElement> linksElements=driver.findElements(By.tagName("a"));
////
////System.out.println(linksElements.size());
//
//
//
//driver.findElement(By.id("confirmbtn")).click();
//Thread.sleep(3000);
//System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(3000);
//    driver.switchTo().alert().accept();
//
//
//
//List<WebElement> rowsSize=driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']/tbody/tr"));
//
//int sum=0;
//
//for(int i=1;i<=rowsSize.size();i++)
//{
//String num=driver.findElement(By.xpath("//div[@class='tableFixHead']/table[@id='product']/tbody/tr["+i+"]/td[4]")).getText();
//int num1=Integer.parseInt(num);
//
//sum=sum+num1;
//
//}
//
//String expectedValue=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
//
//
//
//
//
//
//
//
//// div[@class='tableFixHead']/table[@id='product']/tbody/tr/td[4]
//
//

//
//        driver.get("https://demo.guru99.com/test/upload/");
//
//
//driver.findElement(By.id("uploadfile_0")).sendKeys("C://Users//shams//automation course.txt");
//driver.findElement(By.id("terms")).click();
//driver.findElement(By.id("submitbutton")).submit();

//        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
//
//
//        WebDriver driver = new EdgeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/") ;
//        driver.manage().window().maximize();
//List<WebElement> products=driver.findElements(By.xpath("//button[@type='button']"));
////products.get(0).click();
//       products.get(1).click();
//        products.get(2).click();
//        products.get(3).click();
//
//
//        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//
//        driver.findElement(By.className("promoCode")).sendKeys("test12");
//
//        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//
//
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Invalid code ..!')]")));
//
//       String errorMsg= driver.findElement(By.xpath("//span[contains(text(),'Invalid code ..!')]")).getText();
//System.out.println("Error message"+errorMsg);



//        driver.get("https://demo.guru99.com/test/guru99home/");
//       WebElement ele= driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
//ele.click();
//        String parentWindow=driver.getWindowHandle();
//        System.out.println("parentWindow"+parentWindow);
//
//       Set<String> s=driver.getWindowHandles();
//
// Iterator<String> it1= s.iterator();
//
// while(it1.hasNext())
// {
//  String id=  it1.next();
//
//  if(!parentWindow.equals(id))
//  {
//      driver.switchTo().window(id);
//      driver.close();
//
//  }
//
// }
//
//driver.switchTo().window(parentWindow);
//



//        driver.switchTo().frame("a077aa5e");
//        driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']")).click();

   }
}