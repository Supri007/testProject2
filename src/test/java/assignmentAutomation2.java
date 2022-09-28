import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class assignmentAutomation2 {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\IdeaProjects\\ClassII\\src\\main\\resources\\executables\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//span[contains(text(),'t Change')]/preceding-sibling::input")).click();
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        System.out.println(driver.findElements(By.cssSelector("div[data-cel-widget='osa_browse_banner_1'] > div:nth-child(2) > div")).size());
        List<WebElement> occEle = driver.findElements(By.cssSelector("div[data-cel-widget='osa_browse_banner_1'] > div:nth-child(2) > div"));
        for (WebElement ele:occEle) {
            WebElement cardType = ele.findElement(By.cssSelector("div > div > a"));
            if(cardType.getAttribute("aria-label").contains("Workplace")){
                cardType.click();
                break;
            }
        }

        System.out.println(driver.findElement(By.cssSelector("div.bxc-grid__image.bxc-grid__image--light > img")).getAttribute("alt"));
    }
}
