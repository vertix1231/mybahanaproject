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

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Password_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\oa proses\\oapekerjaanpegawai1.jpg')

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

Thread.sleep(10000)

//WebUI.click(findTestObject('Object Repository/Web/open investment account/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))
WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\oa proses\\oapekerjaanpegawai2.jpg')

Thread.sleep(1000)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filleddata_pek_568512'), 
    'pelajar')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filleddata_pek_568512'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Occupation_nama_kantor'), 
    'Bahana Education Institution Test')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Address of Educational Institution_al_e8f64d'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_obj'), 
    '10110')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_obj'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Zip CodeSubdistrictDistrict_no_telp_kantor'), 
    '088273829364')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Information_name_bo'), 
    'Andre')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationAyahIbuSuami'), 
//    'Relation', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationAyahIbuSuami'), 
    'ayah', true)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Relation_ektp_number'), 
    '1111111111111111')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_e-KTP Number_email'), 
    'andre@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Email_handphone'), 
    '088273829364')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_No. Handphone_pob'), 
    'Riau')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Place of Birth_floating_filleddob_1'), 
    '13-07-1969')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedSeparate'), 
//    'Marriage Status', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedSeparate'), 
    'Married', true)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_In accordance with my address'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Different from my address'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Different from my address_address_bo'), 
    'bogor')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_bo_obj'), 
    '10110')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_bo_obj'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Address_form-radio _54758c'))

Thread.sleep(5000)

WebUI.click(findTestObject('Web/OA/Continue OA Process/Occupation/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\oa proses\\oapekerjaanpegawai3.jpg')

