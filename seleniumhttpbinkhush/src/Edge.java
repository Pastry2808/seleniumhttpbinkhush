import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://httpbin.org/#/");
        String titleOfPage = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        System.out.println(titleOfPage);
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
}
