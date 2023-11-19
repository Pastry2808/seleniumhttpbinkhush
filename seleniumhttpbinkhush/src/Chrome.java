import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://httpbin.org/#/");
        String titleOfPage = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        System.out.println(titleOfPage);
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
