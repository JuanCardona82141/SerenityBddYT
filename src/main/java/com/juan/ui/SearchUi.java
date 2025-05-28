package com.juan.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchUi
{
    public static Target SEARCH_INPUT = Target.the("Search input").locatedBy("input[name='search_query']");
}