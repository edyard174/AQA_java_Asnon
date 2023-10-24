import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class Specifications {

    public static RequestSpecification requestSpecification(String url) {

        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .build();

    }

    public static ResponseSpecification responseSpecification(int status) {

        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .expectBody("headers.x-forwarded-proto", equalTo("https"))
                .expectBody("headers.x-forwarded-port", equalTo("443"))
                .expectBody("headers.host", equalTo("postman-echo.com"))
                .expectBody("headers.x-amzn-trace-id", notNullValue())
                .expectBody("headers.content-type", equalTo("application/json"))
                .build();

    }

    public static void installSpecification(RequestSpecification request, ResponseSpecification response) {

        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;

    }
}
