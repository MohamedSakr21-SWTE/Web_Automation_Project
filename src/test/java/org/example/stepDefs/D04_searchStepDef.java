package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Locale;


public class D04_searchStepDef {

    P03_homePage search = new P03_homePage();

    // user enter data in search bar
    @When("^user enter product data \"(.*)\"$")
    public void userEnterProductData(String productData){
        search.searchBar().sendKeys(productData);
    }


    // user click on search button
    @And("user click on search button")
    public void userClickOnSearchButton() {
        search.searchButton().click();
    }

    //user check if product name is displayed  #Name
    @Then("^user check if product name is displayed \"(.*)\"$")
    public void userCheckIfProductNameIsDisplayed(String productName) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));


        for (int i = 0; i < search.searchProductList().size(); i++) {
            softAssert.assertTrue(search.searchProductList().get(i).getText().toLowerCase().contains(productName));
        }
    }


    // user click on product #sku
    @And("user click on product")
    public void userClickOnProduct() {
        search.searchProductItem().get(0).click();
    }

    // user check for Sku in single product page #sku
    @Then("^check product sku \"(.*)\"$")
    public void checkProductSku(String sku) {
        Assert.assertTrue(search.searchSku().getText().contains(sku));
    }



}
