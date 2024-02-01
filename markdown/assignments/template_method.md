# Assignment: Applying a game framework

**Goal:**

Your goal is to apply a simple game framework to make a game of your choice. As the framework, use the following `Game` class:

```java
public abstract class Game {

    public final void play(int numberOfPlayers) {
        // a template method specifying a generic game
        initializeGame(numberOfPlayers);
        int playerInTurn = 0;
        while (!endOfGame()) {
            playSingleTurn(playerInTurn);
            playerInTurn = ++playerInTurn % numberOfPlayers;
        }
        displayWinner();
    }

    public abstract void initializeGame(int numberOfPlayers);
    public abstract boolean endOfGame();
    public abstract void playSingleTurn(int player);
    public abstract void displayWinner();
}
```

Your goal is to implement a game of your choice by extending the `Game` class. The game should be implemented in the `initializeGame()`, `endOfGame()`, `playSingleTurn()`, and `displayWinner()` methods. The `play()` method in the superclass - that makes the framework - is the template method that specifies the generic game. The `play()` method calls the other methods in the order defined by the template method.


**Guidelines:**

- Note that you are in no way limited to the two classes: the `Game` class and the subclass you have to implement. Your can compose other classes that your subclass uses.
- You can maintain the game's state in the instance variables of your subclass.
- Try not to modify the `Game` class, as it is the framework that you should use as is.

