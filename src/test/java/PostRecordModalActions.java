package test.java;

public class PostRecordModalActions {

    private static String copyLinkText = "Video URL is copied to clipboard. You can share it now.";
    private static String copyEmbedCodeText = "Email embed code is copied to clipboard. Now you can paste this in your email client and share it.";
    public static String retakeDeletePopUpText = "The video which you have recorded will be lost forever. Are you sure you want to delete & retake the video?";

    public static void copyLinkOfVideo(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("copyVideoLink"));
        reuse.locateById(Reusable.readFromHashMap("copyVideoLink")).click();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("copyLinkStatus"));
        reuse.locateById(Reusable.readFromHashMap("copyLinkStatus")).isDisplayed();
        reuse.locateById(Reusable.readFromHashMap("copyLinkStatus")).getText().trim().replaceAll("\n", " ").equals(copyLinkText);
    }

    public static void copyEmailEmbedCode(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("copyEmbedCode"));
        reuse.locateById(Reusable.readFromHashMap("copyEmbedCode")).click();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("copyLinkStatus"));
        reuse.locateById(Reusable.readFromHashMap("copyLinkStatus")).isDisplayed();
        reuse.locateById(Reusable.readFromHashMap("copyLinkStatus")).getText().trim().replaceAll("\n", " ").equals(copyEmbedCodeText);

    }

    public static void retakeVideoFromModal(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("reTakeVideoFromModal"));
        reuse.locateById(Reusable.readFromHashMap("reTakeVideoFromModal")).click();
        reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("reTakeAlertMessage"));
        reuse.locateByXpath(Reusable.readFromHashMap("reTakeAlertMessage")).getText().trim().equals(retakeDeletePopUpText);

    }

    public static void cancelRetakeFromModal(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("cancelRetakeFromModal"));
        reuse.locateById(Reusable.readFromHashMap("cancelRetakeFromModal")).click();
    }

    public static void proceedRetakeFromModal(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("proceedRetakeFromModal"));
        reuse.locateById(Reusable.readFromHashMap("proceedRetakeFromModal")).click();
    }
}
