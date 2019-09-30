package test.java;

public class PostRecordingActions {
    private static String videoDraftMessage = "Video Drafted";
    public static void dismissAfterRecordPopUpOrSendEmail(){

        Reusable reuse = new Reusable();
        reuse.locateById(Reusable.readFromHashMap("dismissFrame")).click();
        reuse.waitUntilInVisibilityOfElementLocatedById(Reusable.readFromHashMap("afterRecordPopUp"));

    }

    public static void dismissBeforeRecordPopUp(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("recordPopUp"));
        reuse.locateById(Reusable.readFromHashMap("dismissFrame")).click();
        reuse.waitUntilInVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("recordPopUp"));

    }

    public static void validateVideoDraftMessage(){

        Reusable reuse = new Reusable();
        reuse.waitUntilPresenceOfElementLocatedXpath(String.format(Reusable.readFromHashMap("videoDraft"), TestVariables.emailId));
        reuse.locateByXpath(String.format(Reusable.readFromHashMap("videoDraft"), TestVariables.emailId)).getText().trim().equals(videoDraftMessage);
    }

    public static void clickVideoDraft(){

        Reusable reuse = new Reusable();
        reuse.waitUntilPresenceOfElementLocatedXpath(String.format(Reusable.readFromHashMap("videoDraft"), TestVariables.emailId));
        reuse.locateByXpath(String.format(Reusable.readFromHashMap("videoDraft"), TestVariables.emailId)).click();
    }
}
