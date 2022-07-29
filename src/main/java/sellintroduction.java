import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sellintroduction {
    public static void main(String[] args){

        //invoking Browser
// Firefox
        //System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
       // WebDriver driver1 = new FirefoxDriver();

// Microsoft Edge
       // System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
        //WebDriver driver2 = new EdgeDriver();
// Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://rahulshettyacademy.com/");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.close();

    }
}
