    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
    import org.testng.Assert;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;
    import java.time.Duration;


    public class FramerTests {

        private WebDriver driver;

        @BeforeClass
        private void browser(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://mind-wend-913065.framer.app/");
        }

//        @AfterClass
//        private void closeWindow(){
//            driver.quit();
//        }
//
            @Test
            //  display dollar symbol on "Pricing" page products
            private void dollarSymbol(){
            // click Pricing button
            driver.findElement(By.cssSelector("div[class='framer-1g3amks-container'] span")).click();
            // validating test is in Pricing page
            boolean isEnabled = driver.findElement(By.tagName("span")).isDisplayed();
            Assert.assertTrue(isEnabled,"Pricing");
            // validating "$" exist in "Pricing" page
            boolean isDisplayed = driver.findElement(By.xpath("//span[contains(text(), '$')]\n")).isEnabled();
            Assert.assertTrue(isDisplayed,"$");
        }

        @Test
         // Display "visit" button on each card in the "Many types of components to customize" section
         private void visitButtonDisplayed(){
          //   scroll down to "Many types of components to customize" section
            Actions act = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            act.scrollByAmount(0,1800).perform();


           //  validating "Lac Superieur" "Visit" button
            boolean isEnabled = driver.findElement(By.tagName("div")).isDisplayed();
            Assert.assertTrue(isEnabled,"Button");

            // validating "Coit Tower" "Visit" button
            boolean isDispleyed = driver.findElement(By.tagName("div")).isDisplayed();
            Assert.assertTrue(isDispleyed,"Button");

            // validating "Netherlands" "Visit" button
            boolean isEnabled1 = driver.findElement(By.tagName("div")).isDisplayed();
            Assert.assertTrue(isEnabled1,"Button");


            boolean isEnabled2 = driver.findElement(By.tagName("div")).isDisplayed();
            Assert.assertTrue(isEnabled2,"Button");
        }


        @Test
          //Display the "Updates" page after clicking the "Upgrade" button
        private void upgradeButtonClick(){
            //  click Upgrades button
            driver.findElement(By.xpath("(//div[@class='framer-1gmmtpa rich-text-wrapper'])[3]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }



        @Test
            // Does display 3d animation after clicking on "click to view in 3d" button
             private  void animationIsDisplayed(){
            // moving mouse to show up 3d button
             Actions act = new Actions(driver);
            act.moveByOffset(10,100).perform();
            // click 3d button
            driver.findElement(By.xpath("//span[normalize-space()='Click to view in 3D']")).click();
            boolean isDisplayed = driver.findElement(By.xpath("//span[normalize-space()='Mix 3D and 2D design with Framer']")).isDisplayed();
            Assert.assertTrue(isDisplayed,"Mix 3D ");
        }























    }
