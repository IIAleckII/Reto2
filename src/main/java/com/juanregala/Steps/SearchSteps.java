package com.juanregala.Steps;

import com.juanregala.PageObjects.SearchPages;
import com.juanregala.Utils.Excel;
import com.juanregala.Utils.ImplicitWait;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class SearchSteps extends MethodsSeleniumSteps{
    SearchPages searchPages =new SearchPages();
    private static ArrayList<Map<String,String>> ReadExcel = new ArrayList<Map<String,String>>();
    ImplicitWait implicitWait=new ImplicitWait();

    @Step
    public void Searches() {
        implicitWait.Wait(60);
        try {
            ReadExcel = Excel.readExcel("Reto1_Search.xlsx", "ProductsToSearch");
        } catch (IOException e) {
            e.printStackTrace();
        }
        click(searchPages.getBtnClickMedellin());

        for (int i = 0; i < ReadExcel.size(); i++) {
            click(searchPages.getBtnSearch());
            writeAndEnter(searchPages.getTxtSearch(), ReadExcel.get(i).get("search"));
            click(searchPages.getBtnSearch());
            clear(searchPages.getTxtSearch());
        }
    }
}
