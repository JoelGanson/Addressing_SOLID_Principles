# Addressing SOLID Principles

This repository has been created for Red Deer Polytechnic class CPRO 2221 A, Java EE, Assignment 3.

The requirements of the assignment are to choose 3 of 5 of the SOLID principles, create a "violated" and "solved" folder, and create subfolders in each one for each chosen principle.

The principles are Single Responsibility (SRP), Open/Closed (OCP), Liskov Substitution (LSP), Interface Segregation (ISP), and Dependency Inversion (DIP). I have chosen SRP, OCP, and ISP. I will explain my use of these principles in the section below, "Description of Principles"

We are then to come up with a unique use case that will demonstrate these principles, and describe it here in the README. See below, at "Chosen Use Case".

# Chosen Use Case

I am going to create classes for playing cards and a deck of cards, for the game Go Fish.

# Description of Principles
### SRP

In my violated Single Responsibility Principle version, I have two classes, the PlayingCard and the DeckOfCards. Playing Card has a Rank and Suit, a constructor, and getters/setters. Deck of Cards has a list of PlayingCards, two constructors, and getter/setters. Notably, DeckOfCards also has the methods "shuffleDeck" and "drawCard".

In my solved Single Responsibility Principle version, I have moved the two methods out into a pair of new classes called DeckShuffler and DeckDrawer, and made them static methods that take in a deck object.

### OCP

### ISP
