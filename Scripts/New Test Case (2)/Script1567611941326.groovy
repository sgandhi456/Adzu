import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bt.adzu4-staging.codeworldwide.com/#')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Page_Base/input_Update your browser_us1_33'), 'satinder.gandhi@codeworldwide.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Base/input_Update your browser_pa1_10'), 'yfq/9fVkW5+QvfzWq38qvg==')

WebUI.click(findTestObject('Object Repository/Page_Base/button_Login'))

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Base/a_Admin'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Base/a_User Manager'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/i_Users_fa fa-filter'))

WebUI.setText(findTestObject('Object Repository/Page_Users  BaseTenants/input_Narrow your search by_form-control'), 'victor')

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/div_System Administrator_dropdown-toggle icon-item'))

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/label_Password Expires_css-label'))

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/td_27'))

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/td_29'))

WebUI.setText(findTestObject('Object Repository/Page_Users  BaseTenants/input_Password Expires In_form-control invalid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Page_Users  BaseTenants/input_Password Expires In_form-control'), '0')

WebUI.click(findTestObject('Object Repository/Page_Users  BaseTenants/button_Save'))

WebUI.closeBrowser()

WebUI.closeBrowser()

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Base/a_Admin_1'))

WebUI.closeBrowser()

WebUI.closeBrowser()

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Base/div_Login                                                                                                                    Forgot password                                Request account'))

WebUI.closeBrowser()

WebUI.closeBrowser()

