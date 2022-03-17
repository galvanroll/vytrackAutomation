package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US50_Tests_Vehicles_Model_Table_Siham extends TestBase {

    @Test
    public void US50_AC1_verifying_columns_as_sales_manager() {

        // Login as Sales Manager
        VytrackUtils.loginAsSalesManager();

        // Go to Fleet tab
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();

        // Locate Vehicle Model
        String vehicleModelLocator = "//span[normalize-space()='Vehicle Model' and contains(@class, 'title title-level-2')]";
        WebElement vehicleModelElement = Driver.getDriver().findElement(By.xpath(vehicleModelLocator));
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehicleModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        List<String> actualHeadersFromVehicleModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedHeadersFromVehicleModelTable = new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        // verify header columns
        // Assert.assertEquals(actualHeadersFromVehicleModelTable, expectedHeadersFromVehicleModelTable);

    }

    @Test
    public void US50_AC1_verifying_columns_as_store_manager(){

        // Login as Store Manager
        VytrackUtils.loginAsStoreManger();

        // Go to Fleet tab
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();

        // Click Vehicle Model
        String vehicleModelLocator = "//span[normalize-space()='Vehicle Model' and contains(@class, 'title title-level-2')]";
        WebElement vehicleModelElement = Driver.getDriver().findElement(By.xpath(vehicleModelLocator));
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehicleModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        List<String> actualHeadersFromVehicleModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedHeadersFromVehicleModelTable=new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        // verify header columns
        // Assert.assertEquals(actualHeadersFromVehicleModelTable, expectedHeadersFromVehicleModelTable);

    }

    @Test
    public void US50_AC2_verifying_drivers_get_error_message_displayed_in_vehicle_models_page(){

        // Login as Driver
        VytrackUtils.loginAsDriver();

        // Go to Fleet tab
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();

        // Click Vehicle Model
        String vehicleModelLocator = "//span[normalize-space()='Vehicle Model' and contains(@class, 'title title-level-2')]";
        WebElement vehicleModelElement = Driver.getDriver().findElement(By.xpath(vehicleModelLocator));
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehicleModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        // Verify error message displayed
        // WebElement warningText1 = Driver.getDriver().findElement(By.xpath("//span[.='message']"));
        // String expected1="message";
        // String actual1=warningText1.getText();
        // assertEquals(actual1,expected1);

    }

}
