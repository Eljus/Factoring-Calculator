package com.calculator.api.conditions;

import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.awaitility.Awaitility;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

@Slf4j
@RequiredArgsConstructor
public class BodyPlainText implements Condition{

    private final String responsePlainText;

    @Override
    public void check(Response response){
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(()-> !response.asString().isEmpty());
        if(!response.asString().contains(responsePlainText)){
            Assert.fail("Expected Response text" + responsePlainText + " is different from Actual: " + response.asString());
        }
    }

    @Override
    public String toString(){
        return "Body text is: " + responsePlainText;
    }
}
