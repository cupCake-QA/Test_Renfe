package com.renfe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@title='Renfe' and contains(@class,'logo')]")
    public WebElement homePage_logo;

    @FindBy(xpath = "//input[@id='origin']")
    public WebElement desde_inputBox;

    @FindBy(xpath = "//*//input[@id='origin']/..//*[@role='option' and contains(@id,'awesomplete_list')]")
    public WebElement desde_dropdown_option;

    @FindBy(xpath = "//input[@id='destination']")
    public WebElement hasta_inputBox;

    @FindBy(xpath = "//*//input[@id='destination']/..//*[@role='option' and contains(@id,'awesomplete_list')]")
    public WebElement hasta_dropdown_option;

    @FindBy(xpath = "//*[@id='tripType']//button[@aria-label='Ida y vuelta Menú desplegable tipo de viaje']")
    public WebElement ida_y_vuelta_menu_btn;

    @FindBy(xpath = "//*[@id='tripType']//button[contains(.,'Sólo ida')]")
    public WebElement soloIda_btn;

    @FindBy(xpath = "//*[@id='datepicker']//input[@aria-label='Fecha ida']")
    public WebElement fecha_inputBox;

    @FindBy(xpath = "//*[@id='datepicker']//button[@aria-label='Sumar día']")
    public WebElement dia_siguiente;

    @FindBy(xpath = "//button[@class='lightpick__apply-action-sub' and text()='Aceptar']")
    public WebElement aceptar_btn;

    @FindBy(xpath = "//button[@title='Buscar billete']")
    public WebElement buscarBillete_btn;


    public WebElement getElement(String elementName) throws Exception {

        switch (elementName){
            case "Desde":
                return desde_inputBox;
            case "Hasta":
                return hasta_inputBox;
            case "desde estación":
                return desde_dropdown_option;
            case "hasta estación":
                return hasta_dropdown_option;
            case "Acceptar":
                return aceptar_btn;
            case "Buscar Billete":
                return buscarBillete_btn;
            default:
                throw new UnsupportedOperationException("Element not implemented");
        }
    }

    public WebElement getDropDownOption(String elementName) throws Exception {

        switch (elementName){
            case "Sólo ida":
                return soloIda_btn;
            default:
                throw new UnsupportedOperationException("Element not implemented");
        }

    }


























}
