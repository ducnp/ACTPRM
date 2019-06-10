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

WebUI.callTestCase(findTestCase('main/Priem_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/type'), 'Parketnummer', false)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketnummer'), '555.00108/18')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketcode'), '555', false)

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/van'), '005/10/2018')

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/van'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/month  left'), '9', false)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/year left'), '2018', false)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('test/flipkart/temp/5th'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/naar'), '005/10/2018')

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/naar'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/month  left'), '9', false)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/year left'), '2018', false)

WebUI.click(findTestObject('test/flipkart/temp/5th'))

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketnummer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/filter new'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Autorisatie/selection search items'))

WebUI.selectOptionByLabel(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/type'), 'Verdachte', false)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Achternaam'), 'BOOM')

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Voornaam'), 'j')

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/filter new'))

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/select verdachte'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

