package Serarch;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by YavlanskiyMS on 23.02.2016.
 */
public abstract class BaseTest {

    private static final String URL = "http://www.work.ua/";

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
