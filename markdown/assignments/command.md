# Assignment: Pixel Art Editor

**Goal:**

Your goal is to create a simple pixel art editor that allows users to create pixel graphics, such as an 8x8 pixel stick figure, reminiscent of 1980s home computers. The editor will use JavaFX for the GUI and the Command design pattern to handle pixel manipulation like cursor movement and pixel toggling.

This assignment focuses on applying the Command design pattern.

**Guidelines:**

The editor should feature an 8x8 grid where each cell represents a pixel that can be toggled on and off. Implement the following features:

- **Cursor Movement**: Implement separate commands for moving the cursor up, down, left, and right within the grid using keyboard arrows.

- **Toggle Pixels**: Press a key (such as space) to toggle the pixel at the cursor's location on and off.
    
- **Create Code Feature**: Implement a button that generates and displays Java code representing the current state of the 8x8 grid as an array. This code can be used directly in other Java programs.

**Commands to Implement**:

Each movement and toggle should be implemented as a command:

- `MoveCursorUpCommand` to move the cursor up.
- `MoveCursorDownCommand` to move the cursor down.
- `MoveCursorLeftCommand` to move the cursor left.
- `MoveCursorRightCommand` to move the cursor right.
- `TogglePixelCommand` to toggle the pixel at the cursor's location.
- `GenerateCodeCommand` to create Java code based on the current grid state.

**GUI Layout**:
- Display a grid representing the pixel art.
- Show a cursor on the grid that moves according to user input.
- Indicate the active state of pixels (e.g., colored squares for 'on', blank for 'off').
- Include a button that, when clicked, prints the Java code for the current pixel art to the console.

**Example Code Output**:

When the "Create Code" button is clicked after designing a simple stick figure, the pixel art editor should generate and display the following Java code in the console. This code represents the stick figure as a 2D integer array where '1' indicates a pixel that is turned on, and '0' represents a pixel that is turned off. The user of the editor can then copy and paste the code into their Java program that needs to display the same pixel art.

```java
int[][] pixelArt = {
    {0, 0, 1, 1, 1, 1, 0, 0},
    {0, 0, 1, 1, 1, 1, 0, 0},
    {0, 0, 0, 1, 1, 0, 0, 0},
    {0, 1, 1, 1, 1, 1, 1, 0},
    {0, 0, 0, 1, 1, 0, 0, 0},
    {0, 0, 1, 0, 0, 1, 0, 0},
    {0, 1, 0, 0, 0, 0, 1, 0},
    {1, 0, 0, 0, 0, 1, 0, 1}
};
