package com.juanregala.PageObjects;

import com.juanregala.Utils.Excel;
import com.juanregala.Utils.ImplicitWait;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class SearchAndVAlidationPages {
private By thirdProduct=new By.ByXPath("(//a[@href=\"https://juanregala.com.co/medellin/tienda/desayuno-sorpresa-para-mujer/\"])[1]");
private By secondProduct=new By.ByXPath("(//a[@href=\"https://juanregala.com.co/medellin/tienda/desayuno-de-cumpleanos/\"])[2]");
private By firstProduct=new By.ByXPath("(//a[@href=\"https://juanregala.com.co/medellin/tienda/desayuno-sorpresa-para-hombre/\"])[2]");

private By FourthProduct=new By.ByXPath("(//a[@href=\"https://juanregala.com.co/medellin/tienda/mini-desayuno-de-cumpleanos/\"])[2]");

private By FifthProduct=new By.ByXPath("(//a[@href=\"https://juanregala.com.co/medellin/tienda/desayuno-tentacion/\"])[2]");
private By AllGifts=new By.ByXPath("(//a[@href=\"https://juanregala.com.co/medellin/tienda/\"])[1]");


    public By getThirdProduct() {
        return thirdProduct;
    }

    public By getSecondProduct() {
        return secondProduct;
    }

    public By getFirstProduct() {
        return firstProduct;
    }

    public By getAllGifts() {
        return AllGifts;
    }

    public By getFourthProduct() {
        return FourthProduct;
    }

    public By getFifthProduct() {
        return FifthProduct;
    }
}

