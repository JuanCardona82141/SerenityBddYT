package com.juan.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (
                features = "src/test/resources/features/",
                tags = "@playSong",
                glue = "com.juan.stepDefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE
        )

public class RunnerTest{}