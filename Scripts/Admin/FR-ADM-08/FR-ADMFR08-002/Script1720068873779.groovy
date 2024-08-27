import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Admin/FR-ADM-02. FR-ADM-04, Done/TC-ADMFR02-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Menambah Staff/Tab Data Staff'))

WebUI.verifyElementPresent(findTestObject('Melihat Data Staff/Table Data Staff'), 0)

WebUI.verifyElementVisible(findTestObject('Melihat Data Staff/Table Data Staff'))

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

String textToFind = 'Emma Jones'

boolean textFound = false

boolean nextPageExists = true

while (nextPageExists) {
    // Verify if the text is present in the table on the current page
    if (WebUI.verifyTextPresent(textToFind, false, FailureHandling.OPTIONAL)) {
        println("Text '$textToFind' is found on the current page.")

        textFound = true

        break // If the next button click fails, assume there are no more pages
    } else {
        println("Text '$textToFind' is not found on the current page.")

        if (WebUI.verifyElementClickable(findTestObject('Object Repository/Reviewer Tab/Next Page Button Reviewer Table'), 
            FailureHandling.OPTIONAL)) {
            try {
                WebUI.click(findTestObject('Object Repository/Reviewer Tab/Next Page Button Reviewer Table'))

                println('Clicked on the Next button to proceed to the next page.')

                WebUI.delay(3)
            }
            catch (Exception e) {
                println('Failed to click the Next button: ' + e.message)

                nextPageExists = false
            } 
        } else {
            println('Next Page button is not present. Assuming there are no more pages.')

            nextPageExists = false
        }
    }
    
    // Add a delay if necessary to allow the page to update after the click
    WebUI.delay(2 // Adjust the delay as per your requirement
        )
}

if (!(textFound)) {
    WebUI.comment("Text '$textToFind' was not found in the table on any page.")

    throw new StepFailedException("Test case failed because the text '$textToFind' was not found.")
} else {
    WebUI.comment("Test case passed because the text '$textToFind' was found.")

    WebUI.doubleClick(findTestObject('Melihat Data Staff/Page_Data Staf  Fraud Deterrence Propeller/Action Button Fixed Reviewer'))

    WebUI.doubleClick(findTestObject('Melihat Data Staff/Page_Data Staf  Fraud Deterrence Propeller/li_Nonaktif'))
}

String toastMessageText = WebUI.getText(findTestObject('Object Repository/Melihat Data Staff/Page_Data Staf  Fraud Deterrence Propeller/Toast Berhasil Mengubah Status'))

String partialTextToVerify = 'Berhasil'

assert toastMessageText.contains(partialTextToVerify)

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-01, FR-RIN-03/TC-RINFR01-001 - For confirming login error'), [:], 
    FailureHandling.STOP_ON_FAILURE)

