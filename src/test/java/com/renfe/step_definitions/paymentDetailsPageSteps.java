package com.renfe.step_definitions;

import com.renfe.pages.PaymentDetailsPage;
import com.renfe.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class paymentDetailsPageSteps {

    PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage();

    @Then("on payment details page fills the field {string} with the value {string}")
    public void on_page_fills_the_field_with_the_value(String elementName, String value) throws Exception {
        WebElement inputBox = paymentDetailsPage.getElement(elementName);
        BrowserUtils.waitForVisibility(inputBox, 5);
        inputBox.clear();
        inputBox.sendKeys(value);
    }

    @Then("on payment details page from {string} dropdown select value {string}")
    public void on_dropdown_select_the_value(String dropdown, String value) throws Exception {
        WebElement document_dropdown = paymentDetailsPage.getElement(dropdown);
        Select select = new Select(document_dropdown);
        select.selectByVisibleText(value);
    }

    @Then("on payment details page checks radio button {string} is selected")
    public void checks_radio_button_is_selected(String buttonName) throws Exception {
        WebElement radioBtn = paymentDetailsPage.getElement(buttonName);
        BrowserUtils.scrollToElement(radioBtn);
        Assert.assertTrue(radioBtn.isSelected());
    }

    @Then("on payment details page checks the {string} checkbox")
    public void checks_the_checkbox(String buttonName) throws Exception {
        WebElement checkbox = paymentDetailsPage.getElement(buttonName);
        // used JavascriptExecutor click method because element click intercepted
        BrowserUtils.clickWithJS(checkbox);
    }

    @Then("on payment details page clicks {string} button")
    public void on_page_clicks_button(String buttonName) throws Exception {
        WebElement button = paymentDetailsPage.getElement(buttonName);
        // used JavascriptExecutor click method because element click intercepted
        BrowserUtils.clickWithJS(button);
    }

}
