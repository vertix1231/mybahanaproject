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

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    'p4y+y39Ir5Natt0mUNKYvA==')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Password_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\oa proses\\oaktpverifnpwp1.jpg')

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

Thread.sleep(10000)

//WebUI.click(findTestObject('Object Repository/Web/open investment account/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))
WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\oa_approval1.jpg')

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/canvas_Reset_w-full h-200px'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Yes_form-radio text-bahana-sky h-5 w-5'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/span_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Yes'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_If yes, please specify (Name - Positi_123ed5'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_No_presentasi'), 
    'irsyad-manager-bahana company')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Loading PDF_is_checked_approvel'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Loading PDF_is_checked_approvel'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_No'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

