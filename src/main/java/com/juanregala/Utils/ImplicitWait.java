package com.juanregala.Utils;

import com.juanregala.Drivers.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public void Wait(int time){
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
}
