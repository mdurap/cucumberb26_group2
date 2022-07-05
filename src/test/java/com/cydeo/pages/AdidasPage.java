package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasPage {
    public AdidasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //a[.='Add to cart']
    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addCart;

    @FindBy (xpath = "//a[@id='itemc'][2]")
    public WebElement laptop;

    @FindBy (xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyVaio;







}
