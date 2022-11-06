package com.factoring.ui.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FactoringCalculatorMainPage {
    public FactoringCalculatorMainPage open() {
        Selenide.open("/");
        return this;
    }

    public FactoringCalculatorMainPage setInvoiceAmount(String invoiceAmount) {
        getInvoiceAmount().setValue(invoiceAmount);
        return this;
    }

    public FactoringCalculatorMainPage verifyInvoiceAmountHas(String invoiceAmount) {
        getInvoiceAmount().shouldHave(Condition.exactText(invoiceAmount));
        return this;
    }

    public FactoringCalculatorMainPage verifyAdvanceRateHas(String advanceRate) {
        getAdvanceRate().shouldHave(Condition.exactText(advanceRate));
        return this;
    }

    public FactoringCalculatorMainPage setAdvanceRate(String advanceRate) {
        getAdvanceRate().setValue(advanceRate);
        return this;
    }

    public FactoringCalculatorMainPage verifyInterestRate(String interestRate) {
        getInterestRate().shouldHave(Condition.exactText(interestRate));
        return this;
    }

    public FactoringCalculatorMainPage setInterestRate(String interestRate) {
        getInterestRate().setValue(interestRate);
        return this;
    }

    public FactoringCalculatorMainPage verifyPaymentTerm(String paymentTerm) {
        getPaymentTerm().shouldHave(Condition.exactText(paymentTerm));
        return this;
    }

    public FactoringCalculatorMainPage setPaymentTerm(String paymentTerm) {
        getPaymentTerm().setValue(paymentTerm);
        return this;
    }

    public FactoringCalculatorMainPage verifyCommissionFee(String comissioNFee) {
        getPaymentTerm().shouldHave(Condition.exactText(comissioNFee));
        return this;
    }

    public FactoringCalculatorMainPage setCommissionFee(String comissioNFee) {
        getPaymentTerm().setValue(comissioNFee);
        return this;
    }

    private SelenideElement getInvoiceAmount() {
        return $("[id='D5']");
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
}
