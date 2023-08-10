package com.renfe.step_definitions;

import com.renfe.pages.PayWithCardPage;
import com.renfe.utilities.BrowserUtils;
import com.renfe.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class payWithCardPageSteps {

    PayWithCardPage payWithCardPage = new PayWithCardPage();

    @Then("on pay with card page fills the field {string} with the value {string}")
    public void on_page_fills_the_field_with_the_value(String fieldName, String value) throws Exception {
        WebElement field = payWithCardPage.getElement(fieldName);
        BrowserUtils.waitForVisibility(field, 5);
        field.sendKeys(value);
    }

    @When("on pay with card page clicks the {string} button")
    public void on_page_clicks_the_button(String buttonName) throws Exception {
        WebElement button = payWithCardPage.getElement(buttonName);
        button.click();
    }

    @Then("the alert appears with the message {string}")
    public void the_alert_appears_with_the_message(String expected_message) {
        Alert alert = Driver.get().switchTo().alert();
        String actual_message = alert.getText();
        Assert.assertEquals("Alert text is different than expected message", expected_message, actual_message);
    }




}
