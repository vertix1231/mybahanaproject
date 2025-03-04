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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    'p4y+y39Ir5Natt0mUNKYvA==')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Password_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\completeprofile1.jpg')

Thread.sleep(6000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

Thread.sleep(10000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\completeprofile2.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/intro_risk_profile/btnintro_risk_profile'))

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\completeprofile2_1.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Moderate_topping'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Save Result'))

//WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your desired PIN_pincode-input-text'), 
//    '1')
//
//WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your desired PIN_pincode-input-text_1'), 
//    '2')
//
//WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your desired PIN_pincode-input-text_1_2'), 
//    '3')
//
//WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your desired PIN_pincode-input-text_1_2_3'), 
//    '4')
//
//WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your desired PIN_pincode-input-text_1_2_3_4'), 
//    '5')
WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\completeprofile3.jpg')

Thread.sleep(10000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\completeprofile4.jpg')

Thread.sleep(10000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\completeprofile5.jpg')
