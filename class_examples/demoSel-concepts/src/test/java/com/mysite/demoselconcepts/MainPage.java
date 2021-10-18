package com.mysite.demoselconcepts;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    public SelenideElement toolsMenu = $x("//*[@id=\"js-site-header\"]/div/div/div[2]/div[2]/div/div[1]/nav/div/div/div[1]/button");
    //public SelenideElement searchButton = $("[data-test='site-header-mobile-search-action']");
    public SelenideElement searchButton = $("[data-test='site-header-mobile-search-action']");
}
