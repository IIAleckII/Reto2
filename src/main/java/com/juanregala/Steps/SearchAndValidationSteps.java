package com.juanregala.Steps;

import com.juanregala.Drivers.SeleniumWebDriver;
import com.juanregala.PageObjects.SearchAndVAlidationPages;
import com.juanregala.Utils.Excel;
import com.juanregala.Utils.ImplicitWait;
import com.juanregala.Utils.Scroll;
import com.juanregala.Utils.ScrollsearchValidation;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchAndValidationSteps extends MethodsSeleniumSteps{

    ScrollsearchValidation scrollShort=new ScrollsearchValidation();
    private static ArrayList<Map<String,String>> ReadExcel = new ArrayList<Map<String,String>>();
    ImplicitWait implicitWait=new ImplicitWait();
    SearchAndVAlidationPages searchAndVAlidationPages =new SearchAndVAlidationPages();
    List XpathList=new ArrayList();

    @Step
    public void fillsearchValidate(){
        implicitWait.Wait(60);



        XpathList.add(searchAndVAlidationPages.getFirstProduct());
        XpathList.add(searchAndVAlidationPages.getSecondProduct());
        XpathList.add(searchAndVAlidationPages.getThirdProduct());
        XpathList.add(searchAndVAlidationPages.getFourthProduct());
        XpathList.add(searchAndVAlidationPages.getFifthProduct());


        for (int i=0;i<XpathList.size();i++){
            implicitWait.Wait(60);
            click(searchAndVAlidationPages.getAllGifts());
            scrollShort.scrollDown();
            click((By) XpathList.get(i));

        }
    }

 /*   @Step

    public void Validate(){
        implicitWait.Wait(60);
        try {
            ReadExcel = Excel.readExcel("validar3.xlsx", "Products");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Validation(XpathList, ReadExcel.get(0).get("validations"));
    }
*/
}
