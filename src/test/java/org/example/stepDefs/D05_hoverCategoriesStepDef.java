package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {

    P03_homePage category = new P03_homePage();

    public String selectedSubCategoryText;
    public int selectedCategory;



    @When("user hover over categories")
    public void hoverOverCategories(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Actions actions = new Actions(Hooks.driver);
        int listSize = category.categoryLinks().size();
        int firstItem = 0;
        int lastItem = listSize-5   ;
        selectedCategory = (int)Math.floor(Math.random()*(lastItem-firstItem+1)+firstItem);
        actions.moveToElement(category.categoryLinks().get(selectedCategory)).perform();

    }

    @And("user clicks on one of the subcategories")
    public void userClicksOnOneOfTheSubcategories(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        int listSize = category.subCategoryLinks(selectedCategory).size();
        int firstItem = 0;
        int lastItem = listSize-1;
        int selectedSubCategory = (int)Math.floor(Math.random()*(lastItem-firstItem+1)+firstItem);
        selectedSubCategoryText = category.subCategoryLinks(selectedSubCategory).get(selectedSubCategory).getText();
        category.subCategoryLinks(selectedCategory).get(selectedSubCategory).click();

    }

    @Then("user checks if page title equals subcategory name")
    public void userChecksIfPageTitleEqualsSubcategoryName() {
        Assert.assertTrue(category.pageTitleSubCategory().getText().toLowerCase().trim().contains(selectedSubCategoryText));
    }
}
