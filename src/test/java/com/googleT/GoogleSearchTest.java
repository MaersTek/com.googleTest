package com.googleT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class GoogleSearchTest {


    @Test
    public void checkGoogleReachable() {
        String searchURL = "http://www.google.com/search?q=";
        String searchQuery = "table";

        RestAssured.get(searchURL + searchQuery)
                .then()
                .statusCode(200)
                .contentType(ContentType.HTML);


    }
}
