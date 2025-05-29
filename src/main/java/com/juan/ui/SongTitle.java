package com.juan.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SongTitle
{
    public static Target LABEL_SONG_NAME = Target.the("Song's name")
            .locatedBy("css:h1[class='style-scope ytd-watch-metadata'] > yt-formatted-string");
}