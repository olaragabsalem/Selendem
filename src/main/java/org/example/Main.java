package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws InterruptedException {
      //WebDriverManager.chromedriver().driverVersion("137.0.7151.41").setup();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicitwait

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        Thread.sleep(3000);

        addItems(driver,itemsNeeded);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

      //  w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("button.promoBtn")).click();

//explicit wait



      //  w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

















        // driver.findElement(By.cssSelector("textarea[aria-autocomplete='both']")).sendKeys("egypt");
      //  
//        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
//        driver.findElement(By.className("signInBtn")).click();
//       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.findElement(By.tagName("p")).getText());
//
//
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");

//        WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select dropdown =new Select(staticDropdown);
//        dropdown.selectByValue("USD");
        //dropdown.selectByIndex(3);



    }


    public static  void addItems(WebDriver driver,String[] itemsNeeded)

    {

        int j=0;

        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));


        for(int i=0;i<products.size();i++)


        {


//Brocolli - 1 Kg

//Brocolli,    1 kg

            String[] name=products.get(i).getText().split("-");

            String formattedName=name[0].trim();


//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-


            List itemsNeededList = Arrays.asList(itemsNeeded);



            if(itemsNeededList.contains(formattedName))

            {


                j++;

//click on Add to cart

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();


                if(j==itemsNeeded.length)

                {

                    break;

                }





            }

        }

    }




}


