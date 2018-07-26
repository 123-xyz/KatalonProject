import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(a)

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_username'), a)

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_password'), a)

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/login/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/span_glyphicon glyphicon-calen'))

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/textarea_comment'), 'general checkup')

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

