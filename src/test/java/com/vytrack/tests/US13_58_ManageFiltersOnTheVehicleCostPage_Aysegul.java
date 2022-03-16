package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US13_58_ManageFiltersOnTheVehicleCostPage_Aysegul extends TestBase {
    /*
Story13:  As a user, I want to manage filters on the Vehicle Costs page. (Web-table and checkbox)
AC #1: Users should see 3 columns on the Vehicle Model page.
 Expected Column names: TYPE, TOTAL PRICE, DATE
AC #2: users check the first checkbox to check all the Vehicle Costs
Test cases #1
Description: users see 3 columns on the Vehicle Model page
Environment: https://qa2.vytrack.com/user/login
Steps:
1.	Users are on the homepage
2.	Click the Vehicle Costs under the Fleet
3.	Verify there are 3 columns on the table:
 Expected Column names: TYPE, TOTAL PRICE, DATE

Test cases #2
Description: users select all the vehicle costs
Environment: https://qa2.vytrack.com/user/login
Steps:
1.	Users are on the homepage
2.	Click the Vehicle Costs under the Fleet
3.	Click the first checkbox
4.	Verify all the vehicle costs are checked
 */
    @Test
    public void tc1_verify_columns_as_truck_driver(){

        VytrackUtilities.loginAsDriver();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        Actions actions = new Actions(Driver.getDriver());

        //user go to Fleet tab
        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        actions.moveToElement(fleetTab).perform();

        //user click Vehicle Cost
        WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCost.click();

        wait.until(ExpectedConditions.titleContains("Vehicle Costs"));

        List<String> expectedColumnNames=new ArrayList<>(Arrays.asList("TYPE","TOTAL PRICE","DATE"));

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> actualColumnNames=new ArrayList<>();

        elements.forEach(p -> actualColumnNames.add(p.getText()));

        // verify column names
        Assert.assertEquals(actualColumnNames,expectedColumnNames);


    }



    @Test
    public void tc1_verify_columns_as_sales_manager(){

        VytrackUtilities.loginAsSalesManager();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        Actions actions = new Actions(Driver.getDriver());

        //user go to Fleet tab
        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        actions.moveToElement(fleetTab).perform();

        //user click Vehicle Cost
        WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCost.click();

        wait.until(ExpectedConditions.titleContains("Vehicle Costs"));

        List<String> expectedColumnNames=new ArrayList<>(Arrays.asList("TYPE","TOTAL PRICE","DATE"));

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> actualColumnNames=new ArrayList<>();

        elements.forEach(p -> actualColumnNames.add(p.getText()));

        // verify column names
        Assert.assertEquals(actualColumnNames,expectedColumnNames);


    }


    @Test   // tc2 storeManager practice
    public void tc2_verify_checkbox_visible_for_store_manager(){

        VytrackUtilities.loginAsStoreManger();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        Actions actions = new Actions(Driver.getDriver());

        //user go to Fleet tab
        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        actions.moveToElement(fleetTab).perform();

        //user click Vehicle Cost
        WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCost.click();

        wait.until(ExpectedConditions.titleContains("Vehicle Costs"));

        // click the first checkbox
        Driver.getDriver().findElement(By.xpath("//button[@data-toggle='dropdown']//input")).click();

        //Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//button[@data-toggle='dropdown']//input")).isSelected());

        List<WebElement> allCheckBox = Driver.getDriver().findElements(By.xpath("//td[@data-column-label='Selected Rows']//input[@type='checkbox']"));

        //verify all checkbox selected
        allCheckBox.forEach(p->Assert.assertTrue( p.isSelected() ));


      /*  deselect all
      Driver.getDriver().findElement(By.xpath("//button[@data-toggle='dropdown']//input")).click();
      allCheckBox.forEach(p->Assert.assertFalse( p.isSelected() )); */


    }
}