# Assignment: Flyweight rendering for RPG

**Goal:**

In the earlier [Factory Method assignment](factory_method.md), you designed an application that generates a random map for a role-playing game. In this assignment, you will extend the RPG map generator by adding graphical rendering of the tiles on the JavaFX canvas, while using the Flyweight design pattern to optimize memory usage.

Now, making a map becomes a two-phased project. First, generate the Map of Tiles as before applying the Factory Method pattern. Second, render the map graphically using JavaFX, with the Flyweight pattern optimizing the rendering process.

If your application's design so requires, feel free to modify the existing map generation code to better align with the Flyweight pattern. The primary focus should be on the rendering process, where shared tile graphics are efficiently utilized to display the map.

**Guidelines:**

Proceed in the following steps:

1. **Analysis**: Review the existing implementation of the map and tile classes from your previous RPG map generator project. Identify opportunities to apply the Flyweight pattern, focusing on how terrain tiles are generated and stored.

2. **Refactoring**: If necessary, adjust the existing `Map` and `Tile` classes to separate the intrinsic (shareable) and extrinsic (individual) states. The intrinsic state should be shareable among tiles, while the extrinsic state should be specific to individual tile instances.

3. **TileGraphicFactory Implementation**: Implement a `TileGraphicFactory` class that focuses on managing the instantiation and sharing of graphics for tile rendering. This factory should ensure that each unique graphic for a tile type is only created once and reused across all tiles of that type. This approach emphasizes that `TileGraphicFactory` is dedicated to optimizing graphical representation for rendering, distinct from the `Tile` object creation handled by your Factory Method implementation.

4. **Rendering with JavaFX**: Develop a method to render the map on a JavaFX canvas, using the shared tile graphics. Ensure that the rendering process accurately represents the map's layout and tile positions.

5. **JavaFX Application**: Modify the `Game` class to launch a JavaFX application where the map is displayed graphically, utilizing your Flyweight-implemented rendering method.

6. **Graphics for Tiles**: For the tile graphics, you may create your own simple images or use freely available images that permit such use (respecting their licensing terms). Each tile type should have a unique visual representation.

>For external graphics, sources like [OpenGameArt](https://opengameart.org/) provide assets suitable for educational purposes under appropriate licenses. If creating your own graphics, simple shapes or designs are adequate. The key is to demonstrate the Flyweight pattern's effectiveness, not the graphics' artistic quality.

By completing this assignment, you will have a JavaFX application that renders the RPG map efficiently, employing the Flyweight pattern to share tile graphics. The refactored code should demonstrate a clear separation of intrinsic and extrinsic states in the context of terrain tiles, as well as optimize memory usage during the rendering process.
