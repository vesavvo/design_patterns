# Assignment: Customer Feedback Handler

**Goal:**

Create a program that handles different forms of customer feedback messages. Customer feedback can include compensation claims, contact requests, development suggestions, and general feedback. Each type of feedback requires different handling and response.

**Guidelines:**


The program should include the following components:

1. **Message Class**: Create a message class that represents a customer feedback message. The message class should include the following attributes: message type, message content, and sender email. Create an enumerated type (`enum`) for the message type to represent different forms of feedback.

2. **Handler Classes**: Create different handler classes for handling different forms of customer feedback. Each handler class is responsible for handling one form of feedback. Chain the handler classes together using the Chain of Responsibility pattern. This allows the feedback to be automatically routed to the correct handler. Each handler should define how it handles a particular type of feedback. For example, compensation claims can be reviewed and approved or rejected, contact requests can be forwarded to the appropriate department, development suggestions can be logged and prioritized, and general feedback can be analyzed and responded to.

3. **Main Program**: Create a main program that generates various types of customer feedback in different forms, sends them to the handler chain, and prints the result of each feedback handling.

