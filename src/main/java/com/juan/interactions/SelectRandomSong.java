package com.juan.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Random;

import static com.juan.ui.SongListUi.LIST_SONGS;

public class SelectRandomSong implements Interaction
{
    private int index = 0;
    private String nameSong = "";

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        List<WebElementFacade> listSong = LIST_SONGS.resolveAllFor(actor);
        Random random = new Random();
        index = random.nextInt(listSong.size());

        WebElementFacade song = listSong.get(index);
        nameSong = String.valueOf(song.getText());

        actor.remember("song", nameSong);
        song.click();
    }

    public static SelectRandomSong random(){return Tasks.instrumented(SelectRandomSong.class);}
}