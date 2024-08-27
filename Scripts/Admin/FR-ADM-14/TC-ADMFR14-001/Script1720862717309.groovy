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

WebUI.click(findTestObject('Fraud Detection/Page_Fraud Detection  Fraud Deterrence Propeller/a_Fraud Detection'))

WebUI.delay(5)

WebUI.click(findTestObject('Fraud Detection/Page_Fraud Detection  Fraud Deterrence Propeller/a_Isi Fraud Detection'))

WebUI.uploadFile(findTestObject('Fraud Detection/input_Unduh Template Format File_filehidden px-3 py-2 rounded-xl text-sm border-2 hoverborder-gray-400'), 
    'C:\\Users\\Pongo\\Downloads\\Documents\\' + 'Report Template - Indikasi Tidak Curang.xlsx')

WebUI.click(findTestObject('Fraud Detection/button_Upload'))

WebUI.delay(3)

WebUI.click(findTestObject('Fraud Detection/Page_Create Next App/button_Unggah File'))

WebUI.click(findTestObject('Fraud Detection/label_Saya setuju dengan pernyataan diatas'))

WebUI.click(findTestObject('Fraud Detection/button_Submit'))

WebUI.verifyTextPresent('-2.480000043693999', false)

