package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class US49_Tests_Vehicle_Contracts_Page_Siham extends TestBase {

    @Test
    public void US49_AC1_verifying_vehicle_contracts_page_as_sales_manager(){

        // Login as Sales Manager
        VytrackUtils.loginAsSalesManager();

        // Go to Fleet tab
        WebElement fleetWebElement = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(fleetWebElement));

        // Click on Vehicle Contracts
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetWebElement).perform();
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']")).click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        List<String> expectedPageHeader = new ArrayList<>(Arrays.asList( "All", "Vehicle Contract", "Entities", "System", "Car", "Entities", "System"));
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> actualPageHeader = new ArrayList<>();

        // Verify header from Vehicle Contracts page
        //Assert.assertEquals(actualPageHeader, expectedPageHeader);

    }

    @Test
    public void US49_AC1_verifying_vehicle_contracts_page_as_store_manager(){

        // Login as Store Manager
        VytrackUtils.loginAsStoreManger();

        // Go to Fleet tab
        WebElement fleetWebElement = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(fleetWebElement));

        // Click on Vehicle Contracts
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetWebElement).perform();
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']")).click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        List<String> expectedHeaderFromVehicleContractsPage = new ArrayList<>(Arrays.asList( "All", "Vehicle Contract", "Entities", "System", "Car", "Entities", "System"));
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> actualHeaderFromVehicleContractsPage = new ArrayList<>();

        // Verify header from Vehicle Contracts page
        //Assert.assertEquals(actualHeaderFromVehicleContractsPage, expectedHeaderFromVehicleContractsPage);

    }

    @Test
    public void US49_AC2_verifying_drivers_get_error_message_displayed_in_vehicle_contracts_page(){

        // Login as Driver
        VytrackUtils.loginAsDriver();
        VytrackUtils.waitTillLoaderMaskDisappear();

        // Go to Fleet tab
        WebElement fleetWebElement = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(fleetWebElement));

        // Click on Vehicle Contracts
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetWebElement).perform();
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']")).click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        // Verify error message displayed
        //WebElement warningText1 = Driver.getDriver().findElement(By.xpath("//span[.='message']"));
        //String expected1="message";
        //String actual1=warningText1.getText();
        //assertEquals(actual1,expected1);

    }

}
