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
import java.util.Random as Random

// Generate a random length for the name (between 5 and 10 characters)
// Generate random characters and append them to the name
String randomNamaPendaftar = generateRandomName(10)

String randomPosisiPendaftar = 'Head of ' + generateRandomName(3)

String randomNomorTelponPendaftar = generateRandomPhoneNumber()

String randomEmailPendaftar = generateRandomName(10) + '@yopmail.com'

String randomNamaEntitas = generateRandomName(15)

String randomAlamatEntitas = generateRandomName(20)

String randomNomorTelponEntitas = generateRandomPhoneNumber()

String randomEmailEntitas = generateRandomName(10) + '@yopmail.com'

String randomUsername = generateRandomName(8)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Weblink)

WebUI.click(findTestObject('Object Repository/Register Admin Objects/Register Link'))

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Nama Pendaftar'), randomNamaPendaftar)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Jabatan Posisi Pendaftar'), randomPosisiPendaftar)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Nomor Telpon Pendaftar'), randomNomorTelponPendaftar)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Email Pendaftar'), randomEmailPendaftar)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Nama Entitas'), randomNamaEntitas)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Alamat Entitas'), randomAlamatEntitas)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Nomor Telpon Entitas'), randomNomorTelponEntitas)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Email Entitas'), randomEmailEntitas)

WebUI.setText(findTestObject('Object Repository/Register Admin Objects/Text Field Username'), randomUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Register Admin Objects/Text Field Password'), '6/c7OeOyhQt9HyE9WPUHQg==')

WebUI.click(findTestObject('Object Repository/Register Admin Objects/Button Register'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Register Admin Objects/Notifikasi Toast/Toast Berhasil Register'), 
    10)

// Verify toast message content
String toastMessageText = WebUI.getText(findTestObject('Object Repository/Register Admin Objects/Notifikasi Toast/Toast Berhasil Register'))

String partialTextToVerify = 'Berhasil'

assert toastMessageText.contains(partialTextToVerify)

System.out.println(randomUsername)

WebUI.closeBrowser( // Generate random characters and append them to the name
    ) // Generate a random phone number
// Generate random digits for the phone number
// Append a random digit (0-9)

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

