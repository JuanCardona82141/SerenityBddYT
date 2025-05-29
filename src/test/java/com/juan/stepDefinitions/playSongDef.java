package com.juan.stepDefinitions;

import com.juan.questions.ValidateSongName;
import com.juan.tasks.SearchTask;
import com.juan.tasks.SelectSongTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class playSongDef
{
    @When("The user searches a song and they selected a random one")
    public void the_user_searches_a_song_and_they_selected_a_random_one()
    {
        theActorInTheSpotlight().attemptsTo
        (
            SearchTask.searchSong(),
            SelectSongTask.selectSong()
        );
    }
    @Then("The user is able to see the song title")
    public void the_user_is_able_to_see_the_song_title()
    {
        theActorInTheSpotlight().should(
                seeThat("The answer is:", ValidateSongName.assertion(), Matchers.equalTo(true))
        );
    }
}
