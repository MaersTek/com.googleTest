package com.googleT;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class SearchPage {

    public void searchFor(String searchQuery) {
        $x("//div[3]/div[1]/button[2]/div[1]")
                .shouldBe(Condition.visible);
        $x("//div[3]/div[1]/button[2]/div[1]")
                .click();
        $("[name$=q]")
                .val(searchQuery)
                .pressEnter();
    }

}
