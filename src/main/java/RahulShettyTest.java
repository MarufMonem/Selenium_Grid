import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RahulShettyTest {
    @Test
    public void HomePageCheck() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
//        Another format
//        caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.106:4444"),caps); //the hub URL and caps basically passes the requirements
//        Then this goes to the distributor checks which machine can run chrome
        driver.get("https://rahulshettyacademy.com/");
        driver.findElement(By.name("q")).sendKeys("Anik");
        System.out.println(driver.getTitle());
        driver.close();

    }

}
