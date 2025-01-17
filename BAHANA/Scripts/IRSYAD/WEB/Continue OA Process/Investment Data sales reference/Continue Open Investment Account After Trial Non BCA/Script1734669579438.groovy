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

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Doc Personal Data/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\continueoainvestment_sales1.jpg')

Thread.sleep(1000)

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\continueoainvestment_sales1.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Investment PurposeInvestasi Jangka P_96af13'),
	'3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Investment ExperienceSahamObligasiRe_b1d233'),
	'3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Estimated Transaction ValueMonth Rp _257f4d'),
	'1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/select_Estimated Numbers of Charging Deposi_7abe6b'),
	'1', true)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Online'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/label_Sales'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\continueoainvestment_sales2.jpg')