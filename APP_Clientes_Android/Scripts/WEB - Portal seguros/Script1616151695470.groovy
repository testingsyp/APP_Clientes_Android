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

WebUI.openBrowser('https://servicios.segurosbanorte.com/cotizadores/cotizador/homeTradicional.xhtml?usuarioActual=12713&oficinaActual=4027&canalVenta=banco&tipoPantalla=cotizador&ramo=wizardauto')

WebUI.navigateToUrl('https://servicios.segurosbanorte.com/cotizadores/cotizador/homeTradicional.xhtml?usuarioActual=12713&oficinaActual=4027&canalVenta=banco&tipoPantalla=cotizador&ramo=wizardauto')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_Cotizadores/select_Seleccione AUTOMVILES.  PICK UPS.  C_e3e810'), 
    '1: Object', true)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_Cotizadores/select_Seleccione AUTOMVILES RESIDENTES  AU_ea79e3'), 
    '1: Object', true)

WebUI.setText(findTestObject('Object Repository/Web/Page_Cotizadores/input_Cdigo Postal_bxi_codigoPostal'), '67176')

WebUI.sendKeys(findTestObject('Object Repository/Web/Page_Cotizadores/input_Cdigo Postal_bxi_codigoPostal'), Keys.chord(
        Keys.TAB))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Web/Page_Cotizadores/span_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Web/Page_Cotizadores/span_Aceptar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_Cotizadores/select_Seleccione ACURA  ALFA ROMEO  AUDI  _e8569c'), 
    '3: 3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_Cotizadores/select_Seleccione A1  A3  A4  A5  A6  A7  A_76cfdf'), 
    '8: 21', true)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_Cotizadores/select_Seleccione 1998  1997'), '1: 1998', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_Cotizadores/select_Seleccione CABRIOLET CONVERTIBLE CA _c736ba'), 
    '1: Object', true)

WebUI.closeBrowser()

