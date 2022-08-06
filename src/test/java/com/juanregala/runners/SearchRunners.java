package com.juanregala.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.juanregala.features/1Searchjuanregala.feature",
        glue = "com.juanregala.stepsDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class SearchRunners {
}
