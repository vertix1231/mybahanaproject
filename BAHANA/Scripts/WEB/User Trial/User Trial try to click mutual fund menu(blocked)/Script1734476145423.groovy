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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev-hthbg.bahana.co.id:3030/')

WebUI.setText(findTestObject('Object Repository/Web/User Trial/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/User Trial/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Web/User Trial/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/User Trial/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\User Trial try to click bonds menu(blocked)1.jpg')

WebUI.click(findTestObject('Object Repository/Web/User Trial/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_Mutual Fund'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\User Trial try to click bonds menu(blocked)2.jpg')

WebUI.click(findTestObject('Object Repository/Web/User Trial/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Oke'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\User Trial try to click bonds menu(blocked)3.jpg')

