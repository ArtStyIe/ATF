package hooks;


import Util.Singleton;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import stepDefinition.AbstractStepDef;

public class Hooks extends AbstractStepDef {
    @Before("@UI")
    public void beforeUITest() {
        driver = Singleton.getDriver();
    }

//    @After("@UI")
//    public void afterUITest() {
//        Singleton.closeDriver();
//    }

//    @AfterStep("@UI")
//    public void takeScreenShot(Scenario scenario) {
//        log.info("take a screenshot before steps");
//        takeScreenShot(scenario, driver);
//    }
//
//    @Before("@Excel")
//    public void startExcel() {
//        log.info("start connection to Excel file");
//        new ExcelUtil().connectioToExcelFile();
//        testDataFromExcelFile();
//    }
}