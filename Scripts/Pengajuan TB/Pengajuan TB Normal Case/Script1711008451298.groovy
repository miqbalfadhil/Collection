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

String TarikBarangInternal = 'Tarik Barang Internal'

String Cabang = 'BOGOR'

String NamaPenarik = 'ARIF NURRAHMAN'

String BiayaTransport = 'Biaya Transport'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-mhub.mantis.id/')

WebUI.setText(findTestObject('Login_page/username'), 'hermiqosyah@mandalafinance.com')

WebUI.setText(findTestObject('Login_page/Page_Hub Admin/password'), 'Mandala123')

WebUI.click(findTestObject('Login_page/Page_Hub Admin/login'))

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.click(findTestObject('Object TB/Activity_dashboard'))

WebUI.click(findTestObject('Object TB/manajemen_ar'))

WebUI.click(findTestObject('Object TB/monitoring_tugas'))

WebUI.click(findTestObject('Object TB/filte_monitoring_tugas'))

//WebUI.setText(findTestObject('Object TB/input_booking'), '200023040108')
WebUI.setText(findTestObject('Object TB/input_booking'), Nomor_Booking)

WebUI.click(findTestObject('Object TB/terapkan_filter'))

WebUI.scrollToElement(findTestObject('Object TB/button_proses'), 0)

WebUI.click(findTestObject('Object TB/button_proses'))

WebUI.click(findTestObject('Object TB/tombol_ajukan_penanganan'))

WebUI.click(findTestObject('Object TB/dropdown_jenis_penanganan'))

WebUI.click(findTestObject('Object TB/dropdown_option', [('value') : TarikBarangInternal]))

WebUI.click(findTestObject('Object TB/tombol_berikutnya_tb'))

WebUI.scrollToElement(findTestObject('Object TB/cabang_lov'), 0)

WebUI.click(findTestObject('Object TB/cabang_lov'))

WebUI.click(findTestObject('Object TB/dropdown_option', [('value') : Cabang]))

WebUI.click(findTestObject('Object TB/pilih_nama_penarik'))

WebUI.click(findTestObject('Object TB/dropdown_option', [('value') : NamaPenarik]))

WebUI.setText(findTestObject('Object TB/input_alasan'), 'hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhee')

WebUI.scrollToElement(findTestObject('Object TB/estimasihargakondisi_input'), 0)

WebUI.setText(findTestObject('Object TB/estimasijual_input'), '1000000')

WebUI.setText(findTestObject('Object TB/estimasihargakondisi_input'), '1000000')

WebUI.click(findTestObject('Object TB/pilih_biayatransport'))

WebUI.click(findTestObject('Object TB/dropdown_option', [('value') : BiayaTransport]))

WebUI.setText(findTestObject('Object TB/nominal_biayatransport'), '100000')

WebUI.click(findTestObject('Object TB/Tombol_ajukanrekomendasi'))

WebUI.click(findTestObject('Object TB/tombol_ajukan'))

WebUI.closeBrowser()

