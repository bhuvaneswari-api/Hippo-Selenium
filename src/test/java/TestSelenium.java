package test.java;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.io.File;
import java.util.List;


public class TestSelenium {


//    private WebDriverWait driverToUse;
//    public String directoryName = downloadPath.concat(this.getClassName());

    public static void main(String args[]) throws InterruptedException {



//        String newPath = Path.Combine("C:\\Users\\b.kumarraja\\Downloads\\new downloads", "Database");
//        if (!Directory.Exists(newPath)){
//            newPath = Directory.CreateDirectory(newPath).FullName;
//        }

//        WebDriverWait wait = new WebDriverWait(InitializeAndCloseDriver.chromeDriver, 60);
//        TestSelenium.createFolderIfDoesNotExists();
//
//
//
//
//
//        TestSelenium.launchAndLoginToTheApp(InitializeAndCloseDriver.chromeDriver);
//
//        TestSelenium.createFolderIfDoesNotExists();
//        TestSelenium.createNewProspects(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.clickSendVideo(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.dismissBeforeRecordFrame(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.clickSendVideo(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.recordVideoInModal(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.dismissAfterRecordFrameOrSendEmailAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.validateVideoDraftedMessage(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.retakeVideoAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.denyRetakeOrDeleteAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.validateVideoDraftedMessage(InitializeAndCloseDriver.driver, wait);
////        System.out.println(text);
//
//        TestSelenium.retakeVideoAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.acceptRetakeOrDeleteAction(InitializeAndCloseDriver.driver);
//
//        TestSelenium.recordVideoInModal(InitializeAndCloseDriver.driver, wait);
//
//          TestSelenium.copyVideoLink(InitializeAndCloseDriver.driver, wait);
//
//          TestSelenium.copyEmailEmbedCode(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.retakeVideoFromModal(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.cancelRetakeFromModal(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.retakeVideoFromModal(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.proceedRetakeFromModal(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.recordVideoInModal(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.clickSendEmailAfterRecordingModal(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.cancelSendEmailOption(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.clickSendEmailAfterRecordingModal(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.selectEmailTemplate(InitializeAndCloseDriver.driver, wait, "Welcome");

//        TestSelenium.proceedSendEmailOption(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.deleteVideoRecorded(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.denyRetakeOrDeleteAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.validateVideoDraftedMessage(InitializeAndCloseDriver.driver, wait);

//
//        TestSelenium.deleteVideoRecorded(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.acceptRetakeOrDeleteAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.selectAllProspects(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.deleteAllProspects(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.denyRetakeOrDeleteAction(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.deleteAllProspects(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.acceptRetakeOrDeleteAction(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.filterContactsAndValidate(InitializeAndCloseDriver.driver, wait);
//
//        TestSelenium.searchContact(InitializeAndCloseDriver.driver, wait);

//        TestSelenium.exportContactAsFiles(InitializeAndCloseDriver.chromeDriver, wait);
//
//        TestSelenium.validateNumberOfFilesinDir(2);
//
//        TestSelenium.deleteDirContents();
//
//        TestSelenium.validateNumberOfFilesinDir(0);
//
//        TestSelenium.deleteDirectory();



        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        InitializeAndCloseDriver.chromeDriver.close();
    }

    public static String generateRandomAlphaNumericValue(int length) {

        String alphaNumericValue = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {

            int index = (int) (alphaNumericValue.length() * Math.random());

            sb.append(alphaNumericValue.charAt(index));
        }

        return sb.toString();
    }


//    public static void launchAndLoginToTheApp(WebDriver driverToUse) {
//
//        // login to the application
//
//        driverToUse.get("https://www.hippovideo.io/contacts/home");
//
//        driverToUse.findElement(By.id("user_email")).sendKeys("bhuvana.kumarraja@gmail.com");
//
//        driverToUse.findElement(By.id("user_password")).sendKeys("July@10");
//
//        driverToUse.findElement(By.xpath(".//input[@type='submit']")).click();
//    }
//
//    public static void createNewProspects(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        // Create new prospects
//
//        driverToUse.findElement(By.id("addManually")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("createListPop")));
//
//        driverToUse.findElement(By.id("contactEmail")).sendKeys(TestVariables.emailId);
//
//        driverToUse.findElement(By.id("contactFirstName")).sendKeys(TestVariables.firstName);
//
//        driverToUse.findElement(By.id("contactLastName")).sendKeys(TestVariables.lastName);
//
//        driverToUse.findElement(By.id("contactCompanyName")).sendKeys(TestVariables.companyName);
//
//        driverToUse.findElement(By.id("contactNotes")).sendKeys(TestVariables.writeNotes);
//
//        driverToUse.findElement(By.id("createListPopYesBtn")).click();
//    }
//
//    public static void clickSendVideo(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//
//        //Recording Video with webcam
//
////        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.id("contactsListContainer")));
//        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.className("reveal-modal-bg")));
////        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactsListContainer")));
//        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//span[contains(@id, 'sendVideo') and (@data-contact-email='" + TestVariables.emailId + "')]")));
//        driverToUse.findElement(By.xpath(".//span[contains(@id, 'sendVideo') and (@data-contact-email='" + TestVariables.emailId + "')]")).click();
//
//    }
//
//    public static void recordVideoInModal(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.className("record-body")));
//
//        driverToUse.findElement(By.id("startRecordingBtn")).click();
//
//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driverToUse.findElement(By.id("stopRecordingBtn")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("afterRecordContainer")));
//    }
//
//    public static void dismissAfterRecordFrameOrSendEmailAction(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        TestSelenium.dismissAnyFrame(driverToUse);
//
//        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.id("afterRecordContainer")));
////        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[(@class='video-draft') and (@data-contact-email='"+TestSelenium.emailId+"')]")));
//
//    }
//
//    public static void dismissBeforeRecordFrame(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.className("record-body")));
//
//        TestSelenium.dismissAnyFrame(driverToUse);
//
//        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.className("record-body")));
//    }
//
//    public static void validateVideoDraftedMessage(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//a[(@class='video-draft') and (@data-contact-email='" + TestVariables.emailId + "')]")));
//        driverToUse.findElement(By.xpath(".//a[(@class='video-draft') and (@data-contact-email='" + TestVariables.emailId + "')]")).getText().trim().equals("Video Drafted");
//    }
//
//    public static void clickVideoDraftedLink(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//a[(@class='video-draft') and (@data-contact-email='" + TestVariables.emailId + "')]")));
//        driverToUse.findElement(By.xpath(".//a[(@class='video-draft') and (@data-contact-email='" + TestVariables.emailId + "')]")).click();
//    }
//
//    public static void denyRetakeOrDeleteAction(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        driverToUse.findElement(By.id("contactDeleteNoBtn")).click();
//
//        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.id("contactDelete")));
//    }
//
//    public static void acceptRetakeOrDeleteAction(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        driverToUse.findElement(By.id("contactDeleteYesBtn")).click();
//
//        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.id("contactDelete")));
//    }
//
//    public static void retakeVideoAction(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        driverToUse.findElement(By.xpath(".//span[contains(@class, 'retake') and (@data-contact-email='" + TestVariables.emailId + "')]")).click();
//
//        //        String text =
//        TestSelenium.getAlertBoxText(driverToUse, waitToUse).replace("\n", " ").equals("");
//
//    }
//
//    public static void copyVideoLink(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("actionsCopyLink")));
//
//        driverToUse.findElement(By.id("actionsCopyLink")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("copyLinkStatusMsg")));
//
//        driverToUse.findElement(By.id("copyLinkStatusMsg")).isDisplayed();
//
//        driverToUse.findElement(By.id("copyLinkStatusMsg")).getText().trim().equals("Video URL is copied to clipboard. You can share it now.");
//
//    }
//
//    public static void copyEmailEmbedCode(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("actionsCopyEmbed")));
//
//        driverToUse.findElement(By.id("actionsCopyEmbed")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("copyLinkStatusMsg")));
//
//        driverToUse.findElement(By.id("copyLinkStatusMsg")).isDisplayed();
//
//        driverToUse.findElement(By.id("copyLinkStatusMsg")).getText().trim().equals("Email embed code is copied to clipboard. Now you can paste this in your email client and share it.");
//    }
//
//    public static void retakeVideoFromModal(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("retakeVideo")));
//
//        driverToUse.findElement(By.id("retakeVideo")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='retakeConfirmationContainer']//p[@class='alert-msg']")));
//
////        String text =
//        driverToUse.findElement(By.xpath(".//div[@id='retakeConfirmationContainer']//p[@class='alert-msg']")).getText().trim().equals("");
//
////        System.out.println(text);
//
//    }
//
//    public static void proceedRetakeFromModal(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("proceedForRetake")));
//
//        driverToUse.findElement(By.id("proceedForRetake")).click();
//
//    }
//
//
//    public static void cancelRetakeFromModal(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancelRetake")));
//
//        driverToUse.findElement(By.id("cancelRetake")).click();
//
//    }
//
//    public static void clickSendEmailAfterRecordingModal(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("sendViaGmailBtn")));
//
//        driverToUse.findElement(By.id("sendViaGmailBtn")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.className("record-body")));
//    }
//
//    public static void cancelSendEmailOption(WebDriver driverToUse, WebDriverWait waitToUse) {
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancelEmailBtn")));
//
//        driverToUse.findElement(By.id("cancelEmailBtn")).click();
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("afterRecordContainer")));
//    }
//
//    public static void selectEmailTemplate(WebDriver driverToUse, WebDriverWait waitToUse, String emailTemplateToSelect){
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailTemplatesId")));
//        Select emailTemplate = new Select(driverToUse.findElement(By.id("emailTemplatesId")));
////
//        WebElement discountExpiryDate, referralDiscountPercent, referralExpiryDate;
////        = driverToUse.findElement(By.xpath(".//div[@id='emailMessage']//div[@class='ql-editor']//p[contains(text(), 'special offer lasts')]"));
////        ((JavascriptExecutor)driverToUse).executeScript("var ele=arguments[0]; ele.innerHTML = 'So, let’s get going because the special offer lasts only till Jan 2020'", emailBody);
//
//        switch (emailTemplateToSelect){
//            case "Discount":
//                emailTemplate.selectByVisibleText("Discount Offer");
//                waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='emailMessage']//div[@class='ql-editor']//p[contains(text(), 'special offer lasts')]")));
//                discountExpiryDate = driverToUse.findElement(By.xpath(".//div[@id='emailMessage']//div[@class='ql-editor']//p[contains(text(), 'special offer lasts')]"));
//                ((JavascriptExecutor)driverToUse).executeScript("var ele=arguments[0]; ele.innerHTML = 'So, let’s get going because the special offer lasts only till Jan 2020'", discountExpiryDate);
//                break;
//            case "Refer":
//                emailTemplate.selectByVisibleText("Refer a friend");
//                waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='emailMessage']//div[@class='ql-editor']//p[contains(text(), 'Refer a friend')]")));
//                referralDiscountPercent = driverToUse.findElement(By.xpath(".//div[@id='emailMessage']//div[@class='ql-editor']//p[contains(text(), 'Refer a friend')]"));
//                ((JavascriptExecutor)driverToUse).executeScript("var ele=arguments[0]; ele.innerHTML = 'Refer a friend and get 40% off.'", referralDiscountPercent);
//                referralExpiryDate = driverToUse.findElement(By.xpath(".//div[@id='emailMessage']//div[@class='ql-editor']//p[contains(text(), 'referral program lasts')]"));
//                ((JavascriptExecutor)driverToUse).executeScript("var ele=arguments[0]; ele.innerHTML = 'So, let’s get going because the referral program lasts only till Jan 2020'", referralExpiryDate);
//                break;
//            case "Welcome":
//                emailTemplate.selectByVisibleText("Welcome");
//                break;
//            case "Thanks":
//                emailTemplate.selectByVisibleText("Thank You");
//                break;
//            case "Video":
//                emailTemplate.selectByVisibleText("Video Testimonial");
//                break;
//        }
//    }
//
//
//    public static void proceedSendEmailOption(WebDriver driverToUse, WebDriverWait waitToUse){
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@id='sendEmailBtn' and not (@disabled)]")));
//
//        driverToUse.findElement(By.xpath(".//button[@id='sendEmailBtn' and not (@disabled)]")).click();
////        driverToUse.findElement(By.id("sendEmailBtn")).click();
////        String t = driverToUse.findElement(By.cssSelector("#mailSentSuccess")).getText();
////
////        System.out.println(t);
//
////        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.className("record-body")));
//
//        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//td[contains(text(),'"+TestVariables.emailId+"')]//following-sibling::td[@class='relative']//div[contains(@class,'sent-video')]//a")));
////
//        String text = driverToUse.findElement(By.xpath(".//td[contains(text(),'"+TestVariables.emailId+"')]//following-sibling::td[@class='relative']//div[contains(@class,'sent-video')]//a")).getText();
////
//        System.out.println(text);
//    }
//
//    public static void deleteVideoRecorded(WebDriver driverToUse, WebDriverWait waitToUse){
//
//        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(@class, 'retake') and (@data-contact-email='"+TestVariables.emailId+"')]//following-sibling::span")));
//
//        driverToUse.findElement(By.xpath(".//span[contains(@class, 'retake') and (@data-contact-email='"+TestVariables.emailId+"')]//following-sibling::span")).click();
//
//        TestSelenium.getAlertBoxText(driverToUse, waitToUse).equals("Are you sure you want to delete this video?");
//    }

    public static void selectAllProspects(WebDriver driverToUse, WebDriverWait waitToUse){

        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//label[@for='selectAllCheckbox']")));

        driverToUse.findElement(By.xpath(".//label[@for='selectAllCheckbox']")).click();


    }

    public static void deleteAllProspects(WebDriver driverToUse, WebDriverWait waitToUse){

        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.id("deleteContacts")));
        driverToUse.findElement(By.id("deleteContacts")).click();
        TestSelenium.getAlertBoxText(driverToUse, waitToUse).equals("Are you sure you want to delete the selected prospect(s)?");
    }

    public static void filterContactsAndValidate(WebDriver driverToUse, WebDriverWait waitToUse){

        waitToUse.until(ExpectedConditions.invisibilityOfElementLocated(By.className("reveal-modal-bg")));

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactsFilterBy")));

//        waitToUse.until(ExpectedConditions.presenceOfElementLocated(By.id("contactsFilterBy")));

        Select filterOptions = new Select(driverToUse.findElement(By.id("contactsFilterBy")));

        List<WebElement> unopenedVideos, openedVideos, watchedVideos;

        unopenedVideos = driverToUse.findElements(By.xpath(".//div[contains(@class, 'sent-video')]"));
        openedVideos = driverToUse.findElements(By.xpath(".//div[contains(@class, 'opened-video')]"));
        watchedVideos = driverToUse.findElements(By.xpath(".//div[contains(@class, 'played-video')]"));



        filterOptions.selectByVisibleText("Video Mails Sent");
        Assert.assertEquals((unopenedVideos.size()+openedVideos.size()+watchedVideos.size()), TestSelenium.getTableContentsSize(driverToUse, waitToUse), "Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("Video Mails to be Opened");
        Assert.assertEquals(unopenedVideos.size(), TestSelenium.getTableContentsSize(driverToUse, waitToUse), "Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("Video Mails Opened");
        Assert.assertEquals(openedVideos.size(), TestSelenium.getTableContentsSize(driverToUse, waitToUse), "Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("Videos Watched");
        Assert.assertEquals(watchedVideos.size(), TestSelenium.getTableContentsSize(driverToUse, waitToUse),"Contact Table was not filtered as expected");

        filterOptions.selectByVisibleText("None");


    }

    public static void searchContact(WebDriver driverToUse, WebDriverWait waitToUse){

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactsSearchtext")));

//        WebElement search = driverToUse.findElement(By.cssSelector("div.search-box"));

        driverToUse.findElement(By.id("contactsSearchtext")).sendKeys(TestVariables.emailId);

        driverToUse.findElement(By.id("contactsSearchtext")).sendKeys(Keys.ENTER);

//        ((JavascriptExecutor)driverToUse).executeScript("window.getComputedStyle(arguments[0].click(), ':after')", search);

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactsTable")));

        Assert.assertEquals(1, TestSelenium.getTableContentsSize(driverToUse, waitToUse), "Search is not working as expected");
    }

    public static void exportContactAsFiles(WebDriver driverToUse, WebDriverWait waitToUse){

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("exportContacts")));
        driverToUse.findElement(By.id("exportContacts")).click();
        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("exportAsCSV")));
        driverToUse.findElement(By.id("exportAsCSV")).click();
        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("exportContacts")));
        driverToUse.findElement(By.id("exportContacts")).click();
        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("exportAsXLS")));
        driverToUse.findElement(By.id("exportAsXLS")).click();

    }

    public static int getTableContentsSize(WebDriver driverToUse, WebDriverWait waitToUse){

        int tableContentSize = 0;
        List<WebElement> tableContents;

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactsTable")));

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//table[@id='contactsTable']//tbody//tr")));
        tableContents = driverToUse.findElements(By.xpath(".//table[@id='contactsTable']//tbody//tr"));
        tableContentSize = tableContents.size();
        return tableContentSize;
    }

    public static void createFolderIfDoesNotExists(){


        if(!(TestVariables.directory.exists())){
            TestVariables.directory.mkdir();
        }
    }

    public static int getDirectoryContents(){

        int numberOfFiles = TestVariables.directory.listFiles().length;

        return numberOfFiles;

    }

    public static void validateNumberOfFilesinDir(int numberOfFiles) throws InterruptedException {

        Thread.sleep(2000);

        Assert.assertEquals(numberOfFiles, TestSelenium.getDirectoryContents(), "The files are not downloaded as expected");
    }

    public static void deleteDirContents() throws InterruptedException {

        Thread.sleep(1000);
        if(getDirectoryContents()>0){

            File[] files = TestVariables.directory.listFiles();
            for(File f: files){
                f.delete();
            }
        }
    }

    public static void deleteDirectory() {

        if(getDirectoryContents() == 0){
            TestVariables.directory.delete();
        }
    }

    public static void dismissAnyFrame(WebDriver driverToUse) {

        driverToUse.findElement(By.id("closeFrame")).click();

    }


    public static String getAlertBoxText(WebDriver driverToUse, WebDriverWait waitToUse){

        waitToUse.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactDelete")));

        String textFromPage = driverToUse.findElement(By.xpath(".//div[contains(@class, 'alert-box-message')]")).getText().trim();

        return textFromPage;
    }
}

