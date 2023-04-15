package org.example.pages;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginLink(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement loginEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement loginPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(){
        return Hooks.driver.findElement(By.className("login-button"));
    }

    public WebElement loginMyAccount(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }

    public WebElement loginErrorMessage(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
