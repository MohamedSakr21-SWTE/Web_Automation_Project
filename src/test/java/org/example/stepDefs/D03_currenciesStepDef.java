package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage currencies = new P03_homePage();

    @When("change currency to euro")
    public void changeCurrentCurrency(){
        Select selectCurrency = new Select(currencies.currencyDropdownList());
        selectCurrency.selectByIndex(1);
    }

    @Then("check products price")
    public void checkProductsPrice() {
        for (int i = 1; i < currencies.currencyProductPrice().size() ; i++) {
            String price = currencies.currencyProductPrice().get(i).getText();
            Assert.assertTrue(price.contains("€"));
        }
    }
}
