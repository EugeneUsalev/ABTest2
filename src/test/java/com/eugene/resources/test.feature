Feature: search on yandex

  Scenario Outline: test result page title
    Given I open start page
    When i search <query>
    Then i get to the <expected title> page
    Examples:
      | query        | expected title   |
      | "Окей, гугл" | "Окей, гугл"     |
      | "Я не гугл"  | "Окей, гугл"     |