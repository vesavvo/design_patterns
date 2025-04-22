# Assignment: Improved history functionality

**Goal:**

In the [Memento code example](../examples/memento.md), there is a graphical user interface that contains three colored rectangles and one checkbox. The user can change the colors as well as the status of the checkbox, and the state of the model is updated accordingly. The application uses the Memento pattern to save and restore the state of the model. The undo functionality is triggered by the user pressing the `Ctrl+Z` key combination.

In this assignment, you add two features to the application:

1. Redo functionality: The user can press the `Ctrl+Y` key combination to redo the last undone action.
2. History window: The application opens a new window that displays the history of the model's state changes. The history window contains a list of the states of the model, and the user can select a state from the list to restore the model to that state.

If you complete both tasks, you will get one point. If you complete only one task, you will get half a point. As you submit your solution, please mark clearly which tasks you have completed in the answer box in Oma.

**Guidelines:**

- For the redo functionality, in addition to the undo list (i.e. the list of saved mementos), you can use a separate redo list to store the undone states recently removed from the undo list.
    - When the user hits Ctrl-Z, the current state is added to the redo list. Then, a state is removed from the undo list and restored in the application.
    - When the user hits Ctrl-Y, the current state is added to the undo list. Then, a state is removed from the redo list and restored in the application.
    - The redo list should be cleared when the user makes a new change to the model.
- For the history window, you can make a new Stage that contains a ListView. Inside the ListView, show relevant metadata about the states, such as the time the state was saved. When the user selects a state from the list by clicking it, the model should be restored to that state.
   - Add relevant method declarations to the metadata interface that the memento class implements.
- Should you want to refactor the existing code, you can do so. However, the existing functionality should remain unchanged.
