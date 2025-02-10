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

Thread.sleep(1000)

//WebUI.click(findTestObject('Object Repository/Web/open investment account/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))
WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_personaldata_married_2.jpg')

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/personal data 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'married', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/personal data 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'separate', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/personal data 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'single', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/personal data 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'married', true)

//WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/personal data 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Spouse name'))
WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/personal data 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Marriage Status_nama_pasangan'), 
    'bayu pasangan abadi')

WebUI.scrollToElement(findTestObject('Web/OA/Continue OA Process/personal data/button_Next'), 0)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_personaldata_married_3.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/personal data/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_personaldata_married_4.jpg')

