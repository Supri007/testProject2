import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentAutomation {
    public static void main(String[] args) throws InterruptedException{
        //for chrome
        System.setProperty("webdriver.chrome.driver", "/Users/suppu/Documents/Intellij/testProject1/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.get("http://www.amazon.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //click on Today's deals tab
        driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']" )).click();

        //click on Amazon services check box
        driver.findElement(By.cssSelector("div[class=\"DealCard-module__card_1u9yKYV4EIA-fL4ibeMVIU DealCard-module__cardWithoutActionButton_1K_FldevdoXxE8uy5pzBmr\"]  > a[href='https://www.amazon.com/deal/b666e81f?ref=dlx_deals_gd_dcl_tlt_5_b666e81f_dt_sl15_33']")).click();

        driver.findElement(By.cssSelector("div[class='a-section octopus-dlp-asin-title'] > a[href='/Fire-Tablet-7/dp/B07FKR6KXF?ref_=Oct_DLandingS_D_b666e81f_60&smid=ATVPDKIKX0DER']")).click();

        driver.findElement(By.cssSelector("span[id='acrCustomerReviewText']")).click();

        Thread.sleep(5000);

        //close browser
        driver.close();

    }
}
