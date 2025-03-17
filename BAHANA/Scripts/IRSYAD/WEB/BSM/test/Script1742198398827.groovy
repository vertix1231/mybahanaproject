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

WebUI.setText(findTestObject('Object Repository/Web/BSM/Bonds/corporate/input_EN_username'), 
    'dxtest2')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/BSM/Bonds/corporate/input_Email or Username_pwd'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Web/BSM/Bonds/corporate/input_Password_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/BSM/Bonds/corporate/button_Log In'))

WebUI.click(findTestObject('Object Repository/Web/BSM/Bonds/corporate/div_Bonds'))

WebUI.click(findTestObject('Object Repository/Web/BSM/Bonds/corporate/div_FR0075Obligasi Negara Republik Indonesi_81340a'))

