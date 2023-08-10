package com.renfe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDetailsPage extends BasePage{

    @FindBy(xpath = "//*[@id='datosViajero_0_nombre']")
    public WebElement nombre_inputBox;

    @FindBy(xpath = "//*[@id='datosViajero_0_apellido1']")
    public WebElement apellido_inputBox;

    @FindBy(xpath = "//*[@id='datosViajero_0_tipoDocumento']")
    public WebElement tipoDocumento_dropdown;

    @FindBy(xpath = "//*[@id='datosViajero_0_documento']")
    public WebElement numero_documento_inputBox;

    @FindBy(xpath = "//*[@id='datosViajero_0_email']")
    public WebElement email_inputBox;

    @FindBy(xpath = "//*[@id='datosViajero_0_telefono']")
    public WebElement telefono_inputBox;

    @FindBy(xpath = "//*[@id='agreement']")
    public WebElement condiciones_checkBox;

    @FindBy(xpath = "//input[@id='datosPago_cdgoFormaPago_tarjetaRedSys']")
    public WebElement tarjeta_radioBtn;

    @FindBy(xpath = "//input[@id='telefonoComprador0202']")
    public WebElement telefono_comprador;

    @FindBy(xpath = "//*[@id='submitSiguiente']")
    public WebElement comprar_btn;


    public WebElement getElement(String elementName) throws Exception {

        switch (elementName){
            case "Nombre":
                return nombre_inputBox;
            case "Apellido 1":
                return apellido_inputBox;
            case "Tipo de documento":
                return tipoDocumento_dropdown;
            case "Nº documento":
                return numero_documento_inputBox;
            case "E-mail":
                return email_inputBox;
            case "Teléfono viajero":
                return telefono_inputBox;
            case "Teléfono comprador":
                return telefono_comprador;
            case "Tarjeta/Google Pay Apple Pay":
                return tarjeta_radioBtn;
            case "COMPRAR":
                return comprar_btn;
            case "Condiciones legales":
                return condiciones_checkBox;
            default:
                throw new UnsupportedOperationException("Element not implemented");
        }
    }









}
