
import Config.VideoGameConfig;
import Config.VideoGameEndpoints;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class VideoGameTest extends VideoGameConfig {

    @Test
    public void myVideoTest
            () {
        given()
                .log().all()
                .when().
                get("/videogame").
                //.get("https://videogamedb.uk/api/videogame")
                        then()
                .log().all();
    }

    @Test
    public void TestwithEndpoints() {
        given()
               .log().all()
               .when().
        get(VideoGameEndpoints.ALL_VIDEO_GAMES)
        .then()
                .log().all();

    }
}




