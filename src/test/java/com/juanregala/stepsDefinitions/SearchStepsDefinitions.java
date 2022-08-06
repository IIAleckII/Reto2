package com.juanregala.stepsDefinitions;

import com.juanregala.Drivers.SeleniumWebDriver;
import com.juanregala.Steps.SearchSteps;
import com.juanregala.Utils.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class SearchStepsDefinitions {

    @Steps
    SearchSteps searchSteps=new SearchSteps();
    private static ArrayList<Map<String, String>> ReadExcel = new ArrayList<Map<String, String>>();

    @Given("^i am on juanregala's website$")
    public void iAmOnJuanregalaSWebsite() {
        try{
            ReadExcel= Excel.readExcel("Reto1_Search.xlsx","URL");
        }catch (IOException e){e.printStackTrace();}
        SeleniumWebDriver.chromeDriver(ReadExcel.get(0).get("Link page"));
    }

    @When("^i want to look for two articles$")
    public void iWantToLookForArticles() {
        searchSteps.Searches();
    }

    @Then("^i use the search bar and the page gives me the results$")
    public void iUseTheSearchBarAndThePageGivesMeTheResults() {
        SeleniumWebDriver.driver.close();
    }
}
