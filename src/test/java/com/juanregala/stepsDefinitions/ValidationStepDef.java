package com.juanregala.stepsDefinitions;

import com.juanregala.Drivers.SeleniumWebDriver;
import com.juanregala.Steps.ValidationSteps;
import com.juanregala.Utils.Excel;
import com.juanregala.Utils.Scroll;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidationStepDef {

    ValidationSteps validationSteps=new ValidationSteps();
    Scroll scroll=new Scroll();
    private static ArrayList<Map<String, String>> ReadExcel = new ArrayList<Map<String, String>>();
    @Given("^i am on juanregala's website in categories section$")
    public void iAmOnJuanregalaSWebsiteInCategoriesSection() {
        try{
            ReadExcel= Excel.readExcel("Reto1_Search.xlsx","URL");
        }catch (IOException e){e.printStackTrace();}
        SeleniumWebDriver.chromeDriver(ReadExcel.get(0).get("Link page"));
    }

    @When("^i want to verify if my articles are  correct$")
    public void iWantToVerifyIfMyArticlesAreCorrect() {
       scroll.scrollDown();
       validationSteps.SelectCategory();
       scroll.scrollDown();
       scroll.scrollDown();
       validationSteps.SelectProductFlores();
       validationSteps.ValidatingData();
    }

    @Then("^all the articles are correct$")
    public void allTheArticlesAreCorrect() {
        SeleniumWebDriver.driver.close();
    }

}
