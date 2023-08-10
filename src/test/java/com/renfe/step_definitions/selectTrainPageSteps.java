package com.renfe.step_definitions;

import com.renfe.pages.SelectTrainPage;
import com.renfe.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class selectTrainPageSteps {

    SelectTrainPage selectTrainPage = new SelectTrainPage();

    @Then("on select train page selects the first price option")
    public void selects_the_first_price_option() {
        WebElement price = selectTrainPage.primer_precio;
        BrowserUtils.waitForVisibility(price, 5);
        price.click();
    }

    @Then("on select train page clicks {string} button")
    public void clicks_button(String buttonName) throws Exception {
        WebElement button = selectTrainPage.getElement(buttonName);
        button.click();
    }

    @Then("on popup clicks {string} option")
    public void clicks_option_on_popup(String buttonName) throws Exception {
        WebElement button = selectTrainPage.getElement(buttonName);
        BrowserUtils.waitForVisibility(button, 5);
        button.click();
    }



}
