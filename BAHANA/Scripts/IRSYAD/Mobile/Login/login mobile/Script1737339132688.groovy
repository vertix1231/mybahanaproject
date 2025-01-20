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

Mobile.startExistingApplication('com.bahana.dxtrade2')

//Mobile.switchToNative()

//Mobile.tap(findTestObject('Object Repository/Mobile/Login/android.widget.Button (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Login/baru jam 9/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Login/baru jam 9/android.widget.EditText (1)'), 'dxtest569@yopmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/Login/baru jam 9/android.widget.EditText (2)'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mobile/Login/baru jam 9/android.widget.EditText (3)'), 'p4y+y39Ir5Natt0mUNKYvA==', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Mobile/Login/baru jam 9/android.widget.Button'), 0)

Mobile.closeApplication()

