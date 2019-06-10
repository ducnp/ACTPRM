import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WiniumDriver driver = null

String appPath = "C:\\Program Files (x86)\\Microsoft\\Skype for Desktop\\Skype.exe"

DesktopOptions option = new DesktopOptions()

option.setApplicationPath(appPath)

option.setDebugConnectToRunningApp(false)

option.setLaunchDelay(2)

driver = new WiniumDriver(new URL('http://localhost:9999'), option)

Thread.sleep(1000)

WebElement window = driver.findElementByClassName('Chrome_WidgetWin_1')

/*

driver.findElementByName('Scientific').click()

window.findElement(By.id('MenuBar')).findElement(By.name('View')).click()

driver.findElementByName('History').click()

window.findElement(By.id('MenuBar')).findElement(By.name('View')).click()

driver.findElementByName('History').click()

window.findElement(By.id('MenuBar')).findElement(By.name('View')).click()

driver.findElementByName('Standard').click()

driver.findElementByName('4').click()

driver.findElementByName('Add').click()

driver.findElementByName('5').click()

driver.findElementByName('Equals').click()

Thread.sleep(5000)*/

driver.close()

