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

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Edit Paket Soal/Edit 1.2'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, Sudah Lengkap/Nomor 01 - Ada, dan sudah lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 01 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 01 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 01'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 01'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 02 - Ada, belum lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 02 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 02 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 02'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 02'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 03 - Belum ada'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 03 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 03 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 03'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 03'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 04 - Ada, belum lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 04 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 04 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 04'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 04'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, Sudah Lengkap/Nomor 05 - Ada, dan sudah lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 05 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 05 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 05'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 05'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 06 - Ada, belum lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 06 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 06 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 06'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 06'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Belum ada/Nomor 07 - Belum ada'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 07 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 07 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 07'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 07'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 08 - Ada, belum lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 08 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 08 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 08'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 08'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, Sudah Lengkap/Nomor 09 - Ada, dan sudah lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 09 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 09 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 09'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 09'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Jawaban Ada, belum lengkap/Nomor 10 - Ada, belum lengkap'))

if (WebUI.verifyElementPresent(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 10 - Button Delete Upload File'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Mengisi Fraud Assesment/Delete Button Edit/Nomor 10 - Button Delete Upload File'))

    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 10'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
} else {
    WebUI.uploadFile(findTestObject('Mengisi Fraud Assesment/Upload Bukti/Upload Bukti Nomor 10'), 'C:\\Users\\Pongo\\Downloads\\Documents\\' + 
        GlobalVariable.fileName)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Simpan Edit Paket Soal'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Toast Berhasil Submit Jawaban'), 
    10)

// Verify toast message content
String toastMessageText = WebUI.getText(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Toast Berhasil Submit Jawaban'))

String expectedMessage = 'Berhasil'

WebUI.verifyMatch(toastMessageText, expectedMessage, false)

