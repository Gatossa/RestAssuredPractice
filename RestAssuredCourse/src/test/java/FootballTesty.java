import Config.FootballConfig;
import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;





public class FootballTesty extends FootballConfig {
    @Test
    public void GetDetailsofOneArea() {
        given()
                .queryParam("areas", 2076)
                .when()
                .get("/areas");}

    @Test
    public void GetDetailsofManyAreas() {
        String areasId = "2076,2077,2080";

        given()
                .urlEncodingEnabled(false)
                .queryParam("areas", areasId)
                .when()
                .get("/areas");}

    @Test
    public void AssetFieldinBody() {
        given()
                .when()
                .get("teams/57")
                .then()
                .body("founded", equalTo(1886));}

    @Test
    public void ExtractAllTeamData() {
        String responseBody;
        responseBody = get("teams/57").asString();
        System.out.println(responseBody);}

    @Test
    public void ExtractHeaders() {

        Response response1 =
                given().when().get("teams/57")
                        .then()
                        .extract()
                        .response();
        String ContentTypeHeader = response1.getContentType();
        System.out.println(ContentTypeHeader);
        String ApiVersionHeader = response1.getHeader("X-Api-version");
        System.out.println(ApiVersionHeader);}

    @Test
    public void GetFirstTeamName() {
        given()
                .when()
                .get("competitions/2021/teams/")
                .then()
                .body("teams.name[0]", equalTo("Arsenal FC"));}


//    @Test
//    public void ExtractAllTeamDataDoCheckFirst() {
//
//        Response response =
//                given()
//                        .when()
//                        .get("teams/57")
//                        .then()
//                        .contentType(ContentType.JSON)
//                        .extract()
//                        .response();
//        String jsonResponseAsString = response.asString();
//        System.out.println(jsonResponseAsString);}
//    @Test
//   public void ExtractAllTeamsNames() {
//       Response response =when()
//               .get("competitions/2021/teams")
//                       .then()
//                       .extract()
//                        .response();
//        List<String> teamNames= response.path("team);
//       for(String teamName:teamNames){
//       System.out.println(teamName);}




    //@Test
    //public void FirstTeamName() {
       // String FirstName= get("competition/2021/teams/").jsonPath().getString("teams/name/[0]");
        //System.out.println(FirstName);

    }







