package test.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import static test.java.InitializeAndCloseDriver.*;

public class SendEmailModalActions {

    private static String javaScriptCommandForDiscountExpiry = "var ele=arguments[0]; ele.innerHTML = 'So, let’s get going because the special offer lasts only till Jan 2020'";
    private static String javaScriptCommandForRefferalDiscount = "var ele=arguments[0]; ele.innerHTML = 'So, let’s get going because the special offer lasts only till Jan 2020'";
    private static String javaScriptCommandForRefferalExpiry = "var ele=arguments[0]; ele.innerHTML = 'So, let’s get going because the special offer lasts only till Jan 2020'";
    private static String sentVideoText = "Video Sent";

    public static void sendEmailAction(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("sendEmailButton"));
        reuse.locateById(Reusable.readFromHashMap("sendEmailButton")).click();
        reuse.waitUntilVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("recordPopUp"));

    }

    public static void cancelEmailSendOption(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("cancelSendEmail"));
        reuse.locateById(Reusable.readFromHashMap("cancelSendEmail")).click();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("afterRecordPopUp"));

    }

    public static void editEmailTemplate(String emailTemplateToSelect){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("emailTemplateDropDownBox"));
        Select emailTemplate = new Select(reuse.locateById(Reusable.readFromHashMap("emailTemplateDropDownBox")));
        switch (emailTemplateToSelect){
            case "Discount":
                emailTemplate.selectByVisibleText("Discount Offer");
                reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("discountExpiryDate"));
                ((JavascriptExecutor) chromeDriver).executeScript(javaScriptCommandForDiscountExpiry, reuse.locateByXpath(Reusable.readFromHashMap("discountExpiryDate")));
                break;
            case "Refer":
                emailTemplate.selectByVisibleText("Refer a friend");
                reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("refferalDiscountPercent"));
                ((JavascriptExecutor) chromeDriver).executeScript(javaScriptCommandForRefferalDiscount, reuse.locateByXpath(Reusable.readFromHashMap("refferalDiscountPercent")));
                ((JavascriptExecutor) chromeDriver).executeScript(javaScriptCommandForRefferalExpiry, reuse.locateByXpath(Reusable.readFromHashMap("refferalExpiryDate")));
                break;
            case "Welcome":
                emailTemplate.selectByVisibleText("Welcome");
                break;
            case "Thanks":
                emailTemplate.selectByVisibleText("Thank you");
                break;
            case "Video":
                emailTemplate.selectByVisibleText("Video Testimonial");
                break;
        }
        reuse.commonWait(1);
    }

    public static void proceedSendEmail(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedByXpath(Reusable.readFromHashMap("proceedSendEmail"));
        reuse.locateByXpath(Reusable.readFromHashMap("proceedSendEmail"));
        reuse.commonWait(3);
        reuse.waitUntilPresenceOfElementLocatedXpath(String.format(Reusable.readFromHashMap("sentVideo"), TestVariables.emailId));
        reuse.locateByXpath(String.format(Reusable.readFromHashMap("sentVideo"), TestVariables.emailId)).getText().trim().equals(sentVideoText);

    }
}
