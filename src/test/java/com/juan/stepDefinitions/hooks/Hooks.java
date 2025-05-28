package com.juan.stepDefinitions.hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks
{
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        //Start the actor (screenplay)
        setTheStage(new OnlineCast());
    }

    @After
    public void tearDown()
    {
        //driver.quit();
    }
}