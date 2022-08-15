package starter.apiLogin;

import net.serenitybdd.rest.SerenityRest;

public class Api {
    public void postSuccessLogin() {
        SerenityRest.given()
//                .header("Content-type", "application/json")
                .queryParam("phone", "089606853329")
                .queryParam("password", "123")
                .queryParam("latlong", "asd")
                .queryParam("device_token", "123")
                .queryParam("device_type", "2")
                .post("http://pretest-qa.dcidev.id/api/v1/oauth/sign_in");
    }
}
