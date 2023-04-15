package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {

    P03_homePage wishlist = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));

    @When("user click wishlist product button")
    public void userClickWishlistProductButton(){
        wishlist.wishlistProductButton().click();
    }

    @Then("user checks success message")
    public void userChecksSuccessMessage() {
        String actualColor = wishlist.wishlistSuccessMessage().getCssValue("background-color");
        String actualColorHex = Color.fromString(actualColor).asHex(); // rgba to Hex
        softAssert.assertTrue(actualColorHex.equals("#4bb07a"));
        wishlist.wishlistSuccessMessageCloseButton().click();

    }

    @And("user click wishlist link button")
    public void userClickWishlistLinkButton() throws InterruptedException{
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        wishlist.wishlistLink().click();
    }

    @Then("user checks if quantity changed")
    public void userChecksIfQuantityChanged() {
        int quantityCheck = Integer.parseInt(wishlist.wishlistQuantity().getAttribute("value"));
        softAssert.assertTrue(quantityCheck>0);
    }


}
