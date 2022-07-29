import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.net.URL;

public class appium {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
//
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
//        UiAutomator2Options Options = new UiAutomator2Options();
//        Options.setApp("D:\\Iqra Project\\Intrduction\\src\\main\\resources\\ApiDemos-debug.apk");
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Options);
//        driver.quit();
        File f = new File("D:\\Iqra Project\\Intrduction\\src\\main\\resources\\ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        cap.setCapability("app",f);
        AndroidDriver driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), cap);


    }
}