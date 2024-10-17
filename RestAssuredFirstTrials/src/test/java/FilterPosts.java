import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FilterPosts {
    @Test
    public void filterPostwithParameters() {
        given().log().all().queryParam("author", "Daria").when().
                get("http://localhost:3000/posts").then().log().all();


    }

    @Test
    public void filterPostwithParameters2() {
        given().log().all().queryParam("id", 3, 5).when().
                get("http://localhost:3000/posts").then().log().all();
    }
}


