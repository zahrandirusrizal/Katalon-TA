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
WebUI.callTestCase(findTestCase('Staff/FR-STF-01, FR-STF-03/FR-STFFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/a_Riwayat Aktivitas'))

WebUI.delay(20)

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/button_Aktivitas'))

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/li_Submit Point'))

WebUI.delay(5)

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/button_Aktivitas'))

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/li_Logged In'))

WebUI.verifyTextNotPresent('Submit Point', false)

WebUI.verifyTextNotPresent('Logged In', false)

