package com.juan.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SelectRandomSong implements Interaction
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {

    }

    public static SelectRandomSong random(){return Tasks.instrumented(SelectRandomSong.class);}
}