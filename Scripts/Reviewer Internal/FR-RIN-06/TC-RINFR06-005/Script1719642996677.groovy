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
import com.kms.katalon.core.util.KeywordUtil

'Melakukan Proses Login'
WebUI.callTestCase(findTestCase('Test Cases/Reviewer Internal/FR-RIN-01, FR-RIN-03/TC-RINFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Reviewer Tab/Halaman Penilaian Fraud Assesment'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Reviewer Tab/Change Rows/Change Rows per Page Button - Reviewer Table'))

WebUI.click(findTestObject('Reviewer Tab/Change Rows/Change Rows per Page Button - Reviewer Table'))

WebUI.delay(3)

WebUI.click(findTestObject('Reviewer Tab/Change Rows/10 Rows'))

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

if (rows_count >= 6) {
	println('The table has more than 5 rows. Test case passed.')
	KeywordUtil.markPassed('The table has more or equal to 6 rows.')
} else {
	println('The table has 5 or fewer rows. Test case failed.')
	KeywordUtil.markFailed('The table has 5 or fewer rows.')
}


