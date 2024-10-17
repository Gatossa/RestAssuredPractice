package GET;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JiraGetIssue {

    @Test
    public void getIssue() {
                given().
                        auth().preemptive().basic("agatella@go2.pl", "ATATT3xFfGF0Uqh2XaBAJxX4ik0vvUwDZ1trUc22qdXn8Bik1pMWsOzdUE0PQsBR268NfnrLm_sXJYDKYT8p4tctxH3oVqcGs1wXGKBc24EZiV6UP0h_SipJa2AKpYMP0O8Btsc9S7ES_SFQMOI0vJdhgZGgCtrocTWCjYP4kRPnT7vzinVF83o=5A08402A").
                when().
                    get("https://gralatestowa.atlassian.net/rest/api/2/issue/NEW-7").

                then().
                    log().all();




    }
}
