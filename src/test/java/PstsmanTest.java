import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pojes.Value;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PstsmanTest {

    private final static String URL = "https://postman-echo.com/";

    @BeforeEach
    void setup() {

        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecification(200));

    }

    @Test
    void postmanEchoGetTest() {

        given()
                .when()
                .get("get")
                .then()
                .body("url", equalTo("https://postman-echo.com/get"));

    }

    @Test
    void postmanEchoGetWopsTest() {

        given()
                .when()
                .get("get?foo1=bar1&foo2=bar2")
                .then()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));

    }

    @Test
    void postmanEchoPostTest() {

        Value v = new Value("value");

        given()
                .body(v)
                .when()
                .post("post")
                .then()
                .body("data.test", equalTo("value"))
                .body("json.test", equalTo("value"))
                .body("url", equalTo("https://postman-echo.com/post"));

    }

    @Test
    void postmanEchoPostData() {

        given()
                .when()
                .post("post?foo1=bar1&foo2=bar2")
                .then()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post?foo1=bar1&foo2=bar2"));

    }

    @Test
    void postmanEchoPutTest() {

        String s = "This is expected to be sent back as part of response body.";

        given()
                .body(s)
                .when()
                .put("put")
                .then()
                .body("data", equalTo(s))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/put"));

    }

    @Test
    void postmanEchoPatchTest() {

        String s = "This is expected to be sent back as part of response body.";

        given()
                .body(s)
                .when()
                .patch("patch")
                .then()
                .body("data", equalTo(s))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/patch"));

    }

    @Test
    void postmanEchoDeleteTest() {

        String s = "This is expected to be sent back as part of response body.";

        given()
                .body(s)
                .when()
                .delete("delete")
                .then()
                .body("data", equalTo(s))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/delete"));

    }
}
