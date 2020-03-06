package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Inicio;
import pages.Login;
import pages.Wd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

// import util.DriverNavegador;
// import util.DriverNavegador;
// import pages.HeaderPage;
// import pages.HeaderPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class registroAwto {

    Login loginObject = new Login();

    Inicio inicioPage = new Inicio(driver);

    static WebDriver driver = Wd.setupDriver();
//  WebDriverWait wait = new WebDriverWait(driver, 50);

    static List<List<String>> excelArchivoUser;

    static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    Date date = new Date();
    String date1 = dateFormat.format(date);

    public registroAwto() throws Throwable {

        if (Wd.BROWSER != "chrome") {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        excelArchivoUser = Wd.leerArchivo("users.xls", 0);
    }


    @Given("^Registro finalizado$")
    public void registro_finalizado() {
        driver.get(loginObject.HOME);
        driver.manage().window().maximize();
    }

    @When("^Se hace click en registrate$")
    public void se_hace_click_en_registrate() {
        inicioPage.clickbotonRegistro();
    }

    @Then("^Ingreso al primer paso$")
    public void ingreso_al_primer_paso() {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(inicioPage.getlabelnombre()));
        System.out.println("Ingreso OK");
    }

    @When("^Se ingresan datos personales uno$")
    public void se_ingresan_datos_personales_uno() {
        inicioPage.getlabelnombre().sendKeys("Francisco9");
        inicioPage.getlabelapellido().sendKeys("Soto9");
        inicioPage.getlabelemail().sendKeys("fsoto9@awto.cl");
        inicioPage.getlabelpass().sendKeys("123456");
        inicioPage.getlabelconfpass().sendKeys("123456");

        inicioPage.getlabelconfpass().sendKeys(Keys.TAB);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.getlabelconfpass().sendKeys(Keys.PAGE_DOWN);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.clickbotonp2();
    }

    @Then("^Ingreso al segundo paso$")
    public void ingreso_al_segundo_paso() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(inicioPage.getlabelmobile()));
        System.out.println("Ingreso Paso 2 OK");
    }

    @When("^Se ingresan datos personales dos$")
    public void se_ingresan_datos_personales_dos() {
        inicioPage.getlabelmobile().sendKeys("56998776549");
        inicioPage.getlabelnewpin().sendKeys("1234");
        inicioPage.getlabeldirection().sendKeys("alameda");
        inicioPage.getlabelrut().sendKeys("11111111-1");
        inicioPage.getlabelbirth().sendKeys("24/12/1978");
        inicioPage.clickcheckgenero();

        inicioPage.getlabelbirth().sendKeys(Keys.PAGE_DOWN);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.subced1();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.subced2();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.subcond1();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.subcond2();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.subselfie();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//inicioPage.getlabelbirth().sendKeys(Keys.TAB);
//inicioPage.getlabelbirth().sendKeys(Keys.PAGE_DOWN);

        inicioPage.clickbotonp3();
    }

    @Then("^Ingreso al tercer paso$")
    public void ingreso_al_tercer_paso() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        //wait.until(ExpectedConditions.visibilityOf(inicioPage.getlabelnombre()));
        System.out.println("Ingreso Paso 3 OK");
    }

    @When("^Se ingresan datos de membresia$")
    public void se_ingresan_datos_de_membresia() {
        inicioPage.clickplan();
        inicioPage.clickacepto();
        inicioPage.clickbotontarjeta();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.clickpago();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inicioPage.clickfin();
    }

    @Then("^Ingreso al paso final$")
    public void ingreso_al_paso_final() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        System.out.println("Ingreso Paso final OK");
    }

    @When("^Se visualiza paso final$")
    public void se_visualiza_paso_final() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^Flujo terminado$")
    public void flujo_terminado() {
        System.out.println("Registro OK");
    }
}

