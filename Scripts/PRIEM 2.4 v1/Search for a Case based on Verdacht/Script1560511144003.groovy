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

'Select Verdachte'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Type'), 'verdachte', true)

WebUI.delay(1)

'Set text to  Achternaam'
WebUI.setText(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Achternaam'), 'AAADAK')

WebUI.delay(1)

'Set text to  Voornaam'
WebUI.setText(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Voornaam'), 'AAADAK')

WebUI.delay(1)

'Click filter btn'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/filteren'))

WebUI.delay(4)

'Click on the check button in front the desired verdachte'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/check button'))

WebUI.delay(4)

WebUI.takeScreenshot()

'Verify the name '
WebUI.getText(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/Verify name search'))

WebUI.delay(1)

'Click on the previous button'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/previous button click'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

'Click on the close button (right above)'
WebUI.click(findTestObject('PRIEM 2.4 v1/Algemene Zoekopdracht/close button'))

WebUI.delay(1)

WebUI.takeScreenshot()

