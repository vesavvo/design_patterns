# Adapter

> A structural pattern

## Example: [Pizza unit price calculator](../../src/main/java/adapter/pizza)

In the [`calculator`](/src/main/java/adapter/pizza/calculator) package, there is a [`PizzaCalculator`](../../src/main/java/adapter/pizza/calculator/PizzaCalculator.java) class that computes the unit prize of a round pizza, given its diameter and price. This class represents code that is already in use and cannot be changed.

![A round pizza](../img/round_pizza.png)

The existing [`PizzaCalculator`](../../src/main/java/adapter/pizza/calculator/PizzaCalculator.java) class has been serving its purpose well as long as all pizzas are round. It provides a nice tool for checking which pizza provides the best bang for the buck.

However, there is a new need: some of the pizzas are rectangular, called sheet pizzas. The unit price of a sheet pizza is calculated differently, and the existing [`PizzaCalculator`](../../src/main/java/adapter/pizza/calculator/PizzaCalculator.java) class seems to be of no use for this purpose.

![A sheet pizza](../img/sheet_pizza.png)

Luckily, an adapter enables us to use the existing solution. The adapter class, [`SheetPizzaAdapter`](../../src/main/java/adapter/pizza/object_adapter_example/SheetPizzaAdapter.java) uses the existing [`PizzaCalculator`](../../src/main/java/adapter/pizza/calculator/PizzaCalculator.java) class to calculate the unit price of a sheet pizza. The [`SheetPizzaCalculator`](../../src/main/java/adapter/pizza/object_adapter_example/SheetPizzaCalculator.java) interface declares the method visible to the client code.

The adapter converts the side lengths of the sheet pizza into a diameter of a round pizza with similar area. This requires a little math.

Two variants of the Adapter pattern has been applied, each in its own package:
- [Object adapter](../../src/main/java/adapter/pizza/object_adapter_example)
- [Class adapter](../../src/main/java/adapter/pizza/class_adapter_example)

The links in the description above point to the object adapter variant.

In the class adapter variant, the adapter class is made a subclass of the existing [`PizzaCalculator`](../../src/main/java/adapter/pizza/calculator/PizzaCalculator.java) class.

> Since Java does not support multiple inheritance, the textbook implementation of the class adapter variant where the adapter extends both the client interface and the adaptee class is not possible in Java.

## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/adapter

- SourceMaking: https://sourcemaking.com/design_patterns/adapter





