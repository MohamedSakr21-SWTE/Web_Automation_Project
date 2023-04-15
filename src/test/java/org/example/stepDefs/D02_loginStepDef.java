package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void goToLoginPage(){
        login.loginLink().click();
    }

    @When("^user login with data \"(.*)\" and \"(.*)\"$")
    public void userLoginWithDataEmailAndPassword(String email, String password){
        login.loginEmail().sendKeys(email);
        login.loginPassword().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        if(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/")){
            softAssert.assertTrue(login.loginMyAccount().isDisplayed());
        }
        else{
            softAssert.assertTrue(login.loginErrorMessage().getText().contains("Login was unsuccessful."));
            String actualColor = login.loginErrorMessage().getCssValue("color");
            String actualColorHex = Color.fromString(actualColor).asHex(); // rgba to Hex
            softAssert.assertTrue(actualColorHex.equals("#e4434b"));
        }
        softAssert.assertAll();
    }


}
