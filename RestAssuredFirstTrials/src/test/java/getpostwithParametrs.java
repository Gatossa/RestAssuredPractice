import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class getpostwithParametrs {

    @Test
    public void getPostwithParameters() {
        given().log().all().pathParam("postId", 2).when().
                get("http://localhost:3000/posts/{postId}").then().log().all();
    }
}
