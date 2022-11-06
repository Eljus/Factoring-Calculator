package com.calculator.api.services.endpointServices;

import com.calculator.api.assertions.AssertableResponse;
import com.calculator.api.payloads.FactoringCalculate;
import com.calculator.api.services.ApiService;

public class FactoringApiService extends ApiService {
    public AssertableResponse getCalculate(FactoringCalculate factoringCalculate) {
        return new AssertableResponse(setup()
                .body(factoringCalculate)
                .when()
                .get("b/ss/swedbankabbballswedprod/1/JS-2.9.0/s92561309652512"));
    }
}
