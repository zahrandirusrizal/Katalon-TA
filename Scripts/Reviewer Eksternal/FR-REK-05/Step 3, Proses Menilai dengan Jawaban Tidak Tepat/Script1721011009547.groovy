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
import org.openqa.selenium.WebElement as WebElement

WebUI.delay(10)

if (isMulaiPenilaianVisible() == false){
	WebUI.comment("Text Mulai Penilaian was not found in the table on any page.")
	WebUI.verifyEqual(1, 0) // This will fail the test case immediately
	
}

// Function to check if "Mulai Penilaian" text is visible
// Loop until "Mulai Penilaian" is not visible
// Loop while "Mulai Penilaian" text is visible
//String searchText = "Mulai Penilaian"
//boolean isTextPresent = WebUI.verifyTextPresent(searchText, false)
while (isMulaiPenilaianVisible()) {
    // Perform actions based on the visibility of "Mulai Penilaian"
    WebUI.doubleClick(findTestObject('Reviewer Tab/Proses Menilai/Button Mulai Penilaian 1,1'))

    WebUI.delay(5)

    // Example switch statements based on the last segment of the URL
    String currentUrl = WebUI.getUrl()

    String[] urlSegments = currentUrl.split('/')

    String lastSegment = (urlSegments[-1]).trim()

    switch (lastSegment) {
        case '1.1':
            println('Last segment of URL is \'1.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 1.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '1.2':
            println('Last segment of URL is \'1.2\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 1.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '2.1':
            println('Last segment of URL is \'2.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 2.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '2.2':
            println('Last segment of URL is \'2.2\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 2.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '3.1':
            println('Last segment of URL is \'3.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 3.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '3.2':
            println('Last segment of URL is \'3.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 3.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '4.1':
            println('Last segment of URL is \'4.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 4.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '4.2':
            println('Last segment of URL is \'4.2\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 4.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '5.1':
            println('Last segment of URL is \'5.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 5.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '6.1':
            println('Last segment of URL is \'6.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 6.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        default:
            println("Last segment of URL ('$lastSegment') does not match any expected cases.")}
    
    // Optionally add a delay to avoid constant checking and to manage performance
    WebUI.delay(2 // Adjust the delay time as per your requirement
        )
}

def isMulaiPenilaianVisible() {
    return WebUI.verifyTextPresent('Mulai Penilaian', false, FailureHandling.OPTIONAL)
}

