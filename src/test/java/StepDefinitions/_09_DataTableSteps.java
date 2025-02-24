package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_DataTableSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strLinkList = linkler.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);

        }


    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable linkler) {
        List<String> strLinkList = linkler.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebelement = dc.getWebElement(strLinkList.get(i));
            dc.myClick(linkWebelement);

        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0)); // 0 WebElement
            String yazi = items.get(i).get(1); // 1 yazisi

            dc.mySendKeys(e,yazi);
            e.sendKeys(Keys.ENTER);

        }

    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog(DataTable dt) {
        List<String> silinecekler = dt.asList(String.class);

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItem(silinecekler.get(i));

        }
    }
}
