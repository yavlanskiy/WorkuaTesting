package registration;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by KAIN on 28.02.2016.
 * BaseTest
 */
public class BaseTest {

    private static final String URL = "https://www.work.ua/jobseeker/register/";

    @org.testng.annotations.BeforeClass
    public void setUp() {
        open(URL);
    }

    @org.testng.annotations.BeforeMethod
    public void beforeMethod(){
        open(URL);
    }

    @org.testng.annotations.AfterClass
    public void after() {
        close();
    }

}

