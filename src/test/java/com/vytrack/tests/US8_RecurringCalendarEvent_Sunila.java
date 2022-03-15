package com.vytrack.tests;

import com.vytrack.Pages.RecurringCalendarEvent_Sunila;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US8_RecurringCalendarEvent_Sunila {

    RecurringCalendarEvent_Sunila recurringCalendarEventSunila;

@BeforeMethod
    public void setUpMethod(){

    Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        recurringCalendarEventSunila = new RecurringCalendarEvent_Sunila();
}

@Test
    public void default_Repeat_Day(){

    recurringCalendarEventSunila.inputUserName.sendKeys("user185");
    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.inputPassword.sendKeys("UserUser123");

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.inputLoginButton.click();

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.ActivitiesButton.click();

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.calenderEventButton.click();

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.createCalenderEvent.click();

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.repeatCheckBox.click();

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.repeatEvery.click();

    BrowserUtils.sleep(2);
    recurringCalendarEventSunila.repeatEvery1.click();

//   Assert.assertEquals(recurringCalendarEvent.repeatEvery.getAttribute("value"),1);
//   BrowserUtils.sleep(2);

}

@Test
public void error_Message(){

   recurringCalendarEventSunila.inputUserName.sendKeys("user185");
    BrowserUtils.sleep(2);

    recurringCalendarEventSunila.inputPassword.sendKeys("UserUser123");
    BrowserUtils.sleep(2);

    recurringCalendarEventSunila.inputLoginButton.click();
    BrowserUtils.sleep(2);

    recurringCalendarEventSunila.ActivitiesButton.click();
    BrowserUtils.sleep(2);

    recurringCalendarEventSunila.calenderEventButton.click();
    BrowserUtils.sleep(2);

   recurringCalendarEventSunila.createCalenderEvent.click();
    BrowserUtils.sleep(2);

    recurringCalendarEventSunila.repeatCheckBox.click();
    BrowserUtils.sleep(2);

   recurringCalendarEventSunila.repeatEvery.click();
    BrowserUtils.sleep(2);

    recurringCalendarEventSunila.repeatEvery1.clear();
    BrowserUtils.sleep(2);


    //Assert.assertEquals(recurringCalendarEvent.errorMessage.getText(),"This value should not be blank.");

}
@AfterMethod
    public void TearDown(){
    Driver.closeDriver();
}

}








