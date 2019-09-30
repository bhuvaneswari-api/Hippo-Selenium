package test.java;

public class CreateProspects {

    public static void createProspect(){
        Reusable reuse = new Reusable();
        reuse.waitUntilPresenceOfElementLocatedById(Reusable.readFromHashMap("createProspectButton"));
        reuse.locateById(Reusable.readFromHashMap("createProspectButton")).click();
    }

    public static void fillProspectsDetails(){
        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("createProspectPopUp"));
        reuse.locateById(Reusable.readFromHashMap("emailInput")).sendKeys(TestVariables.emailId);
        reuse.locateById(Reusable.readFromHashMap("firstNameInput")).sendKeys(TestVariables.firstName);
        reuse.locateById(Reusable.readFromHashMap("lastNameInput")).sendKeys(TestVariables.lastName);
        reuse.locateById(Reusable.readFromHashMap("companyNameInput")).sendKeys(TestVariables.companyName);
        reuse.locateById(Reusable.readFromHashMap("notesInput")).sendKeys(TestVariables.writeNotes);

    }

    public static void proceedCreateProspects(){
        Reusable reuse = new Reusable();
        reuse.locateById(Reusable.readFromHashMap("createProspect")).click();
        reuse.waitUntilInVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("invisibleElement"));
    }

    public static void denyCreateProspects(){
        Reusable reuse = new Reusable();
        reuse.locateById(Reusable.readFromHashMap("cancelProspect")).click();
        reuse.waitUntilInVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("invisibleElement"));
    }
}
