package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Inicio2 {

  WebDriver driver;

  public Inicio2(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  //General

  
  public WebDriver getDriver() {
    return driver;
  }
  
  
  // Adm Picking
  
  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[3]/a/span[1]")
  private WebElement menuAdmPick;
  
  @FindBy(how = How.XPATH, using = "//i[@class='icon-dad-informacion']")
  private WebElement menuAdmPickNoHayResp;
  
  @FindBy(how = How.NAME, using = "fecha-inicio")
  private WebElement menuAdmPickDespInicial;
  
  @FindBy(how = How.NAME, using = "fecha-fin")
  private WebElement menuAdmPickDespFinal;
  
  @FindBy(how = How.NAME, using = "numero-reserva")
  private WebElement menuAdmPickNumReserva;
  
  @FindBy(how = How.NAME, using = "codigo-producto")
  private WebElement menuAdmPickCodProd;
  
  @FindBy(how = How.NAME, using = "rango-horario")
  private WebElement menuAdmPickComboRangoHorario;
  
  
  
  @FindBy(how = How.XPATH, using = "//div[@class='form-container']//button[normalize-space(.)='Buscar']")
  private WebElement menuAdmPickBtnBuscar;

  @FindBy(how = How.XPATH,
      using = "//div[@class='ag-pinned-left-cols-container']/div[2]/div[1]/span/span[1]/span[2]")
  private WebElement menuAdmPickGrillaSelF;

  @FindBy(how = How.XPATH,
      using = "//div[@class='ag-pinned-right-cols-container']/div[2]/div/dad-dropdown/div/button")         
  private WebElement menuAdmPickGrillaSelAcc;

  @FindBy(how = How.XPATH,
      using = "//div[@class='view-container']//button[normalize-space(.)='Volver a buscar']")
  private WebElement menuAdmPickBtnVBuscar;

  public WebElement getmenuAdmPickDespInicial(){
    return menuAdmPickDespInicial;
  }
  
  public void clickmenuAdmPickDespInicial() {
    menuAdmPickDespInicial.click();
  }
  
  public WebElement getmenuAdmPickNoHayResp(){
    return menuAdmPickNoHayResp;
  }
  
  public WebElement getmenuAdmPickDespFinal(){
    return menuAdmPickDespFinal;
  }
  
  public void clickmenuAdmPickDespFinal() {
    menuAdmPickDespFinal.click();
  }
  
  public WebElement getmenuAdmPickNumReserva(){
    return menuAdmPickNumReserva;
  }
  
  public void clickmenuAdmPickNumReserva() {
    menuAdmPickNumReserva.click();
  }
  
  public WebElement getmenuAdmPickCodProd(){
    return menuAdmPickCodProd;
  }
  
  public void clickmenuAdmPickCodProd() {
    menuAdmPickCodProd.click();
  }
  
  public WebElement getmenuAdmPickComboRangoHorario(){
    return menuAdmPickComboRangoHorario;
  }
  
  public void clickmenuAdmPickComboRangoHorario() {
    menuAdmPickComboRangoHorario.click();
  }

  public void clickMenuAdmPick() {
    menuAdmPick.click();
  }
  
  public void clickmenuAdmPickBtnBuscar() {
    menuAdmPickBtnBuscar.click();
  }

  public void clickmenuAdmPickGrillaSelF() {
    menuAdmPickGrillaSelF.click();
  }

  public void clickmenuAdmPickGrillaSelAcc() {
    menuAdmPickGrillaSelAcc.click();
  }

  public void clickmenuAdmPickBtnVBuscar() {
    menuAdmPickBtnVBuscar.click();
  }
  
  public WebElement getmenuAdmPickGrillaSelF(){
    return menuAdmPickGrillaSelF;
  }

}

