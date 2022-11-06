package com.calculator.tests;

import com.calculator.api.services.ApiService;
import com.calculator.api.payloads.FactoringCalculate;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Slf4j
public class CalculatorTest {

    private final ApiService apiService = new ApiService();

    @BeforeClass
    public void seuUp(){
        RestAssured.baseURI = "https://swedbankab.d3.sc.omtrdc.net/b/ss/swedbankabbballswedprod/1/JS-2.9.0/s92561309652512";
    }

    @Test
    public void abilityToCalculateFactoringCalculator(){
        FactoringCalculate factoringCalculate = new FactoringCalculate()
                .aqb("1")
                .ndh("1")
                .pf("1")
                .t("6/10/2022 13:52:23 0 -120")
                .ts("1667735544")
                .mid("77711594932993099831277502136663481371")
                .ce("UTF-8")
                .ns("swedbankab")
                .pageName("web/business/finance/trade/factoring")
                .g("https://www.swedbank.lt/business/finance/trade/factoring?language=ENG")
                .ch("web/lt/business/finance")
                .events("event146")
                .v1("D=pageName")
                .v2("D=ch")
                .l2("v23;v73;v74;e146;pageName;ch;v1;v2;v3;v4;v5;v6;v7;v9;v10;v22;v57;v58;v59;v92;v97;v102;v119;v121")
                .v2("lt-web-business")
                .v4("223")
                .v5("web")
                .v6("eng")
                .v7("0210")
                .v9("business")
                .v10("D=User-Agent")
                .v22("desktop")
                .v23("calculator-cta:calculate-factoring")
                .v57("https://www.swedbank.lt/business/finance/trade/factoring")
                .v58("D=r")
                .v59("Faktoringas")
                .v73("button")
                .v74("calculator")
                .v92("0")
                .v97("lt")
                .v102("language=ENG")
                .v119("web/business/finance/trade/factoring")
                .v121("Factoring")
                .pe("lnk_o")
                .pev2("click")
                .mcorgid("AB12899B544ABE260A4C98BC")
                .lrt("3")
                .aqe("1");

        RestAssured
                .given().contentType(ContentType.JSON).log().all()
                .body(factoringCalculate)
                .when()
                .get()
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
