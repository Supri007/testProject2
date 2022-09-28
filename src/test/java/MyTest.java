import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyTest {
    public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver","/Users/suppu/Documents/Intellij/testProject1/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sunscreen");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-3']//span[1]")).click();
        String pageTile = driver.getTitle();
        Assert.assertNotEquals(pageTile, "amazon");

        driver.close();




    }

}
