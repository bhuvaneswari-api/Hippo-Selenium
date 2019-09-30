package test.java;

public class SendVideo {

    public static void sendVideoForProspect(){

        Reusable reuse = new Reusable();
        reuse.waitUntilInVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("invisibleElement"));
        reuse.waitUntilPresenceOfElementLocatedXpath(String.format(Reusable.readFromHashMap("sendVideo"), TestVariables.emailId));
        reuse.locateByXpath(String.format(Reusable.readFromHashMap("sendVideo"), TestVariables.emailId)).click();
    }

}
