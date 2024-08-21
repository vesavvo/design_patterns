# Factory Method

> A creational pattern

## Example: [Adventure game](../../src/main/java/factory_method/adventure)

This is a simple adventure game, where the game world consists of rooms. There are two alternative implementations of the game: a 'horror' game and a 'sweet' game.

The rooms in the game are represented by the [`Room`](../../src/main/java/factory_method/adventure/Room.java) interface. There are two implementations of the interface: [`ScaryRoom`](../../src/main/java/factory_method/adventure/ScaryRoom.java) and [`LovelyRoom`](../../src/main/java/factory_method/adventure/LovelyRoom.java).

Those are the products in the factory method pattern.

The game classes are the creators. There is the abstract creator class called [`Game`](../../src/main/java/factory_method/adventure/Game.java). It has two concrete subclasses: [`HorrorGame`](../../src/main/java/factory_method/adventure/HorrorGame.java) and [`RelaxedGame`](../../src/main/java/factory_method/adventure/RelaxedGame.java). Each of the concrete creator subclasses has an overridden factory method `makeRoom()` that creates a room that matches the game type.

Pay attention to the game logic in the [`Game`](../../src/main/java/factory_method/adventure/Game.java) class. It doesn't know the concrete type of the room. It only knows that there are `Room` objects. The concrete type of the room is determined by the concrete game class. Moreover, the game logic is completely agnostic of the game type.

The Main class [`Main`](../../src/main/java/factory_method/adventure/Main.java) creates a game object of desired type
(either `HorrorGame` or `RelaxedGame`), and runs it.



## Example: [Adventure game with a single, concrete factory](../../src/main/java/factory_method/adventure_single_factory). Factory, not Factory Method

This is a variant of the previous example. Technically, this implements the Factory DP, which differs from Factory Method that does not belong to GoF patterns.

This time, the factory method is written in the concrete [`Game`](../../src/main/java/factory_method/adventure_single_factory/Game.java) class whose factory method is, again, called `createRoom()`.

In this example, the factory method is able to produce any kind of room. The game type is represented by an enumerated type called [`GameType`](../../src/main/java/factory_method/adventure_single_factory/GameType.java). The value is given as a constructor parameter to the Game class.

The game type is stored in an instance variable in the game class. The factory method `createRoom()` uses the game type to determine the concrete type of the room to be created. Alternatively, the `createRoom()` method could be parameterized with the game type.

## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/factory-method

- SourceMaking: https://sourcemaking.com/design_patterns/factory_method

