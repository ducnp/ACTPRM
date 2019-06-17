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

'mouse over to Registratie'
WebUI.mouseOver(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Registratie'))

WebUI.delay(1)

'Click Parket Zaak EA'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Parket Zaak EA'))

WebUI.delay(1)

'Scroll to verdachte field'
WebUI.scrollToElement(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Scroll to element Verdachte'), 5)

WebUI.delay(1)

WebUI.comment('We need to change xpath Parketnummer every time')

'Click on the check button in front the desired verdachte'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Select Verdachte on of the list'))

WebUI.delay(2)

'Select from list :: 555 - VEEL VOORKOMENDE CRIMINALITEIT'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Parketcode Nieuw Parketnummer EA'), '555', false)

WebUI.delay(1)

'Select from the list :: CURACAO'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Instantie Nieuw Parketnummer EA'), '2', false)

WebUI.delay(1)

'Select from the list :: KPC BUREAU INTERNE ZAKEN'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Instantiev 2 Nieuw Parketnummer EA'), '11', false)

WebUI.delay(1)

'Click Officier van Justitie eye'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Officier van Justitie click Nieuw Parketnummer EA'))

WebUI.delay(2)

'Select dropdown from Officier van Justitie'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Officier van Justitie lb(dropdown) Nieuw Parketnummer EA'))

WebUI.delay(1)

'Click Parketsecretaris eye'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Parketsecretaris Nieuw Parketnummer EA'))

WebUI.delay(2)

'Select dropdown from Parketsecretaris '
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Parketsecretaris lb (dropdown) Nieuw Parketnummer EA'))

WebUI.delay(1)

'Scroll to position'
WebUI.scrollToElement(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Registratie'), 5)

WebUI.delay(1)

'Hide menu click'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Parket menu hide click'))

WebUI.delay(2)

'Cleck tab Delictsoort'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Delictsoort Nieuw Parketnummer EA'))

WebUI.delay(2)

'Select from drop list :: Zaak Type 1'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Delictsoort Omschrijving Nieuw Parketnummer EA'), 
    '1', false)

WebUI.delay(2)

'Cleck tab Delictsoort'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Delictsoort Nieuw Parketnummer EA'))

WebUI.delay(2)

'Cleck tab Verdenking'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Verdenking Nieuw Parketnummer EA'))

WebUI.delay(2)

'Click the button New'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Verdenking new click Nieuw Parketnummer EA'))

WebUI.delay(4)

'Click Wetboek eye'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Wetboek'))

WebUI.delay(2)

'Select drop down from the list  :: EILANDSBESLUIT ONDERWATERPARK BONAIRE'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Wetboek lb(drop down)'))

WebUI.delay(2)

'Click Wetboek eye'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Titel'))

WebUI.delay(2)

'Select drop down from the list  :: Bepalingen over meerboeien'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Titel lb (drop down)'))

WebUI.delay(2)

'Click Artikel'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Artikel'))

WebUI.delay(3)

'Select drop down from the list  :: Artikel 25 lid 2'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Artikel lb (drop down)'))

WebUI.delay(1)

'Enter text from Kwalificatie field.'
WebUI.setText(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/ver Kwalificatie'), 'Testing ...............................................................')

WebUI.delay(1)

'set text from field Pleegdatum'
WebUI.setText(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/ver Pleegdatum'), '017/06/2019')

WebUI.delay(1)

'Slect from drop down list :: POGING'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/ver Uitvoering'), '1', false)

WebUI.delay(1)

'Slect from drop down list :: MEDEPLICHTIGE'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/ver Daderschap'), '1', false)

WebUI.delay(1)

'Save the fileded data from Verdenking'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Save btn'))

WebUI.delay(1)

'Save the fileded data from Verdenking'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Ver Save btn'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Registratie'), 5)

WebUI.delay(1)

'Cleck tab Verdenking'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Verdenking Nieuw Parketnummer EA'))

WebUI.delay(1)

'Click tab Contact'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact'))

WebUI.delay(1)

'Click the btn new'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact new'))

WebUI.delay(2)

'Select drop down list from the field Relatie:: SLACHTOFFER'
WebUI.selectOptionByValue(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact Relatie'), '3', false)

WebUI.delay(1)

'Enter text from field Achternaam'
WebUI.setText(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact Achternaam'), 'AAADAK')

WebUI.delay(2)

'Selct from drop down list :: AAADAK, AAADAK, 26/06/2014'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact Achternaam lb (dropdown)'))

WebUI.delay(2)

'Click contact data saved'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact save'))

WebUI.delay(1)

'Click contact data saved'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Contact save'))

WebUI.delay(2)

'Click total save data\r\n'
WebUI.click(findTestObject('PRIEM 2.4 v1/Parket Zaak EA/Total Ver save'))

