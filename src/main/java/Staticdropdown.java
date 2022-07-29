import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Staticdropdown {

        public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

            String name = "rahul";

            System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.spicejet.com/");


            driver.findElement(By.id("divpaxinfo")).click();

   Thread.sleep(2000L);

   /*int i=1;

while(i<5)

{

driver.findElement(By.id("hrefIncAdt")).click();//4 times

i++;

}*/

   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

for(int i=1;i<5;i++)

    {

        driver.findElement(By.id("hrefIncAdt")).click();

    }

driver.findElement(By.id("btnclosepaxoption")).click();

Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        }
}

