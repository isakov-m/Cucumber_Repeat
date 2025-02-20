package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        // System.out.println("Site acildi");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        // System.out.println("Username ve password girildi");
//
//        WebDriverWait wait  = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("Techno2025.%");
//        dc.loginButton.click();

        dc.mySendKeys(dc.username,"turkeyts");
        dc.mySendKeys(dc.password,"Techno2025.%");
        dc.myClick(dc.loginButton);

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.verifyContainsText(dc.txtStudent,"Student");
    }
}
