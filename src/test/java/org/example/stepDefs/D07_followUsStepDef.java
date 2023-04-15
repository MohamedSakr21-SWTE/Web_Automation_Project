package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage followUs = new P03_homePage();


    @Given("user click on facebook link")
    public void redirectToFacebook(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        followUs.facebookLink().click();

    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        followUs.twitterLink().click();

    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        followUs.rssLink().click();

    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        followUs.youtubeLink().click();

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String link) {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(link));
        Hooks.driver.close();
    }
}
