package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.xml.utils.URI;
import org.aspectj.lang.annotation.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteLogin {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass

    public static void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", new File("apps/app-debug.apk"));
        capabilities.setCapability("deviceName", "ChronosMobile");
        capabilities.setCapability("platformname", "Android");
        capabilities.setCapability("unicodeKeyboard", true);
        driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLogin() {
        ScreenLogin.logar();

   }
}
