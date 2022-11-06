package com.factoring.ui.tests;

import com.factoring.ui.configurations.GlobalConfiguration;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FactoringCalculatorTests extends GlobalConfiguration {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        open("/");
    }

    @Test
    @Story("AS-ticket")
    public void abilityToCalculateWithDefaultInputs() {

    }
}
