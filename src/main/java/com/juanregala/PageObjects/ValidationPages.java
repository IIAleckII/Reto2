package com.juanregala.PageObjects;

import org.openqa.selenium.By;

public class ValidationPages {

    private By Catergory1 = By.xpath("(//a[@href='https://juanregala.com.co/medellin/categoria/regalos/arreglos-florales-en-medellin/'])[3]");

    private By ProductFlores = By.xpath("(//a[@href='https://juanregala.com.co/medellin/tienda/ramo-de-12-girasoles/'])[2]");

    private By lblProductName = By.xpath("//h1[contains(text(),'Ramo de 12 Girasoles')]");

    public By getCatergory1() {
        return Catergory1;
    }

    public By getProductFlores() {
        return ProductFlores;
    }

    public By getLblProductName() {
        return lblProductName;
    }
}
