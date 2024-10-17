import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class verifycode {

    @Test
    public void getPost() {
        //when().get("http://localhost:3000/posts/").then().log().all().statusCode(200);
        //when().get("http://localhost:3000/posts/").then().
        //log().all().assertThat().statusCode(Matchers.greaterThanOrEqualTo(200));
        when().get("http://localhost:3000/posts/").then().
                log().all().assertThat().statusLine(Matchers.containsString("OK"));
    }
   // @Test
    //public void TIME() {
        //long time=when().getlog().all().assertThat().statusLine(Matchers.containsString("OK"));


}