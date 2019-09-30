package test.java;

public class RecordVideoInModal {

    public static void recordingVideoThroughWebCam(){

        Reusable reuse = new Reusable();
        reuse.waitUntilVisibilityOfElementLocatedByClassName(Reusable.readFromHashMap("recordPopUp"));
        reuse.locateById(Reusable.readFromHashMap("startRecordingButton")).click();
        reuse.commonWait(15);
        reuse.locateById(Reusable.readFromHashMap("stopRecordingButton")).click();
        reuse.waitUntilVisibilityOfElementLocatedById(Reusable.readFromHashMap("afterRecordPopUp"));
    }
}

