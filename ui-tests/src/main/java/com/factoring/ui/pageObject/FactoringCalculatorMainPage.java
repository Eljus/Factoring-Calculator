package com.factoring.ui.pageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.factoring.ui.configurations.GlobalConfiguration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class FactoringCalculatorMainPage {
    public static FactoringCalculatorMainPage open() {
        Selenide.open("business/finance/trade/factoring?language=ENG/");
        return Selenide.page(FactoringCalculatorMainPage.class);
    }

    public FactoringApplyFormPage clickApplyForm() {
        getApply().click();
        return page(FactoringApplyFormPage.class);
    }

    public FactoringCalculatorMainPage clickAcceptCookies() {
        getAcceptCookies().click();
        return this;
    }

    public FactoringCalculatorMainPage setInvoiceAmount(String invoiceAmount) {
        getInvoiceAmount().setValue(invoiceAmount);
        return this;
    }

    public FactoringCalculatorMainPage clearInvoiceAmountField() {
        getInvoiceAmount().clear();
        return this;
    }

    public FactoringCalculatorMainPage clearInterestRateField() {
        getInterestRate().clear();
        return this;
    }

    public FactoringCalculatorMainPage clearCommissionFeeField() {
        getCommissionFee().clear();
        return this;
    }

    public FactoringCalculatorMainPage verifyInterestRateErrorMessage(String errorMessage) {
        getInterestRateErrorMessage().shouldHave(exactText(errorMessage));
        return this;
    }

    public FactoringCalculatorMainPage verifyInterestRateErrorMessageNotDisplayed() {
        getInterestRateErrorMessage().shouldNotBe(visible);
        return this;
    }

    public FactoringCalculatorMainPage verifyInvoiceAmountErrorMessage(String errorMessage) {
        getInvoiceAmountErrorMessage().shouldHave(exactText(errorMessage));
        return this;
    }

    public FactoringCalculatorMainPage verifyCommissionFeeErrorMessage(String errorMessage) {
        getCommissionFeeErrorMessage().shouldHave(exactText(errorMessage));
        return this;
    }

    public FactoringCalculatorMainPage verifyInvoiceAmountHas(String invoiceAmount) {
        getInvoiceAmount().shouldHave(exactText(invoiceAmount));
        return this;
    }

    public FactoringCalculatorMainPage verifyAdvanceRateHas(String advanceRate) {
        getAdvanceRate().shouldHave(exactText(advanceRate));
        return this;
    }

    public FactoringCalculatorMainPage setAdvanceRate(String advanceRateOptionToSelect) {
        openAdvanceRateDropdownMenu();
        selectAdvanceRateOption(advanceRateOptionToSelect);
        return this;
    }

    private void selectAdvanceRateOption(String advanceRateOptionToSelect) {
        getAdvanceRate().selectOption(advanceRateOptionToSelect);
    }

    private void openAdvanceRateDropdownMenu() {
        getAdvanceRate().click();
    }

    public FactoringCalculatorMainPage verifyInterestRate(String interestRate) {
        getInterestRate().shouldHave(exactText(interestRate));
        return this;
    }

    public FactoringCalculatorMainPage setInterestRate(String interestRate) {
        getInterestRate().setValue(interestRate);
        return this;
    }

    public FactoringCalculatorMainPage verifyPaymentTerm(String paymentTerm) {
        getPaymentTerm().shouldHave(exactText(paymentTerm));
        return this;
    }

    public FactoringCalculatorMainPage setPaymentTerm(String paymentTerm) {
        openPaymentTermDropdownMenu();
        selectPaymentTermDropDownValue(paymentTerm);
        return this;
    }

    private void selectPaymentTermDropDownValue(String paymentTerm) {
        getPaymentTerm().selectOption(paymentTerm);
    }

    private void openPaymentTermDropdownMenu() {
        getPaymentTerm().click();
    }

    public FactoringCalculatorMainPage verifyCommissionFee(String commissionFee) {
        getPaymentTerm().shouldHave(exactText(commissionFee));
        return this;
    }

    public FactoringCalculatorMainPage setCommissionFee(String commissionFee) {
        getCommissionFee().setValue(commissionFee);
        return this;
    }

    public FactoringCalculatorMainPage verifyInvoiceFinancingPercentageValue(String invoiceFinancingPercentage) {
        getInvoiceFinancingPercentage().shouldHave(exactText(invoiceFinancingPercentage));
        return this;
    }

    public FactoringCalculatorMainPage verifyInvoiceFinancingEurValue(String invoiceFinancingPercentage) {
        getInvoiceFinancingEur().shouldHave(exactText(invoiceFinancingPercentage));
        return this;
    }

    public FactoringCalculatorMainPage clickCalculate() {
        getCalculateButton().click();
        return this;
    }

    private SelenideElement getInvoiceAmount() {
        return $("[id='D5']");
    }

    private SelenideElement getInterestRateErrorMessage() {
        return $("[for='D7']");
    }

    private SelenideElement getInvoiceAmountErrorMessage() {
        return $("[for='D5']");
    }

    private SelenideElement getCommissionFeeErrorMessage() {
        return $("[for='D9']");
    }

    private SelenideElement getAcceptCookies() {
        return $("[data-wt-label='Accept']");
    }

    private SelenideElement getApply() {
        return $("[class='calculator-results col-4']>div>button");
    }

    private SelenideElement getAdvanceRate() {
        return $("[id='D6']");
    }

    private SelenideElement getInterestRate() {
        return $("[id='D7']");
    }

    private SelenideElement getPaymentTerm() {
        return $("[id='D8']");
    }

    private SelenideElement getCommissionFee() {
        return $("[id='D9']");
    }

    private SelenideElement getCalculateButton() {
        return $("[id='calculate-factoring']");
    }

    private SelenideElement getInvoiceFinancingPercentage() {
        return $("[id='result_perc']");
    }

    private SelenideElement getInvoiceFinancingEur() {
        return $("[id='result']");
    }
}
