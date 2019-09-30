package test.java;

import java.io.File;

public class TestVariables {

    public static String emailId = (TestSelenium.generateRandomAlphaNumericValue(7) + "@gmail.com").toLowerCase();
    public static String firstName = TestSelenium.generateRandomAlphaNumericValue(6);
    public static String lastName = TestSelenium.generateRandomAlphaNumericValue(1);
    public static String companyName = TestSelenium.generateRandomAlphaNumericValue(8);
    public static String writeNotes = TestSelenium.generateRandomAlphaNumericValue(20);
    public static String downloadPath = "C:\\SeleniumDownload";
    public static File directory = new File(downloadPath);

}
