# Decorator

> An object structural pattern

## Example: [Orator](../../src/main/java/decorator/orator)

In the application, the [`BasicOrator`](../../src/main/java/decorator/orator/BasicOrator)  class implements the `say()` method which simply 
prints the message to the console.

However, the `BasicOrator` class can be decorated with up to three decorator classes:
- `IntroDecorator` which adds an important announcement before the message
- `CapitalDecorator` which capitalizes the message
- `BackwardsDecorator` which reverses the message

The client can use any one - or even all three - of the decorators to decorate the `BasicOrator`.

First of all, the `Orator` interface defines the `say()` method which is implemented by the `BasicOrator` class.

The `OratorDecorator` abstract class implements the `Orator` interface and defines the `say()` method.
All three concrete decorator classes, `IntroDecorator`, `CapitalDecorator` and `BackwardsDecorator`, extend the `OratorDecorator` class.

Finally, the `Main` class demonstrates the use of the `Orator` interface and the three concrete decorator classes.


## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/singleton

- SourceMaking: https://sourcemaking.com/design_patterns/singleton






