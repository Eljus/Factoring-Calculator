package com.factoring.ui.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class FactoringApplyFormPage {
    public static FactoringCalculatorMainPage open() {
        Selenide.open("/business/finance/trade/factoring/applying/form");
        return Selenide.page(FactoringCalculatorMainPage.class);
    }

    public FactoringApplyFormPage verifyLoginBarVisibility(){
        getLoginBarSection().shouldBe(visible);
        return this;
    }

    private SelenideElement getLoginBarSection(){
        return $("[id='loginbar']");
    }
}
