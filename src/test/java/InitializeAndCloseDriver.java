package test.java;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class InitializeAndCloseDriver {

    public static WebDriver chromeDriver;

    public static void driverInitialize(){

        Map<String, Object> pref = new HashMap<>();
        pref.put(Reusable.readFromHashMap("browserPreference1"), 1);
        pref.put(Reusable.readFromHashMap("browserPreference2"), 1);
        pref.put(Reusable.readFromHashMap("browserPreference3"), 1);
        pref.put(Reusable.readFromHashMap("browserPreference4"), TestVariables.downloadPath);

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("prefs", pref);

        System.setProperty("webdriver.chrome.driver", Reusable.readFromHashMap("webdriverPath"));
        chromeDriver = new ChromeDriver(options);

        chromeDriver.manage().window().maximize();

    }

    public static void closeDriver(){

        chromeDriver.close();
        chromeDriver.quit();
    }


}
