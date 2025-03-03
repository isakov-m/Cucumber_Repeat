package StepDefinitions;

import Utilities.GWD_old;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before // Cucumber in Annotation i
    public void before(){

    }

    @After // Cucumber in Annotation i
    public void after(Scenario senaryo){

//        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/SenaryoSonuclari3.xlsx",
//                senaryo);

        // extent reportun plugini aktif iken açık kalsın
//        if (senaryo.isFailed()){
//            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
//            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
//        }

        // System.out.println("Senaryo bitti");
        // dogru calisirsa burada quiti cagiracagim
        GWD_old.quitDriver();
    }
}
