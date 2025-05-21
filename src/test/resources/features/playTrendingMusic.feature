@playTendringMusic
Feature: Play the first trending song - Music

  Scenario: Navigate to the trending music tab and play a song
    Given The user opens a Youtube URL
    When The user navigates to the trending section
    And The user selects the Music tab
    And The user clicks on the first song in the roster
    Then The user must see the played song title