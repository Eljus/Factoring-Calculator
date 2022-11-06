package com.factoring.ui.tests;

import com.calculator.api.config.ProjectConfig;
import com.factoring.ui.configurations.GlobalConfiguration;
import com.factoring.ui.pageObject.FactoringApplyFormPage;
import com.factoring.ui.pageObject.FactoringCalculatorMainPage;
import io.qameta.allure.Story;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class FactoringCalculatorTests extends GlobalConfiguration {
    ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    @Test
    @Story("AS-ticket")
    public void abilityToCalculateWithDefaultInputs() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clickCalculate()
                .verifyInvoiceFinancingPercentageValue("0.53");

    }

    @Test
    @Story("AS-ticket")
    public void verify() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clickApplyForm()
                .verifyOpenedUrl(config.baseUrl() + "business/finance/trade/factoring/applying/form");
    }
}
