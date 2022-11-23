package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.regElements;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class regClass {

    regElements ele = new regElements();
    SoftAssert soft = new SoftAssert();

    @Given("user go to new customer page")
    public void click_new_customer() throws InterruptedException {

        ele.newcustomer().click();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.demo.guru99.com/V4/manager/addcustomerpage.php"));
    }

    @When("user enter first name and last name")
    public void FirstAndLastName() throws InterruptedException {
        ele.cname().sendKeys("Octo octo");

        //Thread.sleep(2000);

    }

    @And("user select gender type")
    public void selectGender() throws InterruptedException {

        ele.genderF().click();

    }



    @And("user enter address")
    public void addr() throws InterruptedException {
        ele.Address().sendKeys("Cairo");



    }
    @And("user enter date of birth")
    public void dob() throws InterruptedException {
        ele.dob().sendKeys("11101990");



    }
    @And("user enter city")
    public void city() throws InterruptedException {
        ele.city().sendKeys("Cairo");
    }

    @And("user enter state")
    public void state() throws InterruptedException {
        ele.state().sendKeys("Cairo");
    }

    @And("^user enters pin\"(.*)\"$")
    public void pin(String pins) throws InterruptedException {
        ele.pin().sendKeys(pins);
    }

    @And("^user enters phone\"(.*)\"$")
    public void phone(String phoneno) throws InterruptedException {
        ele.phone().sendKeys(phoneno);
    }

    @And("click on submit button")
    public void submit() throws InterruptedException {

        ele.submitbtn().click();
        Thread.sleep(2000);

    }

    @And("^user enters email\"(.*)\"$")
    public void email(String mail) throws InterruptedException {

        ele.email().sendKeys(mail);

    }

    @And("^user enters password\"(.*)\"$")
    public void password(String pass) throws InterruptedException {

        ele.password().sendKeys(pass);

    }


    @Then("Already registered")
    public void check_registered() throws InterruptedException {

        soft.assertTrue(Hooks.driver.switchTo().alert().getText().contains("Email Address Already Exist !!"));

        Thread.sleep(1000);
    }
    @Then("Check empty data")
    public void check_empty() throws InterruptedException {

        soft.assertTrue(Hooks.driver.switchTo().alert().getText().contains("please fill all fields"));

        Thread.sleep(1000);
    }
@Then("check success")
    public void success()
{
    soft.assertTrue(ele.successmsg().getText().contains("Customer Registered Successfully!!!"));
}
}



