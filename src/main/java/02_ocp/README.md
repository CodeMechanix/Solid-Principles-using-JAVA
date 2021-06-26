## Open/Closed Principle in Java

This principle states that software entities should be open for extension, but closed for modification. As a result, when the business requirements change then the entity can be extended, but not modified.

“Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.”

The general idea of this principle is great. It tells you to write your code so that you will be able to add new functionality without changing the existing code.

That’s why Robert C. Martin and others redefined the Open/Closed Principle to the Polymorphic Open/Closed Principle. It uses interfaces instead of superclasses to allow different implementations which you can easily substitute without changing the code that uses them. The interfaces are closed for modifications, and you can provide new implementations to extend the functionality of your software.

The main benefit of this approach is that an interface introduces an additional level of abstraction which enables loose coupling. The implementations of an interface are independent of each other and don’t need to share any code. If you consider it beneficial that two implementations of an interface share some code, you can either use inheritance or composition.

> Conclusion : The Open Closed Principle: Software entities should be open to extension but closed to modification.

- Open for extension and close for modification.
- Add new functionality without changing existing code. 
