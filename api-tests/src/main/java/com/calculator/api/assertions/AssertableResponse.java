package com.calculator.api.assertions;

import com.calculator.api.conditions.Condition;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AssertableResponse {
    private final Response response;

    public AssertableResponse shouldHave(Condition condition){
        log.trace("About to check condition {}", condition);
        condition.check(response);
        return this;
    }

    public Response getResponse(){
        return response;
    }
}
