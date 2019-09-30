package test.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.data.DataProvider;
import test.java.*;

public class TestNG {

    @BeforeClass
    public static void openBrowser(){
        DataProvider.loadIntoHashMap();
        InitializeAndCloseDriver.driverInitialize();
    }

    @Test(priority = 1)
    public void launchApplication(){
        LaunchAndLogin.launchAndLoginToTheApplication();
    }

    @Test(priority = 2)
    public void createProspects(){
        CreateProspects.createProspect();
        CreateProspects.fillProspectsDetails();
        CreateProspects.denyCreateProspects();
        CreateProspects.createProspect();
        CreateProspects.fillProspectsDetails();
        CreateProspects.proceedCreateProspects();
    }

    @Test(priority = 3)
    public void retakeOrDeleteCapturedVideo(){
        SendVideo.sendVideoForProspect();
        RecordVideoInModal.recordingVideoThroughWebCam();
        PostRecordingActions.dismissAfterRecordPopUpOrSendEmail();
        DraftedVideoActions.retakeVideoFromProspectsPage();
        DraftedVideoActions.denyRetakeOrDeleteVideo();
        DraftedVideoActions.retakeVideoFromProspectsPage();
        DraftedVideoActions.acceptRetakeOrDeleteVideo();
        RecordVideoInModal.recordingVideoThroughWebCam();
        PostRecordingActions.dismissAfterRecordPopUpOrSendEmail();
        DraftedVideoActions.deleteVideoFromProspectsPage();
        DraftedVideoActions.denyRetakeOrDeleteVideo();
        DraftedVideoActions.deleteVideoFromProspectsPage();
        DraftedVideoActions.acceptRetakeOrDeleteVideo();
    }

    @Test(priority = 4)
    public void sendVideoToProspects(){
        SendVideo.sendVideoForProspect();
        PostRecordingActions.dismissBeforeRecordPopUp();
        SendVideo.sendVideoForProspect();
    }

    @Test(priority = 5)
    public void recordingWebCamVideo(){
        RecordVideoInModal.recordingVideoThroughWebCam();
        PostRecordingActions.dismissAfterRecordPopUpOrSendEmail();
        PostRecordingActions.validateVideoDraftMessage();
    }

    @Test(priority = 6)
    public void editDraftedVideoAndRetake(){
        PostRecordingActions.clickVideoDraft();
        PostRecordModalActions.copyLinkOfVideo();
        PostRecordModalActions.copyEmailEmbedCode();
        PostRecordModalActions.retakeVideoFromModal();
        PostRecordModalActions.cancelRetakeFromModal();
        PostRecordModalActions.retakeVideoFromModal();
        PostRecordModalActions.proceedRetakeFromModal();
        RecordVideoInModal.recordingVideoThroughWebCam();
    }

    @Test(priority = 7)
    public void sendEmailActions(){
        SendEmailModalActions.sendEmailAction();
        SendEmailModalActions.cancelEmailSendOption();
        SendEmailModalActions.sendEmailAction();
        SendEmailModalActions.editEmailTemplate("Discount");
        SendEmailModalActions.proceedSendEmail();
    }


    @Test(priority = 8)
    public void selectDeselectAllFilterAndSearchContacts(){
        ActionsOnProspectsPage.selectAllProspects();
        ActionsOnProspectsPage.selectAllProspects();
        ActionsOnProspectsPage.filterAndValidate();
        ActionsOnProspectsPage.searchByEmail();
    }

    @Test(priority = 9)
    public void exportContactsASFileAndDeleteAllContacts(){
        ActionsOnProspectsPage.exportContactsAsFile();
        ActionsOnProspectsPage.selectAllProspects();
//        ActionsOnProspectsPage.deleteAllProspects();
    }

    @Test(priority = 10)
    public void logoutApplication(){
        Logout.LogoutOfApplication();
    }

    @AfterClass
    public static void closeBrowser(){
        InitializeAndCloseDriver.closeDriver();
    }


}
