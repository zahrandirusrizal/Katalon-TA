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

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Staff/FR-STF-01, FR-STF-03/FR-STFFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/a_Riwayat Aktivitas'))

WebUI.delay(20)

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/Page_Data Staf  Fraud Deterrence Propeller/Next Page Table Riwayat Aktivitas Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Halaman Riwayat Aktivitas/Page_Data Staf  Fraud Deterrence Propeller/Previous Page Table Riwayat Aktivitas Button'))

WebUI.click(findTestObject('Melihat Data Staff/Page_Data Staf  Fraud Deterrence Propeller/Change Table Rows'))

WebUI.delay(1)

WebUI.click(findTestObject('Melihat Data Staff/10 Rows Change'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

if (rows_count > 7) {
    // Assuming the first row is the header
    println(rows_count)

    WebUI.comment('The table contains data.')
} else {
    WebUI.comment('The table does not contain data.')
}

WebUI.closeBrowser()
