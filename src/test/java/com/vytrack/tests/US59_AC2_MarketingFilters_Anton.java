package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US59_AC2_MarketingFilters_Anton extends TestBase {


    @Test
    public void US59_AC2_verifying_as_a_store_manager() {

        //logging in as store manager
        VytrackUtilities.loginAsStoreManger();

        //hover over the Marketing button
        Actions action = new Actions(Driver.getDriver());

        WebElement marketingButton = Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[6]"));
        action.moveToElement(marketingButton).perform();

        //click the campaigns button
        //ManageFilters.campaignsButton.click();
        WebElement campaignsButton = Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-2\"])[15]"));
        campaignsButton.click();

        //click the filters button
        WebElement filtersButton = Driver.getDriver().findElement(By.xpath("//a[@title=\"Filters\"]"));
        filtersButton.click();

        //click Manage filters
        WebElement addFilterButton = Driver.getDriver().findElement(By.xpath("//a[@class=\"add-filter-button\"]"));
        addFilterButton.click();

        // locating all checkBoxes
        System.out.println("All checkboxes are selected = " + WebTableUtils.checkAll());

        //verify that all checkboxes can be unchecked
        System.out.println("All checkboxes can be unchecked = " + WebTableUtils.uncheckAll());


    }

    @Test
    public void US59_AC2_verifying_as_a_sales_manager(){

        //logging in as sales manager
        VytrackUtilities.loginAsSalesManager();

        //hover over the Marketing button
        Actions action = new Actions(Driver.getDriver());

        WebElement marketingButton = Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[6]"));
        action.moveToElement(marketingButton).perform();

        //click the campaigns button
        //ManageFilters.campaignsButton.click();
        WebElement campaignsButton = Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-2\"])[15]"));
        campaignsButton.click();

        //click the filters button
        WebElement filtersButton = Driver.getDriver().findElement(By.xpath("//a[@title=\"Filters\"]"));
        filtersButton.click();

        //click Manage filters
        WebElement addFilterButton = Driver.getDriver().findElement(By.xpath("//a[@class=\"add-filter-button\"]"));
        addFilterButton.click();

        // locating all checkBoxes
        System.out.println("All checkboxes are selected = " + WebTableUtils.checkAll());

        //verify that all checkboxes can be unchecked
        System.out.println("All checkboxes can be unchecked = " + WebTableUtils.uncheckAll());
    }

}

