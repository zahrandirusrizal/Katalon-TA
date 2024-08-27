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

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Superadmin/FR-SUP-01/TC-SUPFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Superadmin Pages/Page_Create Next App/a_Kelola Akun'))

WebUI.click(findTestObject('Superadmin Pages/Page_Fraud Assesment - Accounts  Fraud Deterrence Propeller/button_Menunggu Konfirmasi'))

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

WebUI.delay(4)

WebUI.doubleClick(findTestObject('Superadmin Pages/Page_Fraud Assesment - Accounts  Fraud Deterrence Propeller/button_Pilih Status'))

WebUI.delay(6)

WebUI.doubleClick(findTestObject('Superadmin Pages/Page_Fraud Assesment - Accounts  Fraud Deterrence Propeller/button_Pilih Status'))

WebUI.doubleClick(findTestObject('Superadmin Pages/Page_Fraud Assesment - Accounts  Fraud Deterrence Propeller/li_Konfirmasi'))

WebUI.waitForElementVisible(findTestObject('Superadmin Pages/Page_Fraud Assesment - Accounts  Fraud Deterrence Propeller/li_Berhasil mengubah status'), 
    10)

// Verify toast message content
String toastMessageText = WebUI.getText(findTestObject('Superadmin Pages/Page_Fraud Assesment - Accounts  Fraud Deterrence Propeller/li_Berhasil mengubah status'))

String expectedMessage = 'Berhasil mengubah status'

WebUI.verifyMatch(toastMessageText, expectedMessage, false)
