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

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Login/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    'p4y+y39Ir5Natt0mUNKYvA==')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Password_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_personaldata_single_1.jpg')

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

//WebUI.click(findTestObject('Object Repository/Web/open investment account/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))
WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_personaldata_single_2.jpg')

Thread.sleep(1000)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_e-KTP Number_tempat_lahir'), 
    'Bandung')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Place of Birth_floating_filledtanggal_lahir'), 
    '')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Place of Birth_floating_filledtanggal_lahir_1'), 
    '14-12-1998')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Place of Birth_floating_filledtanggal_lahir_1'), 
    Keys.chord(Keys.ENTER))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_GenderMaleFemale'), 
//    'Gender', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_GenderMaleFemale'), 
    'male', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_EducationTanpa GelarSMADiploma 1Dipl_d3914b'), 
    '104', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_ReligionBudhaKristen ProtestanHinduI_6a5a69'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Religion_ibu_kandung'), 
    'Regina Yulian Putri')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedSeparate'), 
//    'Marriage Status', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedSeparate'), 
    'single', true)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_personaldata_single_3.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/personal data/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_personaldata_single_4.jpg')

