package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_CitizenShipSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to Citizenship")
    public void navigateToCitizenship() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenships);
    }

    @When("Create a citizenship")
    public void createACitizenship() {
        String citizenshipName = RandomStringUtils.randomAlphanumeric(8);
        String citizenshipShCo = RandomStringUtils.randomNumeric(4);
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,citizenshipName);
        dc.mySendKeys(dc.shortNameInput,citizenshipShCo);
        dc.myClick(dc.saveButton);
    }

    @When("Create a citizenship name as {string} shortname as {string}")
    public void createACitizenshipNameAsShortnameAs(String name, String shortName) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.shortNameInput,shortName);
        dc.myClick(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyMsg,"already exist");
        dc.myClick(dc.toasterMsgCloseBtn);
    }

    @When("User delete the {string}")
    public void userDeleteThe(String name) {
        dc.deleteItem(name);
    }
}
