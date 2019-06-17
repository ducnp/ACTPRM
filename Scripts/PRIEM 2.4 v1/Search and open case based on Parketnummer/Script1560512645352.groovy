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

WebUI.callTestCase(findTestCase('PRIEM 2.4 v1/Log in PRIEM'), [:], FailureHandling.STOP_ON_FAILURE)

'Select Parketnummer'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Type'), 'parketnummer', true)

WebUI.delay(1)

'Set text to Parketnummer'
WebUI.setText(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Parketnummer'), '555.00041/17')

WebUI.delay(1)

'Select Parketcode from dropdown 555 - VEEL VOORKOMENDE CRIMINALITEIT'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Parketcode'), '555', false)

/*not_run: WebUI.delay(4)

'Set text dataum from'
not_run: WebUI.setText(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Datum Periode van'), '025/01/2019')

not_run: WebUI.delay(2)

'Set text dataum to'
not_run: WebUI.setText(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Datum Periode naar'), '025/01/2019')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Parketcode'))*/
WebUI.delay(1)

'Click filter btn'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/filteren'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Take screenshot'
WebUI.takeScreenshot()

WebUI.delay(1)

'Click on the edit option (pencil)'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Click opti(pencil)'))

WebUI.delay(1)

'Click on the close button of the case (right above)'
WebUI.scrollToElement(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Parket close data'), 5)

WebUI.delay(1)

'Click on the close button of the case (right above)'
WebUI.scrollToPosition(41, 37)

WebUI.delay(1)

'Click on the close button of the case (right above)'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Parket close data'))

WebUI.delay(1)

'Click on the close button of the Zoek resultaten (right above)'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Zoek Resultaten click close btn'))

WebUI.delay(1)

'Take screenshot'
WebUI.takeScreenshot()

