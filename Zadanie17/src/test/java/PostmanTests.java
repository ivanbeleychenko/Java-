import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanTests{

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI = "https://postman-echo.com";
    }
    @Test
    public void getTest(){
        given()
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                .body("headers.user-agent", Matchers.notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/get"));
    }
    @Test
    public void postTest(){

        given()
                .header("Content-Type",  "application/json")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("foo1=bar1&foo2=bar2"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                .body("headers.content-length", equalTo("19"))
                .body("headers.user-agent", Matchers.notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
    @Test
    public void putTest(){
        given()
                .header("Content-Type",  "application/json")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                .body("headers.content-length", equalTo("58"))
                .body("headers.user-agent", Matchers.notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/put"));
    }
    @Test
    public void patchTest(){
        given()
                .header("Content-Type",  "application/json")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                .body("headers.content-length", equalTo("58"))
                .body("headers.user-agent", Matchers.notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }
    @Test
    public void deleteTest(){
        given()
                .header("Content-Type",  "application/json")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", Matchers.notNullValue())
                .body("headers.content-length", equalTo("58"))
                .body("headers.user-agent", Matchers.notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
    }


