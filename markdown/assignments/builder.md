# Assignment: Computer Builder

**Goal:**

Develop a system to construct various types of computer configurations using the Builder design pattern. You are required to create a flexible system where different types of computers, like gaming computers and office computers, can be assembled with specific components.

![A round pizza](../img/builder_man.png)

_Image: DALL-E 3 from OpenAI_

**Guidelines:**

1. **Implement `Computer` class**: This class represents the final computer product and should include various components, such as:
    - Processor (String)
    - RAM size (in GB)
    - Hard drive (e.g., "512 GB SSD")
    - Graphics card (String)
    - Operating system (String)

2. **Define `ComputerBuilder` interface**: This interface should declare methods for setting each component of the `Computer`. Include methods like `buildProcessor`, `buildRAM`, `buildHardDrive`, `buildGraphicsCard`, and `buildOperatingSystem`.

3. **Create Concrete Builders**: Develop concrete builder classes like `GamingComputerBuilder` and `OfficeComputerBuilder` that implement the `ComputerBuilder` interface. Each builder should define components to assemble a specific type of computer.

4. **Implement `ComputerDirector`**: This class should take a `ComputerBuilder` instance and use it to assemble a computer. It might have a method like `constructComputer` that calls the builder's methods to assemble the computer.

5. **Demonstrate in Main class**: Create a main class that demonstrates building different types of computers using the director and different builders. Display the final configurations clearly.

**Additional Challenges:**

- Enhance customization options by allowing the selection of additional accessories or varying component grades.
- Implement a user interface where users can select their desired components and see the final configuration.
