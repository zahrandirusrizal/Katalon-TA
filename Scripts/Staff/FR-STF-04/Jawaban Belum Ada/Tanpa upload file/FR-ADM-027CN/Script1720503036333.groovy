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
WebUI.callTestCase(findTestCase('Admin/FR-ADM-02. FR-ADM-04, Done/TC-ADMFR02-001'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'Klik Tab Fraud Assesment agar dialihkan ke halaman terkait'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Tab Fraud Assesment'))

'Klik button "Isi Fraud Assesment" untuk mulai melakukan proses mengisi fraud assesment'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Isi Fraud Assesment'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Tombol Mulai Paket Soal/Mulai Paket Soal 2.2'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 01 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 02 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 03 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 04 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 05 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 06 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 07 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 08 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 09 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 10 - Belum ada'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Simpan Edit Paket Soal'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Toast Berhasil Submit Jawaban'), 
    10)

// Verify toast message content
String toastMessageText = WebUI.getText(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Toast Berhasil Submit Jawaban'))

String expectedMessage = 'Berhasil'

WebUI.verifyMatch(toastMessageText, expectedMessage, false)

WebUI.delay(5)

