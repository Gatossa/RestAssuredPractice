
import io.restassured.response.Response;
import org.junit.Test;

import Config.FootballConfig;

import java.util.Map;

import static io.restassured.RestAssured.get;


public class GPathJsonTests extends FootballConfig {

    @Test
    public void extractMapOfElementsWithFind() {

        Response response = get("competitions/2021/teams");

        Map<String, ?> allTeamDataForSingleTeam = response.path
                ("teams.find { it.name == 'Manchester United FC' }");

        System.out.println("Map of Team Data = " + allTeamDataForSingleTeam);
    }





}






