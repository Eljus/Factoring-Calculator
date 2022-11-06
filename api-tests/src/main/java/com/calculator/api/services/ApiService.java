package com.calculator.api.services;

import com.calculator.api.config.ProjectConfig;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.aeonbits.owner.ConfigFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
public class ApiService {
    ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

   protected RequestSpecification setup(){
       RestAssured.baseURI = config.baseUrl();

       return RestAssured
               .given().relaxedHTTPSValidation().contentType(ContentType.JSON)
               .urlEncodingEnabled(false)
               .filters(getFilters());
   }

   private List<Filter> getFilters(){
       if(config.logging()){
           return Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter());
       }
       return Collections.emptyList();
   }
}
