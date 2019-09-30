package test.java;

import static test.java.InitializeAndCloseDriver.*;

public class LaunchAndLogin {

    public static void launchAndLoginToTheApplication() {

        Reusable reuse = new Reusable();
        chromeDriver.get(Reusable.readFromHashMap("urlToGet"));
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("loginEmail"));
        reuse.locateById(Reusable.readFromHashMap("loginEmail")).sendKeys(Reusable.readFromHashMap("emailToLogin"));
        reuse.locateById(Reusable.readFromHashMap("loginPassword")).sendKeys(Reusable.readFromHashMap("passwordToLogin"));
        reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("loginButton"));
        reuse.locateByXpath(Reusable.readFromHashMap("loginButton")).click();

    }
}
