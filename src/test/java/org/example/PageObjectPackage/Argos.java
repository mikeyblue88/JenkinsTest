package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Argos extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement searchbox;

    public void searchBoxFunction(){
        searchbox.sendKeys("Nike");
    }

    @FindBy(className = "_2mKaC")
    WebElement searhbutton;

    public void searchButton(){
        searhbutton.click();
    }
}
