package com.juanregala.PageObjects;

import org.openqa.selenium.By;

public class SearchPages {
    private By btnClickMedellin = By.xpath("//a[@href='https://juanregala.com.co/medellin/tienda/']");
    private By btnSearch = By.xpath("(//i[@class='icon-search'])[1]");
    private By txtSearch = By.xpath("//input[@id='woocommerce-product-search-field-0']");

    private By ClkProduct2 = By.xpath("//a[@href='https://juanregala.com.co/medellin/tienda/ancheta-de-cumpleanos/']");
    private By ClkProduct1 = By.xpath("//a[@href='https://juanregala.com.co/medellin/tienda/ramo-de-flores-para-cumpleanos/']");


    //------------------------------

    public By getBtnClickMedellin() {
        return btnClickMedellin;
    }

    public By getBtnSearch() {
        return btnSearch;
    }

    public By getTxtSearch() {
        return txtSearch;
    }

    public By getClkProduct1() {
        return ClkProduct1;
    }

    public By getClkProduct2() {
        return ClkProduct2;
    }

}
