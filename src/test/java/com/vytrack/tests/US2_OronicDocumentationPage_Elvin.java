package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class US2_OronicDocumentationPage_Elvin {
    @AfterMethod
    public void driverClose() throws InterruptedException {

        Driver.closeDriver();
    }


    @Test
    public void oronicDocumentDriver() {
        VytrackUtilities.loginAsDriver();
        WebElement oronicPageBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        oronicPageBtn.click();

        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
        }
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String exceptedUrl = "https://doc.oroinc.com/";

        Assert.assertEquals(currentUrl, exceptedUrl);

    }

    @Test
    public void oronicDocumentSalesManager() {
        VytrackUtilities.loginAsSalesManager();
        WebElement oronicPageBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        oronicPageBtn.click();

        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
        }
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String exceptedUrl = "https://doc.oroinc.com/";

        Assert.assertEquals(currentUrl, exceptedUrl);

    }

    @Test
    public void oronicDocumentStoreManager() {
        VytrackUtilities.loginAsStoreManger();
        WebElement oronicPageBtn = Driver.getDriver().findElement(By.xpath("//i[@title='Get help']"));
        oronicPageBtn.click();

        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
        }
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String exceptedUrl = "https://doc.oroinc.com/";

        Assert.assertEquals(currentUrl, exceptedUrl);

    }


}
