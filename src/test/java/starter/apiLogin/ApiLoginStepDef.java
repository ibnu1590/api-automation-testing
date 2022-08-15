package starter.apiLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ApiLoginStepDef {
    Api BaseUrl = new Api();
    @When("I send POST request for {string}")
    public void iSendPOSTRequestFor(String arg0) {
        BaseUrl.postSuccessLogin();
    }

    @Then("The response status code {int}")
    public void theResponseStatusCode(int code) {
        SerenityRest.then().assertThat().statusCode(code);
    }

    @And("Response body should be with jsonSchema {string}")
    public void responseBodyShouldBeWithJsonSchema(String path) {
        SerenityRest.and().assertThat().body(matchesJsonSchemaInClasspath(path));
    }
}
