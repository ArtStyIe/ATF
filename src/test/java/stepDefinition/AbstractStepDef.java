package stepDefinition;

import Page.HomePage;
import Page.LoginPage;
import Util.PropertyLoader;
import org.openqa.selenium.WebDriver;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
       public HomePage homePage = new HomePage(driver);
//    public AdminPage adminPage = new AdminPage(driver);
//    public AutoITPage autoITPage = new AutoITPage(driver);
    protected static String chromeDriver = PropertyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl = PropertyLoader.loadProperty("loginPageUrl");
    public static String excelFilePath = PropertyLoader.loadProperty("excelFilePath");
    public static String excelSheet = PropertyLoader.loadProperty("excelSheet");
    public static String autoItUploadFileSite = PropertyLoader.loadProperty("autoItUploadFileSite");
    public static String restAssuredBaseURL = PropertyLoader.loadProperty("restAssuredBaseURL");
    //public Logger log = LogManager.getLogger();
}
