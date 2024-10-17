import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UpdatePost {

@Test
        public void updatePost() {
        Map<String, Object> newPost=new HashMap<>();
       // newPost.put("title", "update tytul");
        newPost.put("author", "update  bez nulla author");
            given().
                    log().all().contentType(ContentType.JSON).body(newPost).
                    when().
                            put("http://localhost:3000/posts/2").
                    then().
                            log().all();}



        }


