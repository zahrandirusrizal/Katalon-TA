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

'Klik Tab Fraud Assesment agar dialihkan ke halaman terkait'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Tab Fraud Assesment'))

'Klik button "Isi Fraud Assesment" untuk mulai melakukan proses mengisi fraud assesment'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Isi Fraud Assesment'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Tombol Mulai Paket Soal/Mulai Paket Soal 5.1'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 01 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 01'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 02 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 02'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 03 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 03'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 04 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 04'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 05 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 05'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 06 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 06'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 07 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 07'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 08 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 08'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 09 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 09'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 10 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 10'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 11 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 11'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 12 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 12'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 13 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 13'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 14 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 14'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 15 - Ada, belum lengkap'))

WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 15'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
    GlobalVariable.fileName)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Simpan Edit Paket Soal'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Toast Berhasil Submit Jawaban'), 
    10)

// Verify toast message content
String toastMessageText = WebUI.getText(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Toast Berhasil Submit Jawaban'))

String expectedMessage = 'Berhasil'

WebUI.verifyMatch(toastMessageText, expectedMessage, false)

WebUI.delay(5)

