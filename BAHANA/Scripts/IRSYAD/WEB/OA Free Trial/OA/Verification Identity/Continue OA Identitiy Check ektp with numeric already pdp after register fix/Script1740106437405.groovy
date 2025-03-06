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


WebUI.click(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Name According to e-KTP'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your full name and e-KTP number_4eefdf'), 
    GlobalVariable.name_ektp)

WebUI.setText(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Name According to e-KTP_nomor_ektp'), 
    GlobalVariable.ektp)

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Identity Check/Page_Bahana DXtrade Aplikasi Investasi Pasar Modal Multi Asset resmi dari Bahana Sekuritas/input_Optional_referal_code'), 
    'adaaC_a12123')

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasar Modal Multi Asset resmi dari Bahana Sekuritas/input_Referral Code_account_opening_information'))

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_Social Media (Instagram, Twitter, Facebook)'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_idverif2.jpg')

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))

Thread.sleep(5000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_idverif3.jpg')

