package test.java;

import static test.java.PostRecordModalActions.*;

public class DraftedVideoActions {

    public static void retakeVideoFromProspectsPage(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedByXpath(String.format(Reusable.readFromHashMap("retakeFromProspects"), TestVariables.emailId));
        reuse.locateByXpath(String.format(Reusable.readFromHashMap("retakeFromProspects"), TestVariables.emailId)).click();
    }
    public static void deleteVideoFromProspectsPage(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedByXpath(String.format(Reusable.readFromHashMap("deleteFromProspects"), TestVariables.emailId));
        reuse.locateByXpath(String.format(Reusable.readFromHashMap("deleteFromProspects"), TestVariables.emailId)).click();
    }
    public static void denyRetakeOrDeleteVideo(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactPopUp"));
        reuse.locateByXpath(Reusable.readFromHashMap("alertBoxMessage")).getText().trim().equals(retakeDeletePopUpText);
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("denyRetakeOrDelete"));
        reuse.locateById(Reusable.readFromHashMap("denyRetakeOrDelete")).click();
        reuse.waitUntilInVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactPopUp"));

    }
    public static void acceptRetakeOrDeleteVideo(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactPopUp"));
        reuse.locateByXpath(Reusable.readFromHashMap("alertBoxMessage")).getText().trim().equals(retakeDeletePopUpText);
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("acceptRetakeOrDelete"));
        reuse.locateById(Reusable.readFromHashMap("acceptRetakeOrDelete")).click();
        reuse.waitUntilInVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactPopUp"));
    }
}
