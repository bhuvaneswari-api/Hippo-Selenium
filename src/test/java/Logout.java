package test.java;

public class Logout {

    public static void LogoutOfApplication(){
        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("profileIcon"));
        reuse.locateByXpath(Reusable.readFromHashMap("profileIcon")).click();
        reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("signOutButton"));
        reuse.locateByXpath(Reusable.readFromHashMap("signOutButton")).click();
//
    }
}
