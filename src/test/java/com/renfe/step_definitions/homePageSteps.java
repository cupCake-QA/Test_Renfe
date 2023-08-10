package com.renfe.step_definitions;

import com.renfe.pages.HomePage;
import com.renfe.utilities.BrowserUtils;
import com.renfe.utilities.DataReader;
import com.renfe.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class homePageSteps {

    HomePage homePage = new HomePage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        WebElement homePage_logo = homePage.homePage_logo;
        BrowserUtils.waitForVisibility(homePage_logo, 5);
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = DataReader.get("homePage_title");
        Assert.assertEquals("Homepage title is wrong", expectedTitle, actualTitle);
        WebElement accept_cookies = homePage.aceptar_cookies;
        accept_cookies.click();
    }

    @Given("enters the {string} station information with the value {string} and selects {string} option")
    public void enters_the_station_information_with_the_value_and_selects_the_station(String stationName, String value, String stationOption) throws Exception {
        WebElement station = homePage.getElement(stationName);
        station.sendKeys(value);

        WebElement station_option = homePage.getElement(stationOption);
        BrowserUtils.waitForVisibility(station_option, 5);
        station_option.click();
    }

    @Given("selects from Ida y vuelta dropdown option {string}")
    public void selects_from_ida_y_vuelta_dropdown_option(String option) throws Exception {
        WebElement menu_btn = homePage.ida_y_vuelta_menu_btn;
        menu_btn.click();

        WebElement menu_option = homePage.getDropDownOption(option);
        BrowserUtils.waitForVisibility(menu_option, 5);
        menu_option.click();
    }

    @Given("selects the first available date")
    public void selects_the_first_available_date() {
        WebElement date = homePage.fecha_inputBox;
        BrowserUtils.waitForVisibility(date, 5);
        date.click();

        WebElement next_day = homePage.dia_siguiente;
        next_day.click();
    }

    @Then("on homepage clicks the {string} button")
    public void on_homepage_clicks_the_button(String buttonName) throws Exception {
        WebElement button = homePage.getElement(buttonName);
        button.click();
    }


}
