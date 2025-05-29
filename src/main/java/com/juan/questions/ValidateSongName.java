package com.juan.questions;

import com.juan.ui.SongTitle;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateSongName implements Question<Boolean>
{
    private String videoTitle = "";
    private String songTitle = "";

    @Override
    public Boolean answeredBy(Actor actor)
    {
        WebElementFacade elementTitle = SongTitle.LABEL_SONG_NAME.resolveFor(actor);

        videoTitle = String.valueOf(elementTitle.getText());
        songTitle = actor.recall("song");

        return videoTitle.equals(songTitle);
    }

    public static Question<Boolean> assertion()
    {
        return new ValidateSongName();
    }
}