package com.cybertek.test.utilities;

public class SeleniumUtils {

    /*
    * @param exceptedResult
    * @param actualResult
    * Verified if two strings are equals
     */

    public void verifyEquals(String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Result = " + expectedResult);
            System.out.println("Actual Result = " + actualResult);
        }
    }
}
