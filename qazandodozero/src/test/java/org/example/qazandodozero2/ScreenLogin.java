package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id ="login_username")
    @iOSFindBy(accessibility ="342342")
    private RemoteWebElement campoemail;

    @AndroidFindBy(id = "login_password")
    @iOSFindBy(accessibility = "342342")
    private RemoteWebElement camposenha;

    @AndroidFindBy(id = "login_button")
    @iOSFindBy(accessibility = "342342")
    private RemoteWebElement botaologar;

    public void logar() {
        campoemail.sendKeys("qazando@gmail.com");
        camposenha.sendKeys("1234");
        botaologar.click();
    }
}







