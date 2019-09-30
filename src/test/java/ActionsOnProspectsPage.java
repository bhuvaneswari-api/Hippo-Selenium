package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ActionsOnProspectsPage {

    public static String deleteAllContactsText = "Are you sure you want to delete the selected prospect(s)?";
    public static void selectAllProspects(){
        Reusable reuse = new Reusable();
        reuse.waitUntilPresenceOfElementLocatedXpath(Reusable.readFromHashMap("selectAllCheckBox"));
        reuse.locateByXpath(Reusable.readFromHashMap("selectAllCheckBox")).click();
    }
    public static void deleteAllProspects(){

        Reusable reuse = new Reusable();
        reuse.waitUntilPresenceOfElementLocatedById(Reusable.readFromHashMap("deleteAll"));
        reuse.locateById(Reusable.readFromHashMap("deleteAll")).click();
        reuse.locateByXpath(Reusable.readFromHashMap("alertBoxMessage")).getText().trim().equals(deleteAllContactsText);
    }
    public static void filterAndValidate(){

        Reusable reuse = new Reusable();
        int unopenedVideos, openedVideos, watchedVideos, tableContents;
        reuse.waitUntilInVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("invisibleElement"));
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactsFilter"));
        Select filterOptions = new Select(reuse.locateById(Reusable.readFromHashMap("contactsFilter")));
        unopenedVideos = reuse.getSizeOfWebElements(Reusable.readFromHashMap("sentVideos"));
        openedVideos = reuse.getSizeOfWebElements(Reusable.readFromHashMap("openedVideos"));
        watchedVideos = reuse.getSizeOfWebElements(Reusable.readFromHashMap("playedVideos"));

        filterOptions.selectByVisibleText("Video Mails Sent");
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactsTab"));
        tableContents = reuse.getSizeOfWebElements(Reusable.readFromHashMap("tableContents"));
        Assert.assertEquals((unopenedVideos+openedVideos+watchedVideos), tableContents, "Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("Video Mails to be Opened");
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactsTab"));
        tableContents = reuse.getSizeOfWebElements(Reusable.readFromHashMap("tableContents"));
        Assert.assertEquals(unopenedVideos, tableContents, "Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("Video Mails Opened");
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactsTab"));
        tableContents = reuse.getSizeOfWebElements(Reusable.readFromHashMap("tableContents"));
        Assert.assertEquals(openedVideos, tableContents, "Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("Videos Watched");
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactsTab"));
        tableContents = reuse.getSizeOfWebElements(Reusable.readFromHashMap("tableContents"));
        Assert.assertEquals(watchedVideos, tableContents,"Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("None");
        reuse.commonWait(1);

    }
    public static void searchByEmail(){
        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("searchContactsBox"));
        reuse.locateById(Reusable.readFromHashMap("searchContactsBox")).sendKeys(TestVariables.emailId + Keys.ENTER);
//        reuse.locateById(Reusable.readFromHashMap("searchContactsBox")).sendKeys();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("contactsTab"));
        int tableContents = reuse.getSizeOfWebElements(Reusable.readFromHashMap("tableContents"));
        Assert.assertEquals(1, tableContents, "Search is not working as expected");
    }
    public static void exportContactsAsFile(){

        Reusable reuse = new Reusable();
        Reusable.createFolderIfDoesNotExists();
        reuse.waitUntilPresenceOfElementLocatedById(Reusable.readFromHashMap("exportContactsAsFile"));
        reuse.locateById(Reusable.readFromHashMap("exportContactsAsFile")).click();
        reuse.waitUntilPresenceOfElementLocatedById(Reusable.readFromHashMap("exportContactsAsCsv"));
        reuse.locateById(Reusable.readFromHashMap("exportContactsAsCsv")).click();
        Reusable.validateNumberOfFilesinDir(1);
        reuse.waitUntilPresenceOfElementLocatedById(Reusable.readFromHashMap("exportContactsAsFile"));
        reuse.locateById(Reusable.readFromHashMap("exportContactsAsFile")).click();
        reuse.waitUntilPresenceOfElementLocatedById(Reusable.readFromHashMap("exportContactAsXls"));
        reuse.locateById(Reusable.readFromHashMap("exportContactAsXls")).click();
        Reusable.validateNumberOfFilesinDir(2);
        Reusable.deleteDirContents();
        Reusable.validateNumberOfFilesinDir(0);
        Reusable.deleteDirectory();
        reuse.commonWait(5);

    }
}
