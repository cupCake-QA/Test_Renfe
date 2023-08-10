package com.renfe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectTrainPage extends BasePage{

    @FindBy(xpath = "//tbody[@id='listaTrenesTBodyIda']//tr[1]//td[5]")
    public WebElement primer_precio;

    @FindBy(xpath = "//button[@id='buttonBannerContinuar']")
    public WebElement seleccionar_btn;

    @FindBy(xpath = "//*[@id='aceptarConfirmacionFareUpgrade']")
    public WebElement no_quiero_popUpLink;

    public WebElement getElement(String elementName) throws Exception {

        switch (elementName){
            case "SELECCIONAR":
                return seleccionar_btn;
            case "No, quiero continuar":
                return no_quiero_popUpLink;
            default:
                throw new UnsupportedOperationException("Element not implemented");
        }
    }

}




