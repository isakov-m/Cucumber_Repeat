package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import _JDBC.JDBCParent;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _14_JDBCSteps {

    DialogContent dc = new DialogContent();

    @Then("Send The Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sql) {

        // db den oku
        List<List<String>> dbList = DBUtility.getDataList(sql); // db den okudum

        for (int i = 1; i < dbList.size(); i++) {
            System.out.println(dbList.get(i).get(0));
        }

        // web den UI dan oku

        List<WebElement> UIList = dc.nameList;
        for (int i = 0; i < UIList.size(); i++) {
            System.out.println(UIList.get(i).getText());    // okudugum UI bilgisini kontrol ediyorum
        }

        // karsilastir

         for(int i = 0; i < dbList.size(); i++) {
             System.out.println(dbList.get(i).get(0)+" - "+UIList.get(i).getText());
            Assert.assertEquals(dbList.get(i).get(0).trim(),UIList.get(i).getText().trim(),"Eslestiorme yapilamadi");
        }
    }
}
