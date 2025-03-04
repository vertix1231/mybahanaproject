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

WebUI.click(findTestObject('Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_1.jpg')

Thread.sleep(6000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

Thread.sleep(10000)

Thread.sleep(30000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_1_1.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Is there a family or close relative o_439c56'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Yes_form-radio text-bahana-sky h-5 w-5'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Yes_form-radio text-bahana-sky h-5 w-5_1'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_No_form-radio text-bahana-sky h-5 w-5'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Yes_form-radio text-bahana-sky h-5 w-5_1_2'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_No_form-radio text-bahana-sky h-5 w-5_1'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_No_presentasi'), 
    'dext601 - stafftest - bahanacompany')

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_2.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div__1'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div__1_2'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Persetujuan Pembukaan Rekening Dana N_4c36a4'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/button_Next'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Persetujuan Pembukaan Rekening Dana N_4c36a4'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/button_Next'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/svg_If yes, please specify (Name - Position_581d70'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/svg_If yes, please specify (Name - Position_581d70'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div_'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/svg_I declare that my data is correct and c_fac3a1'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div__1'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/svg_I certify that I am not a United States_54d2b7'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/div__1_2'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Persetujuan Pembukaan Rekening Dana N_4c36a4'))

Thread.sleep(1000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_3.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/button_Next'))

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_4.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/Approval n Risk Profile/approvalmainnextbtn/approvalmainnextbtn'))

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_5.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/intro_risk_profile/btnintro_risk_profile'))

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_aprroval_6.jpg')

