package com.googleT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class GoogleSearchUITest {


    String searchQuery = "book";

    @BeforeEach
    void openPage() {
        open("http://www.google.com/");
    }


    @Test
    void searchWords() {
        new SearchPage()
                .searchFor(searchQuery);

        new SearchResultPage()
                .checkIfSearchResultsAppear(searchQuery);
    }

}
