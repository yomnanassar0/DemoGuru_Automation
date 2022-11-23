
package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginElements {


    public WebElement username()
    {
        return Hooks.driver.findElement(By.name("uid"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.name("password"));
    }
    public WebElement resetbutton( )
    {
        return Hooks.driver.findElement(By.name("btnReset"));
    }


    public WebElement login ()
    {
        return Hooks.driver.findElement(By.name("btnLogin"));
    }

    public WebElement msg ()
    {
        return Hooks.driver.findElement(By.className("heading3"));
    }

    public WebElement empty_id_msg ()
    {
        return Hooks.driver.findElement(By.id("message23"));
    }
    public WebElement empty_password_msg ()
    {
        return Hooks.driver.findElement(By.id("message18"));
    }
    public void presteps ( String username , String pass)
    {

        username().sendKeys(username);
        password().sendKeys(pass);

    }
}