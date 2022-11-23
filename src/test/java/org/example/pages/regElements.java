package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regElements {

    public WebElement newcustomer()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"addcustomerpage.php\"]"));
    }

    public WebElement cname()
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"name\"]"));
    }



    public WebElement city( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"city\"]"));
    }

    public WebElement state( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"state\"]"));
    }


    public WebElement dob( )
    {
        return Hooks.driver.findElement(By.name("dob"));
    }

    public WebElement pin( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"pinno\"]"));
    }

    public WebElement phone( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"telephoneno\"]"));
    }
    public WebElement genderF( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[value=\"f\"]"));
    }
    public WebElement genderM( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[value=\"m\"]"));
    }



    public WebElement Address( )
    {
        return Hooks.driver.findElement(By.cssSelector("textarea[name=\"addr\"]"));
    }
    public WebElement email( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"emailid\"]"));
    }
    public WebElement password( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"password\"]"));
    }
    public WebElement submitbtn( )
    {
        return Hooks.driver.findElement(By.cssSelector("input[type=\"submit\"]"));
    }



    public WebElement successmsg ( )
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"heading3\"]"));
    }


}
