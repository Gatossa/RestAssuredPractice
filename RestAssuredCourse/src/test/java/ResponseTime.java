
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.when;


public class ResponseTime {
    @Test

    public void CaptureResponseTime(){
        long Time =when().get("https://videogamedb.uk/") .timeIn(TimeUnit.MILLISECONDS);
        System.out.println("response time " + Time);




    }
}
