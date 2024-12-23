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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-hthbg.bahana.co.id:3030/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/a_Register'))

WebUI.setText(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_EN_email'), 
    '')

WebUI.setText(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Email_no_hp'), 
    '')

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/img'))

WebUI.setText(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Phone Number_pwd'), 
    '')

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/img'))

WebUI.setText(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Create Password_tempat_lahir'), 
    '')

WebUI.setText(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Confirm Password_sales_code'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

