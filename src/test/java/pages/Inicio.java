package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Inicio {

  WebDriver driver;

  public Inicio(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  //General
  
  @FindBy(how = How.ID, using = "toggle-bar")
  private WebElement menuCont;
  
//  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/dad-sidebar/div/div/ul/li[2]/a/img")
//  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[2]/a/i")
  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[2]/a/span[1]")

  private WebElement menuInicio;
  
  

  public WebDriver getDriver() {
    return driver;
  }

  public WebElement getMenuCont() {
    return menuCont;
  }

  public void clickMenuCont() {
    menuCont.click();
  }
  
  public void clickMenuInicio() {
    menuInicio.click();
  }
  
  // Adm Picking
  
//  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[3]/a/i")
  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[3]/a/span[1]")
  private WebElement menuAdmPick;
  
//  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/div/form/div[1]/div[2]/div/input")
//  private WebElement menuAdmPickDespFinal;
  
  @FindBy(how = How.XPATH, using = "//i[@class='icon-dad-informacion']")
//dad-alert[@id='no-results']/alert/div
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
  
  
  //Retiro en tienda
  
//  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[5]/a/i")
  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[5]/a/span[1]")
  private WebElement menuRetiTienda;
  
//  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div/div/dad-retiro-tienda/dad-retiro-tienda-form/form/div[1]/div[1]/label/input")
  @FindBy(how = How.XPATH, using = "//div[@class='container']/div[1]/div[1]/label/input")
  private WebElement menuRetiTiendaCheckOrden;
                                   
  
//  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div/div/dad-retiro-tienda/dad-retiro-tienda-form/form/div[1]/div[2]/label/input")
  @FindBy(how = How.XPATH, using = "//div[@class='container']/div[1]/div[2]/label/input")
  private WebElement menuRetiTiendaCheckRut;
  
  @FindBy(how = How.XPATH, using = "//div[@class='col-md-4']/input")
//  .//*[@id='content']/div/div/div/dad-retiro-tienda/dad-retiro-tienda-form/dad-filter-form/div/div/form/div/div[2]/div/input
  private WebElement menuRetiTiendaInput;
  
//  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div/div/dad-retiro-tienda/dad-retiro-tienda-form/form/div[3]/button")
  @FindBy(how = How.XPATH, using = "//div[@class='form-container']//button[normalize-space(.)='Buscar']")
  private WebElement menuRetiTiendaBuscar;
  
//  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div/div/dad-retiro-tienda/dad-table-generic/div[2]")
  @FindBy(how = How.XPATH, using = "//dad-root/div/div/div/div/dad-retiro-tienda/dad-table-generic/div[2]")
  private WebElement menuRetiTiendaNoHayRes;
  
  @FindBy(how = How.XPATH, using = ".//*[@id='borderLayout_eGridPanel']/div[1]/div/div/div[3]/div[1]/div/div/div/span/span[1]/span[2]")
  private WebElement menuRetiTiendaGrilla;
  
  @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div/div/dad-retiro-tienda/dad-retiro-tienda-form/form/div[2]/div/span")
  private WebElement menuRetiTiendaNoValido;
  
  
  
  public void clickMenuRetiTienda() {
    menuRetiTienda.click();
  }

  public void clickMenuRetiTiendaCheckOrden() {
    menuRetiTiendaCheckOrden.click();
  }

  public void clickMenuRetiTiendaCheckRut() {
    menuRetiTiendaCheckRut.click();
  }
  
  public WebElement getMenuRetiTiendaInput() {
    return menuRetiTiendaInput;
  }
  
  public void clickMenuRetiTiendaInput() {
    menuRetiTiendaInput.click();
  }
  
  public void clickMenuRetiTiendaBuscar() {
    menuRetiTiendaBuscar.click();
  }
  
  public WebElement getMenuRetiTiendaBuscar(){
    return menuRetiTiendaBuscar;
  }
  
  public WebElement getmenuRetiTiendaNoHayRes() {
    return menuRetiTiendaNoHayRes;
    
  }
  
  public WebElement getmenuRetiTiendaGrilla() {
    return menuRetiTiendaGrilla;
  }
  
  public WebElement getmenuRetiTiendaNoValido(){
    return menuRetiTiendaNoValido;
  }
  
  //Mantenedor Storage
  @FindBy(how = How.XPATH, using = "//dad-root/div/div/dad-sidebar/div/div/ul/li[6]/a/span[1]")
  private WebElement menuMantStorage;
  
@FindBy(how = How.XPATH, using = "//div[@class='ag-pinned-right-cols-container']//button[normalize-space(.)='Acciones']")
private WebElement menuMatStorageAccionesFila;


@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div/div/dad-storage/div[2]/dad-table-generic/div[1]/div[2]/div[1]/div/button")
private WebElement menuMatStorageAccionesMasiva;

public void clickmenuMantStorage() {
  menuMantStorage.click();
}

public void clickMenuMantStorageAccionesFila() {
  menuMatStorageAccionesFila.click();
}

public void clickMenuMantStorageAccionesMasiva() {
  menuMatStorageAccionesMasiva.click();
}
  
  
  
  // Despacho Final (fecha)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[2]/div/input
  // Numero de Reserva (?)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[3]/div/input
  // Codigo de Producto (?)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[4]/div/input
  // Rango Horario (combo)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[5]/div/select
  // Tipo Reserva (Normal / Post-Venta)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[6]/div/div[1]/div/label/input
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[6]/div/div[2]/div/label/input
  // Estados (combo)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[2]/div[1]/div/select
  // Camion (combo)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[2]/div[2]/div/select
  // Tipo Servicio (combo)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[2]/div[3]/div/select
  // Tipo de entrega (combo)
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[2]/div[4]/div/select
  // Centro Costo
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[2]/div[5]/div/input
  // Boton buscar
  // .//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[3]/div/div/button
  // Grilla (datos pendiente)

}

