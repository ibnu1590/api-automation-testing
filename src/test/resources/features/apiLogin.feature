Feature: Login Feature

  @Positive
    Scenario: success login with valid phone dan password
    When I send POST request for "login"
    Then The response status code 201
    And Response body should be with jsonSchema "JSONSCHEMA/LoginSchema.json"