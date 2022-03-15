package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecurringCalendarEvent_Sunila {

   public RecurringCalendarEvent_Sunila(){

       PageFactory.initElements(Driver.getDriver(),this);

   }

   @FindBy(xpath = "//input[@name='_username']")
   public WebElement inputUserName;

   @FindBy(xpath = "//input[@name='_password']")
    public WebElement inputPassword;

   @FindBy(xpath = "//button[@type='submit']")
   public WebElement inputLoginButton;

   @FindBy(xpath = "//span[contains( .,\"Activities\")]")
    public WebElement ActivitiesButton;

   @FindBy(xpath = "//span[contains(.,'Calendar Events')]")
    public WebElement calenderEventButton;

   @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalenderEvent;

   @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckBox;

   @FindBy(css = "input[value ='1']")
    public WebElement repeatEvery;

   @FindBy(xpath ="//input[@class='recurrence-subview-control__number']" )
    public WebElement repeatEvery1;

    @FindBy(xpath = "//span[starts-with(@style,'top: 536.297px; left: 182px;')]/span")
    public WebElement errorMessage;

}
//