package com.juan.stepDefinitions.hooks;

import com.juan.tasks.OpenYoutubeTask;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonSteps
{
    @CastMember
    Actor User;

    @Given("The user opens a Youtube URL")
    public void the_user_opens_a_youtube_url()
    {
        //User.wasAbleTo((OpenYoutubeTask.openBrowser()));
        theActorCalled("User").wasAbleTo(OpenYoutubeTask.openBrowser());
    }
}