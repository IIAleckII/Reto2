package com.juanregala.Utils;

import com.juanregala.Drivers.SeleniumWebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
    ImplicitWait implicitWait =new ImplicitWait();

    public void scrollDown(){
        implicitWait.Wait(60);
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        jse.executeScript("window.scrollBy(0,600);");
    }
}

