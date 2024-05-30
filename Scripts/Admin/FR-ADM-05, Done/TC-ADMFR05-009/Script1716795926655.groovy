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
WebUI.callTestCase(findTestCase('Admin/FR-ADM-02. FR-ADM-04, Done/TC-ADMFR02-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Menambah Staff/Tab Data Staff'))

WebUI.delay(2)

WebUI.click(findTestObject('Menambah Staff/Data Staff - Tambah Akun'))

WebUI.click(findTestObject('Menambah Staff/Button Tambah Akun Staff atau Reviewer'))

WebUI.delay(2)

WebUI.verifyTextPresent('Nama tidak boleh kosong', false)

WebUI.verifyTextPresent('Role tidak boleh kosong', false)

WebUI.verifyTextPresent('No. Telp tidak boleh kosong', false)

WebUI.verifyTextPresent('Email tidak boleh kosong', false)

WebUI.verifyTextPresent('Username tidak boleh kosong', false)

WebUI.verifyTextPresent('Password tidak boleh kosong', false)

WebUI.verifyTextPresent('Required', false)

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

