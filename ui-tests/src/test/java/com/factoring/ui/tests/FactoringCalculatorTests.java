package com.factoring.ui.tests;

import com.factoring.ui.configurations.GlobalConfiguration;
import com.factoring.ui.pageObject.FactoringCalculatorMainPage;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class FactoringCalculatorTests extends GlobalConfiguration {

    @Test
    @Story("AS-ticket")
    public void verifyCalculatedInvoiceFinancingExpensesPercentageWithDefaultInputs() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clickCalculate()
                .verifyInvoiceFinancingPercentageValue("0.53");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInvoiceAmountFieldMandatoryError() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clearInvoiceAmountField()
                .clickCalculate()
                .verifyInvoiceAmountErrorMessage("This field is required");
    }

    @Test
    @Story("AS-ticket")
    public void verifyCommissionFeetFieldMandatoryError() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clearCommissionFeeField()
                .clickCalculate()
                .verifyCommissionFeeErrorMessage("This field is required");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestRateFieldMandatoryError() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clearInterestRateField()
                .clickCalculate()
                .verifyInterestRateErrorMessage("This field is required");
    }

    @Test
    @Story("AS-ticket")
    public void verifyCalculatedInvoiceFinancingExpensesPercentageWithAllChangedValues() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInvoiceAmount("9000000")
                .setAdvanceRate("90")
                .setInterestRate("2")
                .setPaymentTerm("120")
                .setCommissionFee("2.4333")
                .clickCalculate()
                .verifyInvoiceFinancingPercentageValue("3.03");
    }

    @Test
    @Story("AS-ticket")
    public void verifyCalculatedInvoiceFinancingExpensesEurWithDefaultInputs() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clickCalculate()
                .verifyInvoiceFinancingEurValue("52.50");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInvoiceAmountErrorMessageOnSettingString() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInvoiceAmount("String")
                .clickCalculate()
                .verifyInvoiceAmountErrorMessage("Please enter a valid number");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestRateMaximumAllowedValue() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("20")
                .clickCalculate()
                .verifyInterestRateErrorMessageNotDisplayed();
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestRateErrorOnSettingAboveMaxValue() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("20.01")
                .clickCalculate()
                .verifyInterestRateErrorMessage("Please enter a value less than or equal to 20");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestErrorMessageNotDisplayedOnMinimumValue() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("0")
                .clickCalculate()
                .verifyInterestRateErrorMessageNotDisplayed();
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestRateErrorMessageOnSettingNegativeValue() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("-1")
                .clickCalculate()
                .verifyInterestRateErrorMessage("Please enter a value greater than or equal to 0");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestRateErrorMessageOnSettingString() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("tere")
                .clickCalculate()
                .verifyInterestRateErrorMessage("Please enter a valid number");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInterestRateErrorMessageOnSettingSpecialCharacter() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("$")
                .clickCalculate()
                .verifyInterestRateErrorMessage("Please enter a valid number");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInvoiceFinancingExpensesWithNegativeCommissionFee() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setCommissionFee("-10.3")
                .clickCalculate()
                .verifyInvoiceFinancingPercentageValue("-10.07");
    }

    @Test
    @Story("AS-ticket")
    public void errorMessageOnSettingMultipleDotsForCommissionFee() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setCommissionFee("10.3.2")
                .clickCalculate()
                .verifyCommissionFeeErrorMessage("Please enter a valid number");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInvoiceFinancingExpensesWithInvalidInterestRateFieldPercentageValue() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("$")
                .clickCalculate()
                .verifyInvoiceFinancingPercentageValue("0");
    }

    @Test
    @Story("AS-ticket")
    public void verifyInvoiceFinancingExpensesWithInvalidInterestRateFieldEurValue() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInterestRate("$")
                .clickCalculate()
                .verifyInvoiceFinancingEurValue("0.00");
    }

    @Test
    @Story("AS-ticket")
    public void verifyCalculatedInvoiceFinancingExpensesEurWithAllChangedValues() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .setInvoiceAmount("9000000")
                .setAdvanceRate("90")
                .setInterestRate("2")
                .setPaymentTerm("120")
                .setCommissionFee("2.4333")
                .clickCalculate()
                .verifyInvoiceFinancingEurValue("272997.00");
    }

    @Test
    @Story("AS-ticket")
    public void verifyErrorMessageWillNotUpdatePreviousInvoiceFinancingExpenses() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clickCalculate()
                .setInterestRate("asd")
                .clickCalculate()
                .verifyInvoiceFinancingEurValue("52.50");
    }


    @Test
    @Story("AS-ticket")
    public void applyingCalculationsWillLeadToFormLoginPage() {
        FactoringCalculatorMainPage
                .open()
                .clickAcceptCookies()
                .clickApplyForm()
                .verifyLoginBarVisibility();
    }
}
