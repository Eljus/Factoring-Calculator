package com.factoring.ui.configurations;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {
    String baseUrl();
    Integer browserTimeout();
}
