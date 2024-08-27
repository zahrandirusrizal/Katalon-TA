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

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Staff/FR-STF-01, FR-STF-03/FR-STFFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Tab Fraud Assesment agar dialihkan ke halaman terkait'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Tab Fraud Assesment'))

'Klik button "Isi Fraud Assesment" untuk mulai melakukan proses mengisi fraud assesment'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Isi Fraud Assesment'))

WebUI.delay(5)

//to check if there is any assesment questions to be filled
if (isMulaiVisible() == false) {
    WebUI.comment('Text Mulai Penilaian was not found in the table on any page.')

    WebUI.verifyEqual(1, 0 // This will fail the test case immediately
        )
}

// Function to check if "Mulai Penilaian" text is visible
// Loop until "Mulai Penilaian" is not visible
// Loop while "Mulai Penilaian" text is visible
//String searchText = "Mulai Penilaian"
//boolean isTextPresent = WebUI.verifyTextPresent(searchText, false)
while (isMulaiVisible()) {
    // Perform actions based on the visibility of "Mulai Penilaian"
    WebUI.doubleClick(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Tombol Mulai Paket Soal/Mulai Paket Soal 1.1'))

    WebUI.delay(5)

    // Example switch statements based on the last segment of the URL
    String currentUrl = WebUI.getUrl()

    String[] urlSegments = currentUrl.split('/')

    String lastSegment = (urlSegments[-1]).trim()

    switch (lastSegment) {
        case '1.1':
            println('Last segment of URL is \'1.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 1.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '1.2':
            println('Last segment of URL is \'1.2\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 1.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '2.1':
            println('Last segment of URL is \'2.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 2.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '2.2':
            println('Last segment of URL is \'2.2\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 2.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '3.1':
            println('Last segment of URL is \'3.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 3.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '3.2':
            println('Last segment of URL is \'3.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 3.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '4.1':
            println('Last segment of URL is \'4.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 4.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '4.2':
            println('Last segment of URL is \'4.2\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 4.2'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '5.1':
            println('Last segment of URL is \'5.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 5.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        case '6.1':
            println('Last segment of URL is \'6.1\'. Executing corresponding test case or logic.')

            // Call the appropriate test case or perform actions here
            WebUI.callTestCase(findTestCase('Test Cases/Admin/FR-ADM-09, Done/Jawaban Belum Ada/Tanpa upload file/Mengisi 6.1'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            break
        default:
            println("Last segment of URL ('$lastSegment') does not match any expected cases.")}
    
    // Optionally add a delay to avoid constant checking and to manage performance
    WebUI.delay(2 // Adjust the delay time as per your requirement
        )
}

def isMulaiVisible() {
    return WebUI.verifyTextPresent('Mulai', false, FailureHandling.OPTIONAL)
}

