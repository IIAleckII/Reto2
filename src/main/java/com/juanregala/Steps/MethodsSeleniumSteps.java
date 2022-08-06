package com.juanregala.Steps;

import com.juanregala.Drivers.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static  org.junit.Assert.assertEquals;

public class MethodsSeleniumSteps {
    public void click(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).click();
    }
    public void clear(By localizador){

        SeleniumWebDriver.driver.findElement(localizador).clear();
    }
    public void write(By localizador,String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto);
    }
    public void writeAndEnter(By localizador,String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);
    }
    public void getElement(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).getLocation();
    }

    //------------------------------------------------


    public String GetTextElement(By localizador){
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }
    public void Validation(By localizador, String texto){
        assertEquals(GetTextElement(localizador),texto);
    }
}
