import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;


public class AddNewPostTest {
    @Test
    public void addPost() {
        String newpost = "{\n" +
                "\"title\" : \"pierwszy post\",\n" +
                "\"author\": \"Agata\"" + "}";
        given().log().all().contentType(ContentType.JSON).body(newpost).
                when().post("http://localhost:3000/posts").
                then().log().all();}

        @Test
        public void addPostFromFile() {
            File newpost=new File("src/test/resources/post.json");
        given().log().all().contentType(ContentType.JSON).body(newpost).
                when().post("http://localhost:3000/posts").
                then().log().all();
    }
    @Test
    public void addPostFromMap() {
       Map<String, Object> newPost=new HashMap<>();
       newPost.put("title", "Tytuł z mapy");
       newPost.put("author", "Daria");

        given().log().all().contentType(ContentType.JSON).body(newPost).
                when().post("http://localhost:3000/posts").
                then().log().all();
    }

    @Test
    public void addPostFromObject() {
        Post newPost=new Post();
        //newPost.setAuthor("Author next obiekt");
        newPost.setTitle("Tytuł  next obiekt");
        given().log().all().contentType(ContentType.JSON).body(newPost).
                when().post("http://localhost:3000/posts").
                then().log().all();
    }


    }

