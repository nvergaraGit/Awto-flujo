package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IElements {

  WebDriver driver;

  public IElements(WebDriver driver) {
    this.driver = driver;

    // Crea todos los elementos
    PageFactory.initElements(driver, this);
  }

  @FindBy(how = How.ID, using = "toggle-bar")
  private WebElement menuCont;

  public WebDriver getDriver() {
    return driver;
  }

  public WebElement getMenuCont() {
    return menuCont;
  }

  // INICIO
  public static String MENUCOMPRIMIT = "toggle-bar";

  // Comprimir menu - .//*[@id='content']/div/dad-sidebar/div/div/ul/li[1]/a/img
  public String MENUADMPICKINGCOMPRIMIR =
      ".//*[@id='content']/div/dad-sidebar/div/div/ul/li[1]/a/img";

  // home - .//*[@id='content']/div/dad-sidebar/div/div/ul/li[2]/a/img
  public String MENUADMPICKING = ".//*[@id='content']/div/dad-sidebar/div/div/ul/li[3]/a/img";

  // Despacho Inicial (fecha)
  public String MENUADMPCKDEPI =
      ".//*[@id='content']/div/div/div/dad-administracion-picking/dad-picking-form/form/div[1]/div[1]/div/input";

  // @FindBy(how = How.ID, using ="toggle-bar")
  // @CacheLookup
  // private WebElement menuComp;

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

