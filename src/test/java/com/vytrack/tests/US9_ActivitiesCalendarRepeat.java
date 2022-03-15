package com.vytrack.tests;

import com.vytrack.POM_for_US9.ActivitiesCalendarRepeat;
import com.vytrack.Pages.VytrackLoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US9_ActivitiesCalendarRepeat {

    ActivitiesCalendarRepeat activitiesCalendarRepeat;

@BeforeMethod
    public void setUpMethod(){

        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        activitiesCalendarRepeat = new ActivitiesCalendarRepeat();

    }

    @Test
    public void login_Calendar_Repeat() {

        activitiesCalendarRepeat.inputUsername.sendKeys("user184");
        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.inputPassword.sendKeys("UserUser123");
        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.inputLoginButton.click();

        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.ActivitiesButton.click();
        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.calendarEventButton.click();
        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.createCalendarEvent.click();
        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.repeatCheckBox.click();
        BrowserUtils.sleep(2);
        activitiesCalendarRepeat.repeatBox.click();



        for(Integer i = 100; 1 < 105; i++){
            activitiesCalendarRepeat.repeatBox.clear();
            BrowserUtils.sleep(2);
            activitiesCalendarRepeat.repeatBox.sendKeys("" +i + "");
            BrowserUtils.sleep(2);
            WebElement errorText = Driver.getDriver().findElement(By.xpath("//span[@class='validation-failed']"));
            String errorMessage = errorText.getText();
            System.out.println("errorMessage = " + errorMessage);

            if(! (errorMessage.contains("value have not to be")));
            System.out.println("errorMessage = " + errorMessage);
            break;
        }


}

    //@AfterMethod
   // public void tearDown() {
      //  Driver.closeDriver();
    }





