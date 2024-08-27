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

WebUI.delay(5)

String currentUrl = WebUI.getUrl()

// Split the URL by '/'
String[] urlSegments = currentUrl.split('/')

// Get the last segment
String lastSegment = (urlSegments[-1]).trim()

// Get the second last segment
String secondLastSegment = (urlSegments[-2]).trim()

String result = secondLastSegment + '/' + lastSegment

	switch (result) {
		case '1.1/edit':
			println('Last segment of URL is \'1.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 1.1'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '1.2/edit':
			println('Last segment of URL is \'1.2\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 1.2'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '2.1/edit':
			println('Last segment of URL is \'2.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 2.1'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '2.2/edit':
			println('Last segment of URL is \'2.2\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 2.2'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '3.1/edit':
			println('Last segment of URL is \'3.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 3.1'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '3.2/edit':
			println('Last segment of URL is \'3.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 3.2'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '4.1/edit':
			println('Last segment of URL is \'4.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 4.1'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '4.2/edit':
			println('Last segment of URL is \'4.2\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 4.2'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '5.1/edit':
			println('Last segment of URL is \'5.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 5.1'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		case '6.1/edit':
			println('Last segment of URL is \'6.1\'. Executing corresponding test case or logic.')

			// Call the appropriate test case or perform actions here
			WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Menilai Per Sub Bab/Jawaban Tidak Tepat/Menilai 6.1'),
				[:], FailureHandling.STOP_ON_FAILURE)

			break
		default:
			println("Last segment of URL ('$lastSegment') does not match any expected cases.")
		}
	
	// Optionally add a delay to avoid constant checking and to manage performance
	WebUI.delay(2 // Adjust the delay time as per your requirement
		)