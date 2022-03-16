package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US10_Create_CalendarEvents extends TestBase {


@Test
    public void createCalendarEvents(){

        //login as a driver
        VytrackUtilities.loginAsDriver();
        //go to activities tab
        Actions actions = new Actions(Driver.getDriver());
        WebElement activityTab =Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));


        WebElement calendarTab = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));
        BrowserUtils.sleep(3);
        actions.moveToElement(activityTab).moveToElement(calendarTab).click().perform();
        BrowserUtils.sleep(3);

        Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']")).click();
        BrowserUtils.sleep(3);

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("oro_calendar_event_form_description-uid-6230ff4f273cc_ifr")));

        WebElement scrumDailyMeetingText = Driver.getDriver().findElement(By.tagName("p"));
        Assert.assertTrue(scrumDailyMeetingText.isDisplayed());

       Driver.getDriver().switchTo().defaultContent();









    }
}
