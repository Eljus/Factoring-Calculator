package com.factoring.ui.pageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

public class FactoringApplyFormPage {
    public static FactoringCalculatorMainPage open() {
        Selenide.open("/business/finance/trade/factoring/applying/form");
        return Selenide.page(FactoringCalculatorMainPage.class);
    }

    public void verifyOpenedUrl(String urlToVerify){
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, urlToVerify);
    }
}
