package com.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.juan.ui.SearchUi.SEARCH_INPUT;

public class SearchTask implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Click.on(SEARCH_INPUT),
                        Enter.theValue("We are the champions").into(SEARCH_INPUT).thenHit(Keys.ENTER)
                );
    }

    public static SearchTask searchSong(){return Tasks.instrumented(SearchTask.class);}
}