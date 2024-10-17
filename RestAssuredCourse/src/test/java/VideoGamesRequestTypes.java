import Config.VideoGameConfig;
import Config.VideoGameEndpoints;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class VideoGamesRequestTypes extends VideoGameConfig {

    @Test
    public void getALLGames(){
        given()
                .when().
                get(VideoGameEndpoints.ALL_VIDEO_GAMES)
                .then();
    }
        

    }


