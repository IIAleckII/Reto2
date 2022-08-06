package com.juanregala.stepsDefinitions;

import com.juanregala.Drivers.SeleniumWebDriver;
import com.juanregala.PageObjects.SearchAndVAlidationPages;
import com.juanregala.Steps.SearchAndValidationSteps;
import com.juanregala.Utils.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchesAndValidationsStepDef {
    private static ArrayList<Map<String, String>> ReadExcel = new ArrayList<Map<String, String>>();
    SearchAndValidationSteps searchAndValidationSteps =new SearchAndValidationSteps();
    @Given("^i am on juanregala's Home website$")
    public void iAmOnJuanregalaSWebsite() {
        try{
            ReadExcel= Excel.readExcel("Reto1_Search.xlsx","URL");
        }catch (IOException e){e.printStackTrace();}
        SeleniumWebDriver.chromeDriver(ReadExcel.get(0).get("Link page"));

    }

    @When("^i want to select five articles and i want to validate every one of these articles$")
    public void iWantToSelectFiveArticlesAndIWantToValidateEveryOneOfTheseArticles() {
    searchAndValidationSteps.fillsearchValidate();
    }

    @Then("^i got all the articles$")
    public void iGotAllTheArticles() {
    SeleniumWebDriver.driver.close();
    }
}
