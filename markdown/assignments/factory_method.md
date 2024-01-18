# Assignment: RPG Map Generator

**Goal:**

The goal is to design an application that generates a random map for a role-playing game using the Factory Method design pattern.

**Guidelines:**

Imagine you are designing a role-playing game (RPG) world where players can navigate a rectangular terrain map. The map comprises various terrain tiles whose types are
- swamp,
- water,
- road,
- forest, and
- building.

Your program should define both `Map` and `Tile` interfaces.

A `Map` can be either a `CityMap` or a `WildernessMap`. A `CityMap`
contains randomly selected tiles of the following types: road, forest, and building. A `WildernessMap` contains randomly selected tiles of the following types: swamp, water, and forest.

The `Map` interface should have the following methods:
- `createTile()` that creates a new tile of random type (honoring the chosen map type) and returns it. This is the factory method.
- `display()` that displays the map on the screen. Print the map as a matrix of characters (e.g. 'S' for swamp, 'W' for water, 'R' for road, 'F' for forest, 'B' for building). Note that the method should be completely agnostic of the concrete tile types.

The Tile interface should have the following methods:
- `getCharacter()` that returns the character that represents the tile type
- `getType` that returns the tile type as a string (e.g. "swamp", "water", "road", "forest", "building")

In addition, you should have a `Game` class that has a `main()` method. The `main()` method should create a `Map` object and display it on the screen. The `Game` class contains the factory method `createMap()` that creates either a `CityMap` or a `WildernessMap` object.

The following class diagram illustrates the idea:

```mermaid
classDiagram
    class Map {
        <<interface>>
        +createTile()
        +display()
    }
    class CityMap {
        +createTile()
        +display()
    }
    class WildernessMap {
        +createTile()
        +display()
    }
    class Tile {
        <<interface>>
        +getCharacter()
        +getDescription()
    }

    class Game {
        +main()
        +createMap()
    }
    
    class SwampTile {
        +getCharacter()
        +getDescription()
    }
    class WaterTile {
        +getCharacter()
        +getDescription()
    }
    class RoadTile {
        +getCharacter()
        +getDescription()
    }
    class ForestTile {
        +getCharacter()
        +getDescription()
    }
    class BuildingTile {
        +getCharacter()
        +getDescription()
    }
    
    Map <|.. CityMap
    Map <|.. WildernessMap
    
    Tile <|.. SwampTile
    Tile <|.. WaterTile
    Tile <|.. RoadTile
    Tile <|.. ForestTile
    Tile <|.. BuildingTile
    
    Game ..> Map
    Map ..> Tile
    
```


