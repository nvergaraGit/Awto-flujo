package cucumber.features;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import java.util.Date;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Wd;
// import util.DriverNavegador;
// import util.DriverNavegador;
import pages.Login;
// import pages.HeaderPage;
// import pages.HeaderPage;
import pages.Inicio;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class AdmPicking {

  Login loginObject = new Login();

  Inicio inicioPage = new Inicio(driver);

  static WebDriver driver = Wd.setupDriver();
//  WebDriverWait wait = new WebDriverWait(driver, 50);

  static List<List<String>> excelArchivoUser;

  static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
  Date date = new Date();
  String date1 = dateFormat.format(date);

  public AdmPicking() throws Throwable {

    if (Wd.BROWSER != "chrome") {
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    excelArchivoUser = Wd.leerArchivo("users.xls", 0);

  }

  @Given("^Mostrar datos en grilla$")
  public void mostrar_datos_en_grilla() {

    driver.get(loginObject.HOME);
    driver.manage().window().maximize();
  }

  @When("^Se realice la busqueda$")
  public void se_realice_la_b_squeda() {

    inicioPage.clickMenuCont();

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.clickMenuAdmPick();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    try {
      Wd.takeScreenShotTest(driver,
          "S1-00" + 1 + " " + Wd.BROWSER + " ADM-pïcking - Ingreso de filtros-" + date1);
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println("error: " + e);
    }
  }

  @Then("^Debe mostrar todos los datos de la base de datos para esas caracteristicas$")
  public void debe_mostrar_todos_los_datos_de_la_base_de_datos_para_esas_caracter_sticas() {

    inicioPage.getmenuAdmPickDespFinal().clear();
    inicioPage.getmenuAdmPickDespFinal().sendKeys("30/08/2018");
    inicioPage.clickmenuAdmPickDespFinal();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.clickmenuAdmPickBtnBuscar();

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.clickmenuAdmPickGrillaSelF();
    inicioPage.clickmenuAdmPickGrillaSelAcc();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    try {
      Wd.takeScreenShotTest(driver,
          "S1-00" + 2 + " " + Wd.BROWSER + " ADM-picking - Mostrar sin filtrar-" + date1);
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println("error: " + e);
    }
  }

  @Given("^Filtrar reservas en grilla$")
  public void filtrar_reservas_en_grilla() {

    inicioPage.clickMenuCont();
    inicioPage.clickMenuAdmPick();
  }

  @When("^Se realice una busqueda con filtros$")
  public void se_realice_una_b_squeda_con_filtros() {
    driver.navigate().refresh();
  }

  @Then("^Debe mostrar las reservas con los filtros indicados$")
  public void debe_mostrar_las_reservas_con_los_filtros_indicados() {

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.getmenuAdmPickDespInicial().sendKeys("05/06/2018");
    inicioPage.clickmenuAdmPickDespInicial();

    inicioPage.getmenuAdmPickDespFinal().clear();
    inicioPage.getmenuAdmPickDespFinal().sendKeys("08/07/2018");
    inicioPage.clickmenuAdmPickDespFinal();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    if (inicioPage.getmenuAdmPickNumReserva().isEnabled()) {

      inicioPage.clickmenuAdmPickBtnBuscar();

      try {
        Thread.sleep(7000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if (inicioPage.getmenuAdmPickNoHayResp().isDisplayed()) {

        try {
          Wd.takeScreenShotTest(driver, "S2-00" + 1 + " " + Wd.BROWSER
              + " ADM-picking - Sin resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }

      } else if (inicioPage.getmenuAdmPickGrillaSelF().isEnabled()) {

        inicioPage.clickmenuAdmPickGrillaSelF();
        inicioPage.clickmenuAdmPickGrillaSelAcc();

        try {
          Wd.takeScreenShotTest(driver, "S2-00" + 2 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
      } else {

        try {
          Wd.takeScreenShotTest(driver, "S2-00" + 3 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados ERROR -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
        System.out.print("Validar error con dev");
        System.out.print("\n");
      }
    }

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // }
  }

  @Given("^Hacer un quiebre de una reserva$")
  public void hacer_un_quiebre_de_una_reserva() {

    inicioPage.clickMenuCont();
    inicioPage.clickMenuAdmPick();
  }

  @When("^Se procese a ingresar el quiebre en pantalla DAD$")
  public void se_procese_a_ingresar_el_quiebre_en_pantalla_DAD() {
    driver.navigate().refresh();
  }

  @Then("^Se debe poder ingresar SKU substituto del articulo Quebrado$")
  public void se_debe_poder_ingresar_SKU_substituto_del_articulo_Quebrado() {

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.getmenuAdmPickDespInicial().sendKeys("05/06/2018");
    inicioPage.clickmenuAdmPickDespInicial();

    inicioPage.getmenuAdmPickDespFinal().clear();
    inicioPage.getmenuAdmPickDespFinal().sendKeys("08/07/2018");
    inicioPage.clickmenuAdmPickDespFinal();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    if (inicioPage.getmenuAdmPickNumReserva().isEnabled()) {

      inicioPage.clickmenuAdmPickBtnBuscar();

      try {
        Thread.sleep(7000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if (inicioPage.getmenuAdmPickNoHayResp().isDisplayed()) {

        try {
          Wd.takeScreenShotTest(driver, "S3-00" + 1 + " " + Wd.BROWSER
              + " ADM-picking - Sin resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }

      } else if (inicioPage.getmenuAdmPickGrillaSelF().isEnabled()) {

        inicioPage.clickmenuAdmPickGrillaSelF();
        inicioPage.clickmenuAdmPickGrillaSelAcc();

        try {
          Wd.takeScreenShotTest(driver, "S3-00" + 2 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
      } else {

        try {
          Wd.takeScreenShotTest(driver, "S3-00" + 3 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados ERROR -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
        System.out.print("Validar error con dev");
        System.out.print("\n");
      }
    }

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Given("^Se tiene un quiebre de una reserva$")
  public void se_tiene_un_quiebre_de_una_reserva() {

    inicioPage.clickMenuCont();
    inicioPage.clickMenuAdmPick();
  }

  @When("^No se tenga el SKU substituto del articulo quebrado$")
  public void no_se_tenga_el_SKU_substituto_del_articulo_quebrado() {
    driver.navigate().refresh();
  }

  @Then("^Se debe poder dejar en blanco el campo SKU Substituto$")
  public void se_debe_poder_dejar_en_blanco_el_campo_SKU_Substituto() {

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.getmenuAdmPickDespInicial().sendKeys("05/06/2018");
    inicioPage.clickmenuAdmPickDespInicial();

    inicioPage.getmenuAdmPickDespFinal().clear();
    inicioPage.getmenuAdmPickDespFinal().sendKeys("08/07/2018");
    inicioPage.clickmenuAdmPickDespFinal();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    if (inicioPage.getmenuAdmPickNumReserva().isEnabled()) {

      inicioPage.clickmenuAdmPickBtnBuscar();

      try {
        Thread.sleep(7000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if (inicioPage.getmenuAdmPickNoHayResp().isDisplayed()) {

        try {
          Wd.takeScreenShotTest(driver, "S4-00" + 1 + " " + Wd.BROWSER
              + " ADM-picking - Sin resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }

      } else if (inicioPage.getmenuAdmPickGrillaSelF().isEnabled()) {

        inicioPage.clickmenuAdmPickGrillaSelF();
        inicioPage.clickmenuAdmPickGrillaSelAcc();

        try {
          Wd.takeScreenShotTest(driver, "S4-00" + 2 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
      } else {

        try {
          Wd.takeScreenShotTest(driver, "S4-00" + 3 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados ERROR -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
        System.out.print("Validar error con dev");
        System.out.print("\n");
      }
    }

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // }
  }

  @Given("^Se requiere ingresar SKU substituto de articulo quebrado$")
  public void se_requiere_ingresar_SKU_substituto_de_articulo_quebrado() {

    inicioPage.clickmenuAdmPickDespFinal();
    inicioPage.getmenuAdmPickDespFinal().clear();
    inicioPage.getmenuAdmPickDespFinal().sendKeys("30/06/2018");
  }

  @When("^Se ingrese SKU substituto$")
  public void se_ingrese_SKU_substituto() {
    driver.navigate().refresh();
  }

  @Then("^Se debe efectuar validacion para verificar si el SKU es valido -Familia y SKU valido-$")
  public void se_debe_efectuar_validaci_n_para_verificar_si_el_SKU_es_v_lido_Familia_y_SKU_valido() {

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    inicioPage.getmenuAdmPickDespInicial().sendKeys("05/06/2018");
    inicioPage.clickmenuAdmPickDespInicial();

    inicioPage.getmenuAdmPickDespFinal().clear();
    inicioPage.getmenuAdmPickDespFinal().sendKeys("08/07/2018");
    inicioPage.clickmenuAdmPickDespFinal();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    if (inicioPage.getmenuAdmPickNumReserva().isEnabled()) {

      inicioPage.clickmenuAdmPickBtnBuscar();

      try {
        Thread.sleep(7000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if (inicioPage.getmenuAdmPickNoHayResp().isDisplayed()) {

        try {
          Wd.takeScreenShotTest(driver, "S5-00" + 1 + " " + Wd.BROWSER
              + " ADM-picking - Sin resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }

      } else if (inicioPage.getmenuAdmPickGrillaSelF().isEnabled()) {

        inicioPage.clickmenuAdmPickGrillaSelF();
        inicioPage.clickmenuAdmPickGrillaSelAcc();

        try {
          Wd.takeScreenShotTest(driver, "S5-00" + 2 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados con filtros -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
      } else {

        try {
          Wd.takeScreenShotTest(driver, "S5-00" + 3 + " " + Wd.BROWSER
              + " ADM-picking - Con resultados ERROR -" + date1 + "-");
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("error: " + e);
        }
        System.out.print("Validar error con dev");
        System.out.print("\n");
      }
    }

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}
