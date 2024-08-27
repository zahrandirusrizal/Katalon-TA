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
WebUI.callTestCase(findTestCase('Reviewer Eksternal/FR-REK-01, FR-REK-03/TC-REKFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Reviewer Tab/Halaman Penilaian Fraud Assesment'))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

String textToFind = 'Bad'

boolean textFound = false

boolean nextPageExists = true

while (nextPageExists) {
    // Verify if the text is present in the table on the current page
    if (WebUI.verifyTextPresent(textToFind, false, FailureHandling.OPTIONAL)) {
        println("Text '$textToFind' is found on the current page.")

        textFound = true

        break // Check if the Next Page button is present
        // Adjust the delay time as per your requirement
        // If the next button click fails, assume there are no more pages
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

    KeywordUtil.markPassed('The table has more or equal to 6 rows.')
}

