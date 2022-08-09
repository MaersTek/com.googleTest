package com.googleT;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {
    public void checkIfSearchResultsAppear(String searchQuery) {
        $x("//h3[contains(.,'" + searchQuery + "')]")
                .shouldHave(Condition.text(searchQuery));
    }
}
