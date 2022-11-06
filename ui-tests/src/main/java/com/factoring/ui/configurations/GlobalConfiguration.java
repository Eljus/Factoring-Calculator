package com.factoring.ui.configurations;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;

public class GlobalConfiguration {
    ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    @BeforeSuite
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = config.baseUrl();
        Configuration.timeout = config.browserTimeout();
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.fastSetValue = true;
        Configuration.holdBrowserOpen = false;

    }
}
