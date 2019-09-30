package test.java;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import test.data.DataProvider;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

import static test.java.InitializeAndCloseDriver.*;

public class Reusable {

    public WebDriver driver = chromeDriver;
    public WebDriverWait wait = new WebDriverWait(chromeDriver, 60);

    public static String readFromHashMap(String key){

        String value = "";

        if(DataProvider.dataFromProperties.containsKey(key)){
            value = DataProvider.dataFromProperties.get(key);
        }
        else{
            Assert.fail("Given key is not present in the properties file");
        }
        return value;
    }

    public WebElement locateById(String locator){

        WebElement element = driver.findElement(By.id(locator));

        return element;
    }

    public WebElement locateByClassName(String locator){

        WebElement element = driver.findElement(By.className(locator));

        return element;
    }

    public WebElement locateByXpath(String locator){

        WebElement element = driver.findElement(By.xpath(locator));

        return element;
    }

    public WebElement locateBycssSelector(String locator){

        WebElement element = driver.findElement(By.cssSelector(locator));

        return element;
    }

    public void waitUntilVisibilityOfElementLocatedById(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }

    public void waitUntilVisibilityOfElementLocatedByClassName(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
    }

    public void waitUntilVisibilityOfElementLocatedByXpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void waitUntilPresenceOfElementLocatedById(String locator){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
    }

    public void waitUntilPresenceOfElementLocatedXpath(String locator){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
//
    public void waitUntilInVisibilityOfElementLocatedById(String locator){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locator)));
    }

    public void waitUntilInVisibilityOfElementLocatedByXpath(String locator){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }

    public void waitUntilInVisibilityOfElementLocatedByClassName(String locator){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locator)));
    }

    public int getSizeOfWebElements(String locator){

        int count;
        List<WebElement> elements;
//        waitUntilPresenceOfElementLocatedXpath(locator);
        try{
            elements = driver.findElements(By.xpath(locator));
        }
        catch (NoSuchElementException e){
            elements = null;
        }
//        elements = driver.findElements(By.xpath(locator));
        if(elements != null) {
            count = elements.size();
        }
        else{
            count = 0;
        }
        return count;
    }

    public void commonWait(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public static void validateNumberOfFilesinDir(int numberOfFiles){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(numberOfFiles, Reusable.getDirectoryContents(), "The files are not downloaded as expected");
    }

    public static void deleteDirContents() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
}
