# Decorator

> An object structural pattern

## Example: [Orator](../../src/main/java/decorator/orator)

In the application, the [`BasicOrator`](../../src/main/java/decorator/orator/BasicOrator.java) class implements the [`Orator`](../../src/main/java/decorator/orator/Orator.java) interface.

The class implements the `say()` method which simply 
prints the message to the console.

However, the [`BasicOrator`](../../src/main/java/decorator/orator/BasicOrator.java) class can be decorated with up to three decorator classes:
- [`IntroDecorator`](../../src/main/java/decorator/orator/IntroDecorator.java) which adds an important announcement before the message
- [`CapitalDecorator`](../../src/main/java/decorator/orator/CapitalsDecorator.java) which capitalizes the message
- [`BackwardsDecorator`](../../src/main/java/decorator/orator/BackwardsDecorator.java) which reverses the message

The client can use any one - or even all three - of the decorators to decorate the `BasicOrator`.

First of all, the `Orator` interface defines the `say()` method which is implemented by the `BasicOrator` class.

The `OratorDecorator` abstract class implements the `Orator` interface and defines the `say()` method.
All three concrete decorator classes, `IntroDecorator`, `CapitalDecorator` and `BackwardsDecorator`, extend the `OratorDecorator` class.

Finally, the [`Main`](../../src/main/java/decorator/orator/Main.java) class demonstrates the use of the `Orator` interface and the three concrete decorator classes.


## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/decorator

- SourceMaking: https://sourcemaking.com/design_patterns/decorator






