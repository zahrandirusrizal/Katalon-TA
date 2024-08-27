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

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Test Cases/Reviewer Internal/FR-RIN-01, FR-RIN-03/TC-RINFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Reviewer Tab/Halaman Penilaian Fraud Assesment'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Reviewer Tab/Tab Belum Di nilai'))

WebUI.doubleClick(findTestObject('Reviewer Tab/Tab Belum Di nilai'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tabel List Riwayat Fraud Assesment'), 
    0)

WebUI.verifyElementVisible(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tabel List Riwayat Fraud Assesment'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tombol Halaman Selanjutnya_Tabel List Riwayat Fraud Assesment'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tombol Halaman Selanjutnya_Tabel List Riwayat Fraud Assesment'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tombol Halaman Sebelumnya_Tabel List Riwayat Fraud Assesment'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tombol Halaman Sebelumnya_Tabel List Riwayat Fraud Assesment'))

WebUI.closeBrowser()

