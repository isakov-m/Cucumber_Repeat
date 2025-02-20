package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.Test;

public class Hooks {

    @Before // Cucumber in Annotation i
    public void before(){
        System.out.println("Senaryo basladi ?");
    }

    @After // Cucumber in Annotation i
    public void after(){
        // System.out.println("Senaryo bitti");
        // dogru calisirsa burada quiti cagiracagim
        GWD.quitDriver();
    }
}
