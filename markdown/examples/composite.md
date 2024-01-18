# Composite

> A structural pattern

## Example: [Boxes and items](../../src/main/java/composite/boxes)

The example is about boxes and items. A box can contain items and other boxes. The boxes can be nested. The items are the leaves of the composite structure. The boxes and items both extend from the abstract superclass [`Component`](../../src/main/java/composite/boxes/Component.java).  The boxes can be iterated to display their contents.

In the [`Box`](../../src/main/java/composite/boxes/Box.java) class, method `printData()` prints the data of the box and its contents. The method `printData()` is called recursively for the contents of the box.

The [`Item`](../../src/main/java/composite/boxes/Item.java) class is the leaf of the composite structure. It has only one meaningful method `printData()` that prints the data of the item. The other methods defined in the abstract class [`Component`](../../src/main/java/composite/boxes/Component.java) are not meaningful for the leaf.

## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/composite

- SourceMaking: https://sourcemaking.com/design_patterns/composite



