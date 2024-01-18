# Assignment: Organization Structure

**Goal:**

The goal is to design an application that represents and keeps track of an organizational structure using the Composite design pattern.

These rules define the requirements for the organizational structure and your application:

1. The organization consists of departments and employees.
2. Departments can contain other departments and employees.
4. Departments and employees can be added to the organization at any time.
5. A department has a name.
6. An employee has a name and a salary.
5. Departments and employees can be added to and removed from the organization at any time with single method calls.
6. It must be possible to print the total salary of the organization to the console with a single method call.
7. The full organizational structure (including the departments and employees) can be printed to the console in XML format. The XML format should reflect the hierarchical structure of the organization.
8. There must be a `Main` class with a `main()` method that demonstrates the functionality of the application.


**Guidelines:**

1. Use the Composite design pattern to ensure that parts of the organizational structure (departments and employees) are handled uniformly.
2. Design the exact XML format yourself. For example, you can choose whether to use attributes or sub-elements to store the department and employee data items.
3. For basics of XML, see e.g. [XML Tutorial](https://www.w3schools.com/xml/default.asp) at W3Schools.


