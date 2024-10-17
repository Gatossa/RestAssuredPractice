package Config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.BeforeClass;

public class FootballConfig {

    @BeforeClass
    public static void setup() {

            RestAssured.requestSpecification = new RequestSpecBuilder()
                    .setBaseUri("https://api.football-data.org")
                    .setBasePath("/v4/")
                    .setContentType("application/json")
                    .addHeader("X-Response-Control", "minified")
                    .addHeader("X-Auth-Token", "05a960854443478b9f54c1e8eb548203")
                    .addFilter(new RequestLoggingFilter())
                    .addFilter(new ResponseLoggingFilter())
                    .build();

            RestAssured.responseSpecification = new ResponseSpecBuilder()
                    //.expectStatusCode(200)
                    .build();


        }

    }



