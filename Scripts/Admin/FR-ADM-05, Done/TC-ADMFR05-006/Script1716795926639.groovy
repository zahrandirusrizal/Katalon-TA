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

String randomNamaStaffReviewer = generateRandomName(10)

String randomNomorTelponStaffReviewer = generateRandomPhoneNumber()

String randomEmailStaffReviewer = generateRandomName(10) + '@yopmail.com'

String randomUsername = generateRandomName(8)

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Admin/FR-ADM-02. FR-ADM-04, Done/TC-ADMFR02-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Menambah Staff/Tab Data Staff'))

WebUI.click(findTestObject('Object Repository/Menambah Staff/Data Staff - Tambah Akun'))

WebUI.setText(findTestObject('Object Repository/Menambah Staff/Input Nama Staff atau Reviewer'), randomNamaStaffReviewer)

WebUI.setText(findTestObject('Menambah Staff/Input Nomor Telepon Staff atau Reviewer New'), randomNomorTelponStaffReviewer)

WebUI.setText(findTestObject('Object Repository/Menambah Staff/Input Email Staff atau Reviewer'), randomEmailStaffReviewer)

WebUI.setText(findTestObject('Object Repository/Menambah Staff/Input Username Staff atau Reviewer'), '      ')

WebUI.setEncryptedText(findTestObject('Object Repository/Menambah Staff/Input Password Staff atau Reviewer'), '6/c7OeOyhQt9HyE9WPUHQg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Menambah Staff/Input Konfirmasi Password Staff atau Reviewer'), 
    '6/c7OeOyhQt9HyE9WPUHQg==')

WebUI.click(findTestObject('Object Repository/Menambah Staff/Role Dropdown'))

WebUI.waitForElementVisible(findTestObject('Menambah Staff/Reviewer - Dropdown Option'), 5)

WebUI.click(findTestObject('Menambah Staff/Reviewer - Dropdown Option'))

WebUI.click(findTestObject('Menambah Staff/Button Tambah Akun Staff atau Reviewer'))

WebUI.verifyTextPresent('Username tidak boleh kosong', false)

WebUI.verifyElementNotPresent(findTestObject('Menambah Staff/Toast/li_Berhasil'), 1)

String generateRandomName(int length) {
    def random = new Random()

    def alphabet = 'abcdefghijklmnopqrstuvwxyz'

    def name = ''

    for (int i = 0; i < length; i++) {
        name += alphabet.charAt(random.nextInt(alphabet.length()))
    }
    
    return name
}

String generateRandomPhoneNumber() {
    def random = new Random()

    def phoneNumber = ''

    for (int i = 0; i < 10; i++) {
        phoneNumber += random.nextInt(10)
    }
    
    return phoneNumber
}

