package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WebTableUtils {

    /*
     * this method is using for finding vehicle model table headers
     *
     * @return List<String> titles
     */

    public static List<String> getHeadersFromVehicleModelTable() {
        List<WebElement> headerElements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> headerTitles = new ArrayList<>();
        headerElements.forEach(k -> headerTitles.add(k.getText()));
        return headerTitles;
    }


    /* US14_Anton
    method for checking if all checkboxes are selected
     */
    public static boolean checkAll() {

        List<WebElement> allCheckBoxes =
                Driver.getDriver().findElements(By.xpath("//input[@name=\"multiselect_0\"]"));

        boolean result = true;
        //as long as one of them are not checked, return false
        for (WebElement eachCheckbox : allCheckBoxes) {
            if (!eachCheckbox.isSelected()) {
                return false;
            }

        }
        return result;
    }


        //Uncheck all checkBoxes and verify all is unselected
        public static boolean uncheckAll() {

            List<WebElement> allCheckBoxes =
                    Driver.getDriver().findElements(By.xpath("//input[@name=\"multiselect_0\"]"));

            boolean result = true;
            //as long as one of them are not checked, return false
            for (WebElement eachCheckbox : allCheckBoxes){
                if( eachCheckbox.isSelected() ){
                    return false;
                }

            }
            return result;
        }

    }












