package com.factoring.ui.tests;

import com.factoring.ui.configurations.GlobalConfiguration;
import com.factoring.ui.pageObject.FactoringCalculatorMainPage;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class FactoringCalculatorTests extends GlobalConfiguration {

    @Test
    @Story("AS-ticket")
    public void abilityToCalculateWithDefaultInputs() {
        new FactoringCalculatorMainPage()
                .open()
                .setAdvanceRate("");

    }
}
