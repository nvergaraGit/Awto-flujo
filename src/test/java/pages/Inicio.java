package pages;

import org.openqa.selenium.Keys;
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

    public WebDriver getDriver() {
        return driver;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='wrapper']/div[2]/div[1]/div[3]/div[2]/input")
    private WebElement botonRegistro;

    public void clickbotonRegistro() {
        botonRegistro.click();
    }

    //paso 1

    @FindBy(how = How.XPATH, using = ".//*[@id='fname']")
    private WebElement labelnombre;

    public WebElement getlabelnombre() {
        return labelnombre;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='lname']")
    private WebElement labelapellido;

    public WebElement getlabelapellido() {
        return labelapellido;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='email']")
    private WebElement labelemail;

    public WebElement getlabelemail() {
        return labelemail;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='password']")
    private WebElement labelpass;

    public WebElement getlabelpass() {
        return labelpass;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='confirmPassword']")
    private WebElement labelconfpass;

    public WebElement getlabelconfpass() {
        return labelconfpass;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='paso1Form']/input")
    private WebElement botonp2;

    public void clickbotonp2() {
        botonp2.click();
    }

    //paso 2
    @FindBy(how = How.XPATH, using = ".//*[@id='mobileNo']")
    private WebElement labelmobile;

    public WebElement getlabelmobile() {
        return labelmobile;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='newPin']")
    private WebElement labelnewpin;

    public WebElement getlabelnewpin() {
        return labelnewpin;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='direction']")
    private WebElement labeldirection;

    public WebElement getlabeldirection() {
        return labeldirection;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='rutNo']")
    private WebElement labelrut;

    public WebElement getlabelrut() {
        return labelrut;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='regstep2-birthday']")
    private WebElement labelbirth;

    public WebElement getlabelbirth() {
        return labelbirth;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='paso2Form']/div[9]/div[3]/div[1]/div/div[2]/label/div/span")
    private WebElement checkgenero;

    public void clickcheckgenero() {
        checkgenero.click();
    }

    String CUR_DIR1 = System.getProperty("user.dir");

    @FindBy(how = How.XPATH, using = "//input[@id='iDFront']")
    private WebElement ced1;

    public void subced1() {
        ced1.sendKeys(CUR_DIR1 + "/imagenes/test/carnet1.jpg");
        //ced1.sendKeys(Keys.TAB);
    }

    @FindBy(how = How.XPATH, using = "//input[@id='iDBack']")
    private WebElement ced2;

    public void subced2() {
        ced2.sendKeys(CUR_DIR1 + "/imagenes/test/carnet2.jpg");
    }

    @FindBy(how = How.XPATH, using = "//input[@id='lCFront']")
    private WebElement cond1;

    public void subcond1() {
        cond1.sendKeys(CUR_DIR1 + "/imagenes/test/cond1.jpg");
    }

    @FindBy(how = How.XPATH, using = "//input[@id='lCBack']")
    private WebElement cond2;

    public void subcond2() {
        cond2.sendKeys(CUR_DIR1 + "/imagenes/test/cond2.jpg");
    }

    @FindBy(how = How.XPATH, using = "//input[@id='selfieFront']")
    private WebElement selfie;

    public void subselfie() {
        selfie.sendKeys(CUR_DIR1 + "/imagenes/test/selfie.jpg");
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='documentSubmit']")
    private WebElement botonp3;

    public void clickbotonp3() {
        botonp3.click();
    }

    // paso 3
    @FindBy(how = How.XPATH, using = ".//*[@id='referenceCouponCodeForm']/div[1]/div[1]/div/div[1]/div/label/div/span")
    private WebElement plan;

    public void clickplan() {
        plan.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='referenceCouponCodeForm']/div[3]/label")
    private WebElement acepto;

    public void clickacepto() {
        acepto.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='wrapper']/div[2]/div/div[4]/div/input[2]")
    private WebElement botontarjeta;

    public void clickbotontarjeta() {
        botontarjeta.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='paymentForm']/div/div/div[1]/div[1]/div[3]/label/div/span")
    private WebElement pago;

    public void clickpago() {
        pago.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='paymentForm']/div/div/div[2]/div[3]/div[2]/input")
    private WebElement fin;

    public void clickfin() {
        fin.click();
    }

    public void cierre() {
        driver.close();
        driver.quit();
    }
}

