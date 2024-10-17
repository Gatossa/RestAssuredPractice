import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class VerifyBody {
     /*@Test
   public void verifyget() {
        String expected = "{\n" +
                        "\"title\" : \"json-server\"\n"+
                        "\"author\": \"typicode\",\n"+
                        "\"id\": 1\n"+ "}";
        given().log().all().when().
                get("http://localhost:3000/posts/{postId}", 1).
                        then().log().all().body("title", Matchers.equalTo("json-server"));}*/

  @Test
   public void getPostObject() {
     Integer id=1;
      Post newPost= given().log().all().when().get("http://localhost:3000/posts/{postId}", id).
                              then().log().all().body("title", Matchers.equalTo("json-server")).
              and().body("author", Matchers.equalTo("typicode")).
                                extract().body().as(Post.class);

      Assert.assertEquals(newPost.getAuthor(),"typicode");
      Assert.assertEquals(newPost.getTitle(),"json-server");
      Assert.assertEquals(newPost.getId(),id);


  }

}

