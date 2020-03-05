package cucumber.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.Wd;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;




// @RunWith(Cucumber.class)@CucumberOptions(format={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report"
// +".html"},tags= "@logingrilla",features="src/test/java/cucumber")

// @RunWith(Cucumber.class)@CucumberOptions(format={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report"
// +".html"},
// tags= "@logingrilla",
// features="src/test/java/cucumber")

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/cucumber",
    // glue={"stepDefinition"},
    tags = "@loginadmpicking",


    // format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"})
// plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report-_-"
// +".html"}



public class RunnerAdmPicking {

  @BeforeClass
  public static void setuppre() {

    DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    Date date = new Date();
    String dateG = dateFormat.format(date);

    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
    extentProperties.setReportPath("output/AdmPicking-" + dateG + ".html");
    // extentProperties.setExtentXServerUrl("http://localhost:1337");
    // extentProperties.setProjectName("MyProject_DAD");

    // Reporter.setSystemInfo("user", System.getProperty("user.name"));
    // Reporter.setSystemInfo("os", "Windows");
    // Reporter.setTestRunnerOutput("Sample test runner output message");
  }

  @AfterClass
  public static void setup() {

    // System.setProperty("target/cucumber-reports/", "report_____" +".html");
    Reporter.loadXMLConfig(new File("reports/extent-config.xml"));
    // Reporter.setSystemInfo("user", System.getProperty("user.name"));
    // Reporter.setTestRunnerOutput("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    // System.setProperty("cucumberReportPath", "TestExecution.html");
    // System.setProperty("target/cucumber-reports/", "report_" + Wd.getDate() + ".html");
    // System.setProperty("target/cucumber-reports/", "report_____" +".html");

  }

  public static void writeExtentReport() {
    System.setProperty("target/cucumber-reports/", "report_____" + ".html");
    Reporter.setSystemInfo("user", System.getProperty("user.name"));
    Reporter.setTestRunnerOutput("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

  }
}

