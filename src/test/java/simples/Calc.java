package simples;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calc {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("browserName", "");
        desiredCapabilities.setCapability("appiumVersion", "1.19.2");
        desiredCapabilities.setCapability("deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator");
        desiredCapabilities.setCapability("deviceOrientation", "portrait");
        desiredCapabilities.setCapability("app", "storage:filename=Calculator_v7.8 (271241277)_apkpure.com.apk");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("SAUCE_USERNAME", "aluno01teste01");
        desiredCapabilities.setCapability("SAUCE_ACCESS_KEY", "8716cc6c-bdb8-43a6-8a4e-154540662956");

        URL remoteUrl = new URL("https://aluno01teste01:8716cc6c-bdb8-43a6-8a4e-154540662956@ondemand.us-west-1.saucelabs.com:443/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_3");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
        el5.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}