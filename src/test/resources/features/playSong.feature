@playSong
  Feature: Play a song

    Scenario: Play a video successfully
      Given The user opens a Youtube URL
      When The user searches a song and they selected a random one
      Then The user is able to see the song title