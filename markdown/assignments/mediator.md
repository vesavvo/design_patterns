# Assignment: Chat App

**Goal:**

Your goal is to create a real-time chat application that utilizes the Mediator pattern to manage communication between components.

To keep things simple, you will use JavaFX for the GUI, and implement clients as windows on the same machine. The chat application should allow users to send messages to each other in real-time.

>In this assignment, we will focus on applying the Mediator design pattern. You may be accustomed to automatically using the MVC model for implementing graphical user interfaces. Now, be challenged to think differently. Our goal is to understand how the Mediator model can simplify the management of communication between components without resorting to MVC. This approach will help you expand your understanding of design patterns and equip you with the tools to choose the most appropriate model for each situation.

**Guidelines:**

There should be at least three clients, but you can have more if you want. Each client should have a unique username that is displayed in the title of the window.

Within the window, there should be:
- a text area that displays all messages sent and received by the user, together with the username of the sender/recipient. 
- a text field where the user can type a message to send to other users.
- a text field or other component that allows the user to select the recipient of the message.
- a button that sends the message to the selected recipient.

Design your application to match the Mediator pattern. The mediator should manage the communication between clients, and clients should not communicate directly with each other.

Structure your application to separate the user interface from the application logic. Each chat client object should be represented by a dedicated controller object that manages its interactions. These controller objects will communicate with a centralized mediator component to facilitate message exchange between clients, adhering to the Mediator pattern. This design will help maintain a clear separation of concerns and enhance the modularity of your application.

There should be no need to create multiple threads in this assignment, as there is no need for heavy processing that is running in the background.
