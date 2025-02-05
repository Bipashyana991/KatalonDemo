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

WebUI.navigateToUrl('https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Practice - Student Registration Form/input_Name_name'), 'somi')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Practice - Student Registration Form/input_Email_email'), 
    'somi@0514')

WebUI.click(findTestObject('Object Repository/Page_Selenium Practice - Student Registration Form/input_Male_form-check-input mt-0'))

WebUI.setText(findTestObject('Object Repository/Page_Selenium Practice - Student Registration Form/input_Mobile(10 Digits)_mobile'), 
    '9337032542')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Practice - Student Registration Form/input_Subjects_subjects'), 
    'physics')

WebUI.click(findTestObject('Object Repository/Page_Selenium Practice - Student Registration Form/input_Sports_form-check-input mt-0'))

WebUI.closeBrowser()

