package com.juanregala.Steps;


import com.juanregala.PageObjects.SearchPages;
import com.juanregala.PageObjects.ValidationPages;
import com.juanregala.Utils.Excel;
import com.juanregala.Utils.ImplicitWait;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidationSteps extends MethodsSeleniumSteps{
    ValidationPages validationPages =new ValidationPages();



    private static ArrayList<Map<String,String>> ReadExcel = new ArrayList<Map<String,String>>();

    ImplicitWait implicitWait=new ImplicitWait();

    @Step
    public void SelectCategory(){
        click(validationPages.getCatergory1());
    }

    @Step
    public void SelectProductFlores(){
        click(validationPages.getProductFlores());

    }

    @Step
    public void ValidatingData(){
        implicitWait.Wait(60);
        try {
            ReadExcel = Excel.readExcel("ProductValidation.xlsx", "ProductValidation");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Validation(validationPages.getLblProductName(), ReadExcel.get(0).get("TextToValidate"));
    }
}
