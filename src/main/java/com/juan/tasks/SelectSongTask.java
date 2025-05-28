package com.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSongTask implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {

    }

    public static SelectSongTask selectSong(){return instrumented(SelectSongTask.class);}
}