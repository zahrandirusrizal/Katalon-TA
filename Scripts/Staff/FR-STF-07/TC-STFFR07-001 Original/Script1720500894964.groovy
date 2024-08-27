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

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Tab Fraud Assesment'))

WebUI.verifyElementPresent(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tabel List Riwayat Fraud Assesment'), 
    0)

WebUI.verifyElementVisible(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Tabel List Riwayat Fraud Assesment'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Fraud Assesment - History  Fraud Deterrence Propeller/Lihat Detail Fraud Assesment'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 1,1'))

WebUI.verifyElementPresent(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Informasi Penting Detail Fraud Assesment'), 
    0)

WebUI.verifyTextPresent('Apakah terdapat alat ukur untuk penilaian risiko fraud (tool RFA)', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 1,2'))

WebUI.verifyTextPresent('Apakah terdapat SOP yang lengkap dan memadai sesuai siklus bisnis', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 2,1'))

WebUI.verifyTextPresent('Apakah terdapat akuntan internal', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 2,2'))

WebUI.verifyTextPresent('Apakah terdapat manual SPI yang lengkap dan memadai sesuai siklus bisnis', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 3,1'))

WebUI.verifyTextPresent('Apakah terdapat dokumen manual tata kelola (good governance) yang lengkap dan memadai sesuai siklus bisnis', 
    false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 3,2'))

WebUI.verifyTextPresent('Apakah terdapat kebijakan (policy management) tentang budaya integritas', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 4,1'))

WebUI.verifyTextPresent('Apakah terdapat kebijakan (policy management) tentang harmonisasi lingkungan kerja yang sehat', 
    false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 4,2'))

WebUI.verifyTextPresent('Apakah terdapat figur di entitas yang dijadikan panutan (patron)', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 5,1'))

WebUI.verifyTextPresent('Apakah terdapat kebijakan tentang reward', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Lihat Detail 6,1'))

WebUI.verifyTextPresent('Apakah terdapat aturan SDM terdapat kriteria pelanggaran ringan', false)

WebUI.click(findTestObject('Melihat Riwayat Fraud Assesment/Page_Create Next App/Back Button'))

WebUI.closeBrowser()

