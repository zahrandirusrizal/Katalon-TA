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

WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 2 (Required) Modified Search Belum Selesai dalam table dan melanjutkan penilaian'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 3, Proses Menilai dengan Jawaban Sudah Tepat'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 1,1'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 1,1'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 1,2'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 1,2'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 2,1'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 2,1'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 2,2'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 2,2'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 3,1'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 3,1'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 3,2'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 3,2'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 4,1'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 4,1'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 4,2'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 4,2'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 5,1'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 5,1'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

if (WebUI.verifyElementPresent(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 6,1'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reviewer Tab/Edit Menilai Assesment/Edit 6,1'))

    'Melakukan Proses Login'
    WebUI.callTestCase(findTestCase('Reviewer Internal/FR-RIN-05/Step 4 (EDITING ONLY)For Editing, Kurang Tepat'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Checkbox Saya setuju dengan pernyataan diatas'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Halaman Mengisi Fraud/Button Submit Assesment'))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

