# Abstract Factory

> A creational pattern

## Example: Game pic generator

The example contains a JavaFX graphical user interface which displays a game pic of either a Pac-man style game or a Rabbit game.

|            Pacman             |            Rabbit             |
|:-----------------------------:|:-----------------------------:|
| ![Pacman](img/scr_pacman.png) | ![Rabbit](img/scr_rabbit.png) |



The GUI is implemented in the [`Gui`](src/gamepic/view/Gui.java) class. In the class, a factory object (which implements the [GuiPartFactory](src/gamepic/view/GuiPartFactory.java) interface) is created based on the chosen pic type. The implementing class is either a [`PacmanPicGuiFactory`](src/gamepic/view/PacmanPicGuiFactory.java) or a [`RabbitPicGuiFactory`](src/gamepic/view/RabbitPicGuiFactory.java). The factory object is then used to create the GUI components.

The factory classes are able to produce three types of GUI parts:
- the GraphicsContext object that is used to draw the GUI
- an object that implements the [`Character`](src/gamepic/view/Character.java) interface
- an object that implements the [`Food`](src/gamepic/view/Food.java) interface

These three components make a product family:

- A [`PacmanPicGuiPartFactory`](src/gamepic/view/PacmanPicGuiPartFactory.java) produces a [`PacmanCharacter`](src/gamepic/view/PacmanCharacter.java) and a [`PacmanFood`](src/gamepic/view/PacmanFood.java) object as well as a GraphicsContext object that has a big black background.
- A [`RabbitPicGuiPartFactory`](src/gamepic/view/RabbitPicGuiPartFactory.java) produces a [`RabbitCharacter`](src/gamepic/view/RabbitCharacter.java) and a [`RabbitFood`](src/gamepic/view/RabbitFood.java) object as well as a GraphicsContext object that has a smaller white background.

Note that in the classes that implement the [`Food`](src/gamepic/view/Food.java) interface, the food can be drawn in very different ways:
- [`PacmanFood`](src/gamepic/view/PacmanFood.java) is drawn as a yellow circle, and the food items are always arranged as a grid.
- [`RabbitFood`](src/gamepic/view/RabbitFood.java) is drawn as a carrot, and the food items are displayed in random positions.
