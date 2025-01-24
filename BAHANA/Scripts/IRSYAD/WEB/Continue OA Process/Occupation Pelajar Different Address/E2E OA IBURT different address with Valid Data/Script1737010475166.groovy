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

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_occupation_iburt_differentaddress1.jpg')

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

Thread.sleep(10000)

Thread.sleep(1000)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filleddata_pek_568512'), 
    'Ibu')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filleddata_pek_568512'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Address_form-radio _54758c'))
Thread.sleep(5000)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Information_name_bo'), 
    'nama beneficiary owner ibu rt/pelajar')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationHusbandBiological ParentChil_10a2ac'), 
    'Husband', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationHusbandBiological ParentChil_10a2ac'), 
    'Biological Parent', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationHusbandBiological ParentChil_10a2ac'), 
    'Children', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationHusbandBiological ParentChil_10a2ac'), 
    'Relatives', true)

//Other Party (Relationship Declaration Letter)
WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_RelationHusbandBiological ParentChil_10a2ac'), 
    'Biological Parent', true)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Relation_ektp_number'), 
    '1234445555666667')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_e-KTP Number_email'), 
    'emailiburt_beneficiary_owner@email.com')

//WebUI.click(findTestObject('Object Repository/Web/open investment account/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))
WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_occupation_iburt_differentaddress2.jpg')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Email_handphone'), 
    '0887129393763')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Email_handphone'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Email_handphone'), 
    '088712939376333333333333')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_No. Handphone_pob'), 
    'bandung indonesia')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Place of Birth_floating_filleddob'), 
    '12-08-1991')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Place of Birth_floating_filleddob'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'Single', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'Married', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'Separate', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'Married', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'Single', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Marriage StatusSingleMarriedDivorced'), 
    'Separate', true)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_occupation_iburt_differentaddress3.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_In accordance with my address'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Address_form-radio _54758c'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Address_form-radio _54758c'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Different from my address'))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Different from my address_address_bo'), 
    'alamat occupation ibu dari beneficiary owner, indonesia jakarta')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_bo_obj'), 
    '10110')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/occupation 2025/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_bo_obj'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/btn baru 31 dec 2024-2/button_Next'), 
    3)

WebUI.verifyElementClickable(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/btn baru 31 dec 2024-2/button_Next'))


WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_occupation_iburt_differentaddress4.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/btn baru 31 dec 2024-2/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\oa_occupation_iburt_differentaddress5.jpg')

