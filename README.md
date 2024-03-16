# Addressing SOLID Principles

This repository has been created for Red Deer Polytechnic class CPRO 2221 A, Java EE, Assignment 3.

The requirements of the assignment are to choose 3 of 5 of the SOLID principles, create a "violated" and "solved" folder, and create sub-folders in each one for each chosen principle.

The principles are Single Responsibility (SRP), Open/Closed (OCP), Liskov Substitution (LSP), Interface Segregation (ISP), and Dependency Inversion (DIP). I have chosen SRP, OCP, and ISP. I will explain my use of these principles in the section below, "Description of Principles"

We are then to come up with a unique use case that will demonstrate these principles, and describe it here in the README. See below, at "Chosen Use Case".

# Chosen Use Case

I am going to create classes for playing cards and a deck of cards, for the game Go Fish.

# Description of Principles
### SRP

In my violated Single Responsibility Principle version, I have two classes, the PlayingCard and the DeckOfCards. Playing Card has a Rank and Suit, a constructor, and getters/setters. Deck of Cards has a list of PlayingCards, two constructors, and getter/setters. Notably, DeckOfCards also has the methods "shuffleDeck" and "drawCard".

In my solved Single Responsibility Principle version, I have moved the two methods out into a pair of new classes called DeckShuffler and DeckDrawer, and made them static methods that take in a deck object.

### OCP

In the game Go Fish, a set of cards is valid to place down and score a point if all four cards match the same rank. But, a variant of the rules is to include the Jokers in the deck, which can match any rank.

I have made the PlayingCard and Joker classes here, which both extend Card. In the violated folder, the PlayedSet class static function isValidSet will look at the class of the card, and see if it's a Joker class ICard or a PlayingCard class ICard.

To solve this in the solved folder, I have instead given the ICard interface instead of the Card class, and given it a method to see if the card matches a given rank. For Joker, this always returns true, and for PlayingCard this returns true when it is equal to its own rank.

This does make the resulting isValidSet method more complex, in that I have to loop over all expected values of rank, but now I don't have to check if a card is a certain class anymore.

### ISP

Given the variant rule of jokers, I wanted to implement the ability to play a game with or without them.

In my violated/ISP folder, I created an IPlayer interface, and gave it the method to ask for cards, draw cards, play a set, or ask for jokers. I then made a class for players in games with jokers, and a class for players in games without jokers. BUT, for the class that is playing in games without jokers, we have to implement the method to ask for jokers?! So we make it throw an error.

In my solved/ISP folder, I separated the IPlayer interface into four different interfaces, IPlayerCanAskForCards, IPlayerCanDrawCards, IPlayerCanPlaySet, and IPlayerCanAskForJokers. This separates the methods into different interfaces, and the PlayerInGameWithoutJokers class can now implement only the methods it needs to.