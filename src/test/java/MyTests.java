import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyTests {


    private static final Logger log = LoggerFactory.getLogger(MyTests.class);
    private WebDriver driver;

    @BeforeClass
    private void browser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mind-wend-913065.framer.app/");
    }

//    @AfterClass
//    private void closeWindow(){
//        driver.quit();
//    }

    @Test

    private void signIn() {
        // click Sign in button
        driver.findElement(By.className("framer-xkblh5")).click();
        // fill email field
        driver.findElement(By.className("framer-formspark-input")).sendKeys("test@test.com");
        // fill password field
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123456");
        // click Sign up button
        driver.findElement(By.xpath("(//input[@value='Sign Up'])[1]")).click();
    }
       @Test

        private void discordButton(){
        Actions act = new Actions(driver);
        act.scrollByAmount(0,6000).perform();
        driver.findElement(By.xpath("//span[contains(text(),'Discord')]")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//span[normalize-space()='Terms']")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Terms");
    }

    @Test
    private void youtubeButton(){
        Actions act = new Actions(driver);
        act.scrollByAmount(0,6000).perform();
        driver.findElement(By.xpath("//span[contains(text(),'YouTube')]")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//span[normalize-space()='Terms']")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Terms");
    }

    @Test
    private void instagramButton(){
        Actions act = new Actions(driver);
        act.scrollByAmount(0,6000).perform();
        driver.findElement(By.xpath("//span[contains(text(),'instagram')]")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//span[normalize-space()='Terms']")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Terms");
    }

    @Test
    private void watchVideoButton(){
        driver.findElement(By.xpath("//span[contains(text(),'Watch video')]")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//span[normalize-space()='Mix 3D and 2D design with Framer']")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Mix 3D ");

    }

    @Test
    private void tryForFreeButtonInPricingPage(){
        driver.findElement(By.cssSelector("div[class='framer-1g3amks-container'] span")).click();
        Actions act = new Actions(driver);
        act.scrollByAmount(0,100).perform();
        driver.findElement(By.className("framer-4udfv4")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//body/div[@id='main']/div[1]/div[1]/div[2]/div[2]/h1[1]")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Pricing");
    }

    @Test
    private void madeInFramerButton(){

        driver.findElement(By.xpath("//div[@aria-label='Custom site builder']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        boolean isDisplayed = driver.findElement(By.tagName("h1")).isDisplayed();
        Assert.assertTrue(isDisplayed,"The web builder for stunning sites.");
    }

    @Test
    private void getAppButtonInTextStypesSection(){
        driver.findElement(By.cssSelector("div[class='framer-18nx703'] span[class='framer-text']")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//span[normalize-space()='Text styles, variants and overlays']")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Text styles, variants and overlays");
    }








    }







