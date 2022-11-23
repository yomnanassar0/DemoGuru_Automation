package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginElements;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class loginClass {



    loginElements ele = new loginElements();
    SoftAssert soft = new SoftAssert();

    @Given("user go to login page")
    public void open_browser() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.demo.guru99.com/V4/"));


    }



    @When("^user enters \"(.*)\" and \"(.*)\"$")
    public void valid_data(String username, String password) throws InterruptedException {
        ele.presteps(username,password);
        Thread.sleep(1000);
    }

    @And("click on login button")
    public void click_login() throws InterruptedException {
        ele.login().click();
        Thread.sleep(3000);
    }

    @Then("user login successfully")
    public void check_success() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.demo.guru99.com/V4/manager/Managerhomepage.php"));
        soft.assertTrue(ele.msg().getText().contains("Welcome"));

        Thread.sleep(1000);
    }

    @Then("user cannot login")
    public void check_fail() throws InterruptedException {

        soft.assertTrue(Hooks.driver.switchTo().alert().getText().contains("User or Password is not valid"));



        Thread.sleep(1000);
    }

    public void check_empty() throws InterruptedException {

        soft.assertTrue(Hooks.driver.switchTo().alert().getText().contains("please fill all fields"));



        Thread.sleep(1000);
    }


@And("display empty alert")
public void empty_check() throws InterruptedException {
    soft.assertTrue(ele.empty_password_msg().getText().contains("Password must not be blank"));
    soft.assertTrue(ele.empty_id_msg().getText().contains("User-ID must not be blank"));
    Thread.sleep(2000);


}
}
