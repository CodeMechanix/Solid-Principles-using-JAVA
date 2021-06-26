## Single Responsibility Principle
This principle states that each class should have one responsibility, one single purpose. This means that a class will do only one job, which leads us to conclude it should have only one reason to change.

We don’t want objects that know too much and have unrelated behavior. These classes are harder to maintain. For example, if we have a class that we change a lot, and for different reasons, then this class should be broken down into more classes, each handling a single concern. Surely, if an error occurs, it will be easier to find.

our classes will adhere to one functionality. Their methods and data will be concerned with one clear purpose. This means high cohesion, as well as robustness, which together reduce errors.


> Conclusion of SRP

A Class should have only one reason to change. A class should have only one job. 

1. Cohesion

The extent to which elements in a given class/module are related and relevant to one another.

2, Encapsulation

Attributes and behaviour relevant to a given object should be bundled together and hidden from outside access.


A given piece of responsibility should be bundled into a single class and hidden from other elements of the program.

3. Responsibility

If a piece of software have several kinds of users (aka, actors), then the disparate interests of each of those users defines a piece of that software's responsibilities.

Main: Each of those actors should be able to dictate changes in the software without affecting the actors. 

> How does it help us?

1. Testing: A class with one responsibility will have far fewer test cases.
2. Lower Coupling: Less functionality in a single class will have fewer dependencies.
3. Organization: Smaller, well-organized classes are easier to search thant monolithic ones. 


Reference:
1. Tech Tong
2. Baeldung