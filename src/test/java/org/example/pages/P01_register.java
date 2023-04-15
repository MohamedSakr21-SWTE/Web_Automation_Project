package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {


    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement genderType()
    {
        return Hooks.driver.findElement(By.id("gender-male")) ;
    }

    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.id("FirstName")) ;
    }

    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDateDay()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthDateMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthDateYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement successMessage()
    {
        return Hooks.driver.findElement(By.className("result"));
    }

}
