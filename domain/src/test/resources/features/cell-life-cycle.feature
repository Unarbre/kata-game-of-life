Feature: Cell cycle of life

        Whenever a game tick occures, cell status shall be dead or alive.

    Scenario: Dead cell with 0 neighbors stays dead
        Given the following setup
            | . | . | . |
            | . | . | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 1 neighbors stays dead
        Given the following setup
            | . | x | . |
            | . | . | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 2 neighbors stays dead
        Given the following setup
            | . | x | x |
            | . | . | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 3 neighbors resurrect
        Given the following setup
            | x | x | . |
            | . | . | . |
            | . | x | . |
        When The next game tick occures
        Then the center cell should be alive

    Scenario: Dead cell with 4 neighbors stays dead
        Given the following setup
            | x | x | x |
            | x | . | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 5 neighbors stays dead
        Given the following setup
            | x | x | x |
            | . | . | x |
            | . | x | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 6 neighbors stays dead
        Given the following setup
            | x | x | x |
            | . | . | x |
            | x | x | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 7 neighbors stays dead
        Given the following setup
            | x | x | x |
            | . | . | x |
            | x | x | x |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Dead cell with 8 neighbors stays dead
        Given the following setup
            | x | x | x |
            | x | x | x |
            | x | x | x |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 0 neighbors dies
        Given the following setup
            | . | . | . |
            | . | x | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 1 neighbors dies
        Given the following setup
            | . | x | . |
            | . | x | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 2 neighbors dies
        Given the following setup
            | . | x | x |
            | . | x | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be alive

    Scenario: Living cell with 3 neighbors dies
        Given the following setup
            | x | x | . |
            | . | x | . |
            | . | x | . |
        When The next game tick occures
        Then the center cell should be alive

    Scenario: Living cell with 4 neighbors dies
        Given the following setup
            | x | x | x |
            | x | x | . |
            | . | . | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 5 neighbors dies
        Given the following setup
            | x | x | x |
            | . | . | x |
            | . | x | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 6 neighbors dies
        Given the following setup
            | x | x | x |
            | . | x | x |
            | x | x | . |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 7 neighbors dies
        Given the following setup
            | x | x | x |
            | . | x | x |
            | x | x | x |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Living cell with 8 stays alive
        Given the following setup
            | x | x | x |
            | x | x | x |
            | x | x | x |
        When The next game tick occures
        Then the center cell should be dead

    Scenario: Cell status changing shall not immediatly affect neighboors death and resurrection
        Given the following setup
            | . | . | . |
            | x | x | x |
            | . | . | . |
        When The next game tick occures
        Then B0 AND B2 shall be dead
        And B1 shall be alive

