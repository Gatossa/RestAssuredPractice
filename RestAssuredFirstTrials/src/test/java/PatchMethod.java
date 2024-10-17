import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PatchMethod {


    @Test
    public void updatePost() {
        Map<String, Object> newPost=new HashMap<>();
        newPost.put("title", "update tytul to samo");
        newPost.put("author", "patch wlasciwy");
        given().log().all().contentType(ContentType.JSON).body(newPost).
                when().patch("http://localhost:3000/posts/3").
                then().log().all();}



}


