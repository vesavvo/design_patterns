# Assignment: File System Handling

**Goal:**

Your goal is to design and implement a simple file system model in Java using the Visitor design pattern. The file system should include files and directories. In the assignment, you'll implement two visitors that perform distinct operations on the file system structure.

**Guidelines:**

- Define a `FileSystemElement` interface that acts as a base for both files and directories.
- Implement a `File` class that represents a file with attributes like name and size (in megabytes).
- Implement a `Directory` class that represents a folder and can contain multiple files and directories.
- Create a `FileSystemVisitor` interface with visit methods for files and directories.
- Implement two concrete visitors:
    - `SizeCalculatorVisitor` should traverse the file system and calculate the total size of all files.
    - `SearchVisitor` should traverse the file system and accumulate files that match a specified criterion (e.g., file extension, name pattern).
- Both visitors should demonstrate how they can accumulate state as they traverse the file system elements.

**Example Usage:**

Provide an example usage scenario where a directory structure is created with some files, and both visitors are applied to demonstrate their functionality. 
