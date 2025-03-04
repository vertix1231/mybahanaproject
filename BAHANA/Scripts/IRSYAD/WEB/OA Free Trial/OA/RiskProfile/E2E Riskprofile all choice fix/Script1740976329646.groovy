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

WebUI.setEncryptedText(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/input_Log In_w-full border rounded-lg px-2 _607240_1'), 
    'p4y+y39Ir5Natt0mUNKYvA==')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Password_rememberme'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile2024/button_Log In'))

Thread.sleep(1000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\risprofile1.jpg')

Thread.sleep(6000)

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Create Account Investment'))

Thread.sleep(10000)

WebUI.takeScreenshot(('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\' + GlobalVariable.email) + '\\risprofile1_1.jpg')

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/button_Next'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Investment fund security'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are your goals for investing'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Income and security of investment fund'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are your goals for investing'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Revenue and growth over the long term'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are your goals for investing'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Investment growth'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are your goals for investing'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Investment growth'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How long do you plan to invest'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How long do you plan to invest'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_1 year'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How long do you plan to invest'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_1-3 years'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How long do you plan to invest'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_3-5 years'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How long do you plan to invest'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_5 years'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How long do you plan to invest'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_5 years'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are the characteristics of your inv_8cda24'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Stable investment value with relative_b98ed5'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are the characteristics of your inv_8cda24'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are the characteristics of your inv_8cda24'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_The investment fluctuates slightly wi_300596'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are the characteristics of your inv_8cda24'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Investment value fluctuates more with_349c8c'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are the characteristics of your inv_8cda24'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_The investment value fluctuates great_8e0892'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What are the characteristics of your inv_8cda24'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_The investment value fluctuates great_8e0892'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/li_What action would you take if the value _6291aa'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Disburse all investment funds'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/li_What action would you take if the value _6291aa'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Withdraw some of the investment funds'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/li_What action would you take if the value _6291aa'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Not doing anything'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/li_What action would you take if the value _6291aa'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Add investment funds'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/li_What action would you take if the value _6291aa'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Add investment funds'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What is your level of understanding of M_b6f303'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Dont know at all'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What is your level of understanding of M_b6f303'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Very minimal'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What is your level of understanding of M_b6f303'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Know enough'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What is your level of understanding of M_b6f303'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What is your level of understanding of M_b6f303'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Very knowledgeable'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_What is your level of understanding of M_b6f303'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Very knowledgeable'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How far is your experience in investing _6bd41f'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_There isnt any yet'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How far is your experience in investing _6bd41f'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Still very limited'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How far is your experience in investing _6bd41f'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Enough'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How far is your experience in investing _6bd41f'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/label_Experienced'))

WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Approval n Risk Profile/riskprofile/ol_How far is your experience in investing _6bd41f'))

