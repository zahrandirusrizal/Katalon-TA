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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Weblink)

WebUI.click(findTestObject('Object Repository/Login Objects/Link dalam Button Masuk'))

WebUI.setText(findTestObject('Object Repository/Login Objects/Field Text Username Login'), GlobalVariable.staffUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Login Objects/Field Text Password Login'), GlobalVariable.staffPassword)

WebUI.click(findTestObject('Object Repository/Login Objects/Button Masuk'))

WebUI.waitForElementVisible(findTestObject('Login Objects/Invalid Credentials Toast Login'), 10)

// Verify toast message content
String toastMessageText = WebUI.getText(findTestObject('Login Objects/Invalid Credentials Toast Login'))

String expectedMessage = 'Invalid credentials'

WebUI.verifyMatch(toastMessageText, expectedMessage, false)

