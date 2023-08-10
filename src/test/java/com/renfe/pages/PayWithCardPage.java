package com.renfe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayWithCardPage extends BasePage {

    @FindBy(xpath = "//*[@id='inputCard']")
    public WebElement tarjeta_inputBox;

    @FindBy(xpath = "//*[@id='cad1']")
    public WebElement mm_inputBox;

    @FindBy(xpath = "//*[@id='cad2']")
    public WebElement aa_inputBox;

    @FindBy(xpath = "//*[@id='codseg']")
    public WebElement cvv_inputBox;

    @FindBy(xpath = "//*[@id='divImgAceptar']")
    public WebElement pagar_btn;


    public WebElement getElement(String elementName) throws Exception {

        switch (elementName){
            case "Nº Tarjeta":
                return tarjeta_inputBox;
            case "mm":
                return mm_inputBox;
            case "aa":
                return aa_inputBox;
            case "CVV":
                return cvv_inputBox;
            case "Pagar":
                return pagar_btn;
            default:
                throw new UnsupportedOperationException("Element not implemented");
        }
    }




}
