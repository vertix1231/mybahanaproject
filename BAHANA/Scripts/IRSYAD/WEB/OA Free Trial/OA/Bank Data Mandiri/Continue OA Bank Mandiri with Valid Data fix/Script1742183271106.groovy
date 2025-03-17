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
WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_datainfobankmandiri2.jpg')

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Bank Data Non BCA/bankdata/input_button search_floating_filledaccount_opening_information'), 
    'mandiri')

WebUI.sendKeys(findTestObject('Web/OA/Continue OA Process/Bank Data Non BCA/bankdata/input_button search_floating_filledaccount_opening_information'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Personal Bank Account_nama_pemilik_rek'), 
    GlobalVariable.bank_owner_name)

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Account Owner Name_no_rek'), 
    GlobalVariable.rek_bank)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_datainfobankmandiri3.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Save  Next'))

Thread.sleep(10000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\oa_datainfobankmandiri4.jpg')

