package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTip extends BaseClass  {
    @FindBy(xpath = "//input[@title='Search']")
    WebElement ClickOnSearchBar;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]")
    WebElement ClickOnVoiceBtn;


    public ToolTip(WebDriver driver) {
        PageFactory.initElements(driver, this); //initElements method is used to initialize web elements
    }

    public  String  toolTipVerifyTitle() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(ClickOnSearchBar).build().perform();
        String toolTip = ClickOnSearchBar.getAttribute("title");//Get the value of the given attribute  with specified name of the element
        System.out.println("ToolTip is: " + toolTip);
        return toolTip;
    }

        public  String  toolTipTitle() throws InterruptedException {
            Actions actions = new Actions(driver);
            Thread.sleep(2000);
            actions.moveToElement(ClickOnVoiceBtn).build().perform();
            String toolTip1 = ClickOnVoiceBtn.getAttribute("aria-label");
            System.out.println("ToolTip is: " + toolTip1);
            return toolTip1;
        }

}




