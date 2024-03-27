# Assignment: Protected documents

**Goal:**

In this assignment you will create a protection proxy that controls access to documents in the document library. Some documents are protected and can be accessed only by certain users whereas others are unprotected and can be accessed by anyone.

A `Document` has a unique identifier as well as the creation date and the document content. The content is represented by a `String`. The identifiers and creation dates are always public, but the content can be protected.

Each protected document is stored behind a `DocumentProxy` object. It is possible to access a protected document's content only through the proxy object, and the proxy object calls the access control service to check if the user is allowed to access the content.

The list of available documents is stored in a `Library` object. It contains a `HashMap` of (document identifier, document) pairs. Allow storing both the real documents (that is, unprotected documents) as well as proxy objects (with protection) in the library. A common interface helps you here.

The proxy should have a method `getContent()` that returns the document content for an allowed user. For a protected document, the proxy uses the `AccessControlService` object to check if the user is allowed to access the document.

The proxy also has the `getCreationDate()` method that simply returns the creation date of the document without any access control checks.

The `AccessControlService` object has a method `isAllowed` that takes the document identifier and the username and returns `true` if the user is allowed to access the document, and `false` otherwise.

Create a `User` class with a `username` attribute. For simplicity, you can create users by simply calling a parameterized constructor that receives the username. (Note that in a real-world application, creating a user object would require thorough checks such as authentication.)

The user tries to access the document by calling the `getContent()` method of the document's proxy object. The reference to the user is passed as a parameter.

When the user tries to access a protected document, the proxy object checks (using the `AccessControlService` object) if the user is allowed to access the document.
- If the user is allowed to access the document, the proxy forwards the request to the `Document` object.
- If the user is not allowed to access the document, the proxy raises an `AccessDeniedException` exception. You can create your own exception class for this purpose (it's easy to do).

**Guidelines:**

Make sure that your protected `Document` objects (i.e. real documents) are not accessible directly. The only way to access the content of a protected document is through the proxy object.

The `DocumentProxy` and the `Document` classes should have a common interface, so that the proxy can be used in place of the real document.

The `AccessControlService` object should be a singleton, so that all proxy objects use the same access control service. Use a suitable data structure to store the (username, document id) pairs.

Pay attention to how the protected documents are created and stored in the library. For each protected document, you need to construct both the real document and the proxy object. It may be a good idea to define a factory method in the `Library` class for this purpose.

Once your classes are ready, add a `Main` class with a `main()` method that demonstrates the use of your system with various scenarios involving various users as well as protected and unprotected documents.

