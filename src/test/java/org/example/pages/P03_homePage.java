package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement currencyDropdownList(){
        return Hooks.driver.findElement(By.name("customerCurrency"));
    }

    public List<WebElement> currencyProductPrice(){
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    // ---------- Search Feature ------------

    public WebElement searchBar(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(){
        return Hooks.driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> searchProductList(){
        return Hooks.driver.findElements(By.className("product-title"));
    }

    public List<WebElement> searchProductItem(){
        return Hooks.driver.findElements(By.className("product-item"));
    }

    public WebElement searchSku(){
        return Hooks.driver.findElement(By.className("overview"));
    }


    // ---------- Category Hover Feature ------------

    public  List<WebElement> categoryLinks(){
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }

    public  List<WebElement> subCategoryLinks(int index){
        return Hooks.driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+(index+1)+"]/li"));
    }

    public WebElement pageTitleSubCategory(){
        return Hooks.driver.findElement(By.className("page-title"));
    }

    // ---------- Home Slider Feature ------------

    public WebElement iphoneHomeSlider(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
    }

    public WebElement nokiaHomeSlider(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
    }

    // ---------- Follow Us Feature ------------

    public WebElement facebookLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitterLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rssLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtubeLink(){
            return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    // ---------- Wishlist Feature ------------

    public WebElement wishlistProductButton(){
        return Hooks.driver.findElement(By.xpath("//div[@class='master-wrapper-content']//div[3]//div[1]//div[2]//div[3]//div[2]//button[3]"));
    }

    public WebElement wishlistLink(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }

    public WebElement wishlistSuccessMessage(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement wishlistSuccessMessageCloseButton(){
        return Hooks.driver.findElement(By.className("close"));
    }

    public WebElement wishlistQuantity(){
        return Hooks.driver.findElement(By.className("qty-input"));
    }


}
