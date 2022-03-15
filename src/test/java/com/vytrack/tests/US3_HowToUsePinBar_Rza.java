package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class US3_HowToUsePinBar_Rza {

    @Test
    public void verify2Messages(){
        VytrackUtilities.loginAsDriver();
        Driver.getDriver().findElement(By.xpath("//a[.='Learn how to use this space']")).click();
        WebElement text1 = Driver.getDriver().findElement(By.xpath("(//h3)[2]"));
        WebElement text2 = Driver.getDriver().findElement(By.xpath("(//p)[1]"));
        String actText1 = text1.getText();
        String expText1 = "How To Use Pinbar";

        String actText2 = text2.getText();
        String expText2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";



        Assert.assertEquals(actText1,expText1);
        Assert.assertEquals(actText2,expText2);

    }

    @Test
    public void verifyImg(){
        VytrackUtilities.loginAsSalesManager();
        Driver.getDriver().findElement(By.xpath("//a[.='Learn how to use this space']")).click();

        WebElement img = Driver.getDriver().findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']"));
        String actSrc = img.getAttribute("src");
        String expSrc = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertTrue(actSrc.contains(expSrc));

    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }



}
