package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goToRegisterPage()
    {
        register.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.genderType().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        register.firstName().sendKeys(firstName);
        register.lastName().sendKeys(lastName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select selectDay = new Select(register.birthDateDay());
        Select selectMonth = new Select(register.birthDateMonth());
        Select selectYear = new Select(register.birthDateYear());
        selectDay.selectByIndex(1);
        selectMonth.selectByIndex(1);
        selectYear.selectByIndex(1);
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        register.email().sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String confirmPassword) {
        register.password().sendKeys(password);
        register.confirmPassword().sendKeys(confirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerButton().click();
    }

    @Then("success message is displayed {string}")
    public void successMessageIsDisplayed(String expectedMsg) {
        String actualMessage = register.successMessage().getText();
        String actualColor = register.successMessage().getCssValue("color");
        String actualColorHex = Color.fromString(actualColor).asHex(); // rgba to Hex

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualMessage.equals(expectedMsg));
        softAssert.assertTrue(actualColorHex.equals("#4cb17c"));
        softAssert.assertAll();
    }
}
