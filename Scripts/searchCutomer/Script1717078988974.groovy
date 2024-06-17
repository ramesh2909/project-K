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

//Scripting Mode
// Open Brawser
WebUI.openBrowser('https://admin-demo.nopcommerce.com/')

// set text in user name
WebUI.clearText(findTestObject('Object Repository/Tc-03 Scripting Mode/Page_Your store. Login/input_Email_Email'))

WebUI.setText(findTestObject('Object Repository/Tc-03 Scripting Mode/Page_Your store. Login/input_Email_Email'), 'admin@yourstore.com')

// set text in password
WebUI.clearText(findTestObject('Object Repository/Tc-03 Scripting Mode/Page_Your store. Login/input_Password_Password'))

WebUI.setText(findTestObject('Object Repository/Tc-03 Scripting Mode/Page_Your store. Login/input_Password_Password'), 'admin')

//click on login button
WebUI.click(findTestObject('Object Repository/Tc-03 Scripting Mode/Page_Your store. Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Customers  nopCommerce administration/i_Clear cache_right fas fa-angle-left'))
WebUI.click(findTestObject('Object Repository/Page_Customers  nopCommerce administration/p_Customers'))
WebUI.setText(findTestObject('Object Repository/Page_Customers  nopCommerce administration/input_Email_SearchEmail'), "asdfgh@ggmail.com")
WebUI.setText(findTestObject('Object Repository/Page_Customers  nopCommerce administration/input_First name_SearchFirstName'),"asdf")
WebUI.setText(findTestObject('Object Repository/Page_Customers  nopCommerce administration/input_Last name_SearchLastName'),"qwert")
WebUI.click(findTestObject('Object Repository/Page_Customers  nopCommerce administration/button_Search'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customers  nopCommerce administration/td_asdfghggmail.com'), 4)
// click on logout
WebUI.click(findTestObject('Object Repository/Tc-03 Scripting Mode/Page_Dashboard  nopCommerce administration/a_Logout'))

// close brawser
WebUI.closeBrowser()

