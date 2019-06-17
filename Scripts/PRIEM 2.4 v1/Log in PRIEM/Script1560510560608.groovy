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

'Open default browser'
WebUI.openBrowser('')

'Delete all cookies'
WebUI.deleteAllCookies()

'Page load time setting '
WebUI.waitForPageLoad(20)

'Windows maximize'
WebUI.maximizeWindow()

'Set Priem application url'
WebUI.navigateToUrl(GlobalVariable.URL)

'Fill in userid'
WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), GlobalVariable.username)

WebUI.delay(1)

'Fill password'
WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), GlobalVariable.encrypted_password)

WebUI.delay(1)

'Click login btn'
WebUI.click(findTestObject('Priem-2 scripts/login/login'))

'Read home page title'
WebUI.getWindowTitle()

'Take home screenshot'
WebUI.takeScreenshot()

