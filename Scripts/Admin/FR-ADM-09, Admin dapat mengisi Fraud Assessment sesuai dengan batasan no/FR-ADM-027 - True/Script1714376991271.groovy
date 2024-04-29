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

WebUI.callTestCase(findTestCase('Admin/FR-ADM-02. FR-ADM-04, Admin harus melakukan login di halaman login untuk mendapatkan hak akses/TC-ADM-008A'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Dashboard/a_Fraud Assesment'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Isi Fraud Assesment'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Isi Fraud Assesment'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 09 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 10 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 09 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 10 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 09 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 10 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 09 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 10 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 02 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 09 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 10 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 11 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/li_Berhasil'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 01 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 06 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 09 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 10 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 11 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/label_Ada, dan sudah lengkap_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_aliceexample.com_z-0 group relative _e20bf1'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/svg_Mulai_z-10 opacity-0 group-data-selecte_f03236'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/a_Mulai_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/span_aliceexample.com_relative inline-flex _456ff8'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/span_Belum ada_relative inline-flex items-c_0dc7b4'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 03 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 04 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 05 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/div_7. Apakah terdapat legal officerAda, da_6ae440'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 07 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/Nomor 08 - Ada, dan sudah lengkap'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_aliceexample.com_z-0 group relative _e20bf1'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/span_Saya setuju dengan pernyataan diatas'))

WebUI.click(findTestObject('Object Repository/Mengisi Fraud Assesment/Page_Create Next App/button_Submit_1'))

