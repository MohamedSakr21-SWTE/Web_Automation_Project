package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {

    P03_homePage slider = new P03_homePage();

    @When("user click on slider image nokia")
    public void clickOnSliderImageNokia() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        slider.nokiaHomeSlider().click();

    }

    @When("user click on slider image iphone")
    public void clickOnSliderImageIphone() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        slider.iphoneHomeSlider().click();

    }

    @Then("user navigate to product url {string}")
    public void userNavigateToProductUrl(String url){


        Assert.assertNotEquals(Hooks.driver.getCurrentUrl(),url);

    }
}
