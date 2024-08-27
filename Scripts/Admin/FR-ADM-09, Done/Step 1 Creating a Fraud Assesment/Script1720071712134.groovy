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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Admin/FR-ADM-02. FR-ADM-04, Done/TC-ADMFR02-001'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Tab Fraud Assesment agar dialihkan ke halaman terkait'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Tab Fraud Assesment'))

WebUI.delay(5)

'Klik button "Isi Fraud Assesment" untuk mulai melakukan proses mengisi fraud assesment'
WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Isi Fraud Assesment'))

WebUI.waitForElementVisible(findTestObject('Mengisi Fraud Assesment/Itikad Memulai Assesment/Pernyataan Itikad'), 5)

WebUI.click(findTestObject('Mengisi Fraud Assesment/Itikad Memulai Assesment/label_Saya setuju dengan pernyataan diatas'))

WebUI.doubleClick(findTestObject('Mengisi Fraud Assesment/Itikad Memulai Assesment/Button Mulai Assesment Itikad'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Tombol Mulai Paket Soal/Mulai Paket Soal 1.1'), 10)

