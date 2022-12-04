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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'), username[
    3])

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'), password)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))

'Mengambil value harga untuk dibandingkan sebelum checkout'
hargaAwal = WebUI.getText(findTestObject('Page_Swag Labs/Page_Swag Labs/div_29.99'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'Nurhadi')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'Santoso')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '4000')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

'mengambil value harga untuk pembanding sebelum chekout '
hargaCheckout = WebUI.getText(findTestObject('Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/div_29.99'))

'Proses pembandingan'
WebUI.verifyMatch(hargaCheckout, hargaAwal, false)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back Home'))

not_run: WebUI.closeBrowser()

