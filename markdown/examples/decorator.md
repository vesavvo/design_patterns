# Decorator

> An object structural pattern

## Example: [Orator](../../src/main/java/decorator/orator)

In the application, the [`BasicOrator`](../../src/main/java/decorator/orator/BasicOrator.java) class implements the [`Orator`](../../src/main/java/decorator/orator/Orator.java) interface.

The class implements the `say()` method which simply 
prints the message to the console.

However, the [`BasicOrator`](../../src/main/java/decorator/orator/BasicOrator.java) class can be decorated with up to four decorator classes:
- [`IntroducingDecorator`](../../src/main/java/decorator/orator/IntroducingDecorator.java) which adds an important announcement *before* the message
- [`CapitalizingDecorator`](../../src/main/java/decorator/orator/CapitalizingDecorator.java) which capitalizes the message
- [`ReversingDecorator`](../../src/main/java/decorator/orator/ReversingDecorator.java) which reverses the message
- [`ConcludingDecorator`](../../src/main/java/decorator/orator/ConcludingDecorator.java) which adds a concluding remark *after* the message.

The client can use any one - or even all four - of the decorators to decorate the `BasicOrator` object.

First of all, the `Orator` interface defines the `say()` method which is implemented by the `BasicOrator` class.

The `OratorDecorator` abstract class implements the `Orator` interface and defines the `say()` method.
All three concrete decorator classes, `IntroducingDecorator`, `CapitalizingDecorator` and `ReversingDecorator`, extend the `OratorDecorator` class.

Finally, the [`Main`](../../src/main/java/decorator/orator/Main.java) class demonstrates the use of the `Orator` interface and the three concrete decorator classes.


## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/decorator

- SourceMaking: https://sourcemaking.com/design_patterns/decorator






