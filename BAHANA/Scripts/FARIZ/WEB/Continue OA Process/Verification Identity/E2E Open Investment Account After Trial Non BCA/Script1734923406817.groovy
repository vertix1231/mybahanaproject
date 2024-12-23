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
import org.testng.reporters.EmailableReporter as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev-hthbg.bahana.co.id:3030/')

WebUI.setText(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\openinvestaccout2.jpg')

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

WebUI.click(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Bahana DXtrade cooperates with_sk'))

WebUI.click(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Approval of Opening a Rekening Dana N_4231a1'))

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasar Modal Multi Asset resmi dari Bahana Sekuritas/button_Continue'))

WebUI.click(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create'))

WebUI.click(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Name According to e-KTP'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Enter your full name and e-KTP number_4eefdf'), 
    GlobalVariable.name_ektp)

WebUI.setText(findTestObject('Object Repository/Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Name According to e-KTP_nomor_ektp'), 
    GlobalVariable.ektp)

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasar Modal Multi Asset resmi dari Bahana Sekuritas/input_Referral Code_account_opening_information'))

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/div_Social Media (Instagram, Twitter, Facebook)'))

WebUI.click(findTestObject('Web/OA/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))

Thread.sleep(5000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\openinvestaccout_verifidentity1.jpg')

