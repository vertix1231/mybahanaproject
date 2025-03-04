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

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_occupation_pns_differentaddress1-1.jpg')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filleddata_pek_568512'), 
    'Pegawai Negeri')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filleddata_pek_568512'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/occupation pekerja/input_posisi_pekerjaan'), 
    'PNS Esselon 3/4/5')

WebUI.sendKeys(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/occupation pekerja/input_posisi_pekerjaan'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_mainsource_pekerjaan/input_mainsource_pekerjaan'), 
    'Gaji')

WebUI.sendKeys(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_mainsource_pekerjaan/input_mainsource_pekerjaan'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_totalincome_pekerjaan/input_totalincome_pekerjaan'), 
    '> Rp 50,000,000 - 100,000,000')

WebUI.sendKeys(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_totalincome_pekerjaan/input_totalincome_pekerjaan'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Web/open investment account/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/button_Verify'))
WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_occupation_pns_differentaddress2.jpg')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Occupation_nama_kantor'), 
    'Bahana Education Institution Test')

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_fieldindustri_pekerjaan/input_fieldindustri_pekerjaan'), 
    'Industri Pengilangan Minyak Bumi, Pengolahan Gas Bumi, dan Industri Barang-barang dari Hasil Pengilangan Minyak Bumi')

WebUI.sendKeys(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_fieldindustri_pekerjaan/input_fieldindustri_pekerjaan'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_lengthworkyear_pekerjaan/input_lengthworkyear_pekerjaan'), 
    '2222')

WebUI.setText(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/pekerja/input_lengthworkmonth_pekerjaan/input_lengthworkmonth_pekerjaan'), 
    '11111')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Address of Educational Institution_al_e8f64d'), 
    'Jakarta alamat Beneficiary Owner Occupation pns kerja')

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_obj'), 
    '10110')

WebUI.sendKeys(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_button search_floating_filledaddress_obj'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Zip CodeSubdistrictDistrict_no_telp_kantor'), 
    '088273829364')

//WebUI.click(findTestObject('Object Repository/Web/OA/Continue OA Process/Occupation n Investment/Page_Bahana DXtrade Aplikasi Investasi Pasa_007838/input_Beneficiary Owner Address_form-radio _54758c'))
Thread.sleep(5000)

WebUI.scrollToElement(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/btn baru 31 dec 2024-2/button_Next'), 
    3)

WebUI.verifyElementClickable(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/btn baru 31 dec 2024-2/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_occupation_pns_differentaddress3.jpg')

WebUI.click(findTestObject('Web/OA/Continue OA Process/Occupation n Investment/btn baru 31 dec 2024-2/button_Next'))

WebUI.takeScreenshot('D:\\KULIAH DAN KERJA\\KERJA\\bahana bug\\fix\\'+GlobalVariable.email+'\\oa_occupation_pns_differentaddress4.jpg')

