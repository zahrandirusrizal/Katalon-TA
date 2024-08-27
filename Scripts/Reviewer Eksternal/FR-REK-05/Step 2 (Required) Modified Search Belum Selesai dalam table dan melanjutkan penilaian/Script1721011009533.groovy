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
WebUI.callTestCase(findTestCase('Reviewer Eksternal/FR-REK-01, FR-REK-03/TC-REKFR01-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Reviewer Tab/Halaman Penilaian Fraud Assesment'))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

'Variable to store the href value'
String retrievedHref = null

boolean textFound = false // Variable to track if the text "Belum Selesai" is found

boolean nextPageExists = true // Variable to track if there's a next page button

while (!(textFound) && nextPageExists) {
    'To locate table'
    WebElement Table = driver.findElement(By.xpath('//table'))

    'To locate rows of table it will Capture all the rows available in the table'
    List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

    'To calculate no of rows In table'
    int rows_count = rows_table.size()

    if (rows_count <= 2) {
        // Log the condition being met
        WebUI.comment('There is no data in the table, failing the test case.')

        // Fail the test case
        WebUI.verifyEqual(1, 0 // This will fail the test case immediately
            )

        // Optionally, break the loop if you want to stop further iterations
        continueLoop = false
    }
    
    'Loop will run for all the rows of the table'
    Loop: for (int row = 0; row < rows_count; row++) {
        'To locate columns(cells) of that particular row'
        List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

        'Calculating the number of columns(cells)  present in that particular row'
        int columns_count = Columns_row.size()

        println((('Number of cells present in the Row ' + row) + ' : ') + columns_count)

        'Ensure the row has enough columns'
        if (columns_count > 3) {
            'Retrieve text from column index 4'
            String celltext = Columns_row.get(4).getText()

            'Checking if the text present in Cell is "Belum Selesai"'
            if (celltext.trim().equals('Belum Selesai')) {
                textFound = true // Update the flag to indicate the text was found

                'Check if column index 6 has a link styled as a button'
                WebElement cellWithLink = Columns_row.get(7)

                // Print the inner HTML of the cell to see if the button exists
                println('Contents of column index 5: ' + cellWithLink.getAttribute('innerHTML'))

                try {
                    WebElement linkElement = cellWithLink.findElement(By.tagName('a'))

                    println('Link Found: ' + linkElement)

                    'Retrieve the href attribute from the link element'
                    retrievedHref = linkElement.getAttribute('href')

                    println('Retrieved href: ' + retrievedHref)

                    'Navigate to the retrieved URL'
                    WebUI.navigateToUrl(retrievedHref)

                    println(retrievedHref)

                    'The loop will terminate after getting the desired output from the table'
                    break
                }
                catch (org.openqa.selenium.NoSuchElementException e) {
                    println('Link not found in column index 5 of row ' + row)
                } 
            }
        }
    }
    
    // Check if the text was not found and click the "Next" button if necessary
    if (!(textFound) && WebUI.verifyElementClickable(findTestObject('Object Repository/Reviewer Tab/Next Page Button Reviewer Table'), 
        FailureHandling.OPTIONAL)) {
        try {
            WebUI.click(findTestObject('Object Repository/Reviewer Tab/Next Page Button Reviewer Table'))

            println('Clicked on the Next button to proceed to the next page.')

            WebUI.delay(3 // Adjust the delay time as per your requirement
                )
        }
        catch (Exception e) {
            println('Failed to click the Next button: ' + e.message)

            nextPageExists = false
        } // If the next button click fails, assume there are no more pages
    } else {
        println('Next Page button is not present. Assuming there are no more pages.')

        nextPageExists = false
    }
}

if (!(textFound)) {
    println('The text "Belum Selesai" was not found in any page.')

    WebUI.verifyEqual(1, 0 // This will fail the test case immediately
        )
} else {
    println('The text "Belum Selesai" was found and navigated accordingly.')
}

