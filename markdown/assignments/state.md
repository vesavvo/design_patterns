# Assignment: Game Character Development System

**Goal:**

Your goal is to design and implement a console-based Java application that simulates the development of a game character through different levels of proficiency. Use the State design pattern to implement this system.

**Guidelines:**

- The game character has the following attributes: name, level, experience points, and health points.
- The game character has the following levels (represented as states of the State DP): novice, intermediate, expert, and master.
- The game character has the following actions: train, meditate, and fight.

The game levels are as follows:

- **Novice level:** The game character can do nothing but train when at the novice level. Training increases the character's experience points. A certain amount of experience points is required to advance to the next level.
- **Intermediate level:** In addition to training, the game character can meditate when at the intermediate level. Meditating increases the character's health points. A certain amount of experience points is required to advance to the next level.
- **Expert level:** In addition to training and meditating, the game character can fight when in the expert level. Fighting decreases the character's health points but increases the experience points. A certain amount of experience points is required to advance to the next level.
- **Master level:** The game ends when the game character reaches the master level.

Before each turn, the game should display the character's current status (including the level) as well as the available actions.

This just specifies the skeleton of the program. You are free to add more features to make the game more interesting by adding features.