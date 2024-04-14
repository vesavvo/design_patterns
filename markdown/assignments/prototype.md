# Assignment: Book Recommendations System

**Goal:**

Your task is to create a book recommendation system that employs the Prototype design pattern. This system will manage a collection of book recommendations targeted at different reader groups. Each recommendation will include a set of books that could appeal to a particular audience. The idea is to allow new recommendation lists to be created either from scratch or by cloning and modifying an existing list that is a close fit.

**Structure:**

- **Book Class (Book):**
    - Attributes: `author` and `title`, and consider additional attributes such as `genre` or `publicationYear`.
    - Methods: Define a method for cloning the `Book` object.

- **Recommendation Class (Recommendation):**
    - Attributes: `targetAudience` as a String and a list of `Book` objects.
    - Methods: Implement a clone method in line with the Prototype pattern to allow deep cloning of the recommendation list.

**Guidelines:**

Design the `Book` and `Recommendation` classes to follow the Prototype pattern principles. You are to provide the structure for these classes, but you will need to decide how to implement cloning in a way that suits the requirements of the system. Consider the following:

- Ensure that the `clone()` method of the `Recommendation` class produces a deep copy of the list of books, not just a shallow copy of the list reference.
- Decide how cloned `Recommendation` objects can be modified after creation. What methods will you provide to add or remove books, or to change the target audience?

Once you've designed and implemented the classes, create a user interface — either command-line or graphical — that allows users to interact with your system. They should be able to view existing recommendations, clone and modify them, and save new lists.

