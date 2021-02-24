# Clean Architecture
Clean architecture is a design used to emphasize the structure and relation of your various code components to
promote the idea of Dependency Rule, such that "source code dependencies only point inwards". 
 
Clean architecture is able to promote this by defining that your software system consists of various layers, 
that can be organized in such a way that the layers point in one direction, and a dependency graph will not have
circular reference. The reason this is important is because it allows you to keep closely code related, and 
increase clarity of how components fit into your system.

![](https://raw.githubusercontent.com/rafacancian/java-clean-architecture/pictures/cleanarchitecture.png)

## Entities Layer 
> The layer that describes the universal behavior of a thing that can be used across all applications. 
>This can be as simple as a data structure, to a class with methods and behavior - as long as that behavior 
>is the same regardless of what application it is injected in.

## Use Cases Layer
> The layer that contains application specific business rules, where you can define how your application interacts
> with the entities layer. This defines business processes and workflows. 
> Depends on entities layer, but also defines various contracts that will be implemented by external layers.

## Interface Adapter Layer
> The layer which implements various interfaces define in the use case layer. 
> As we outer layers, we start to move towards more high level systems, utilizing frameworks to implement 
> a lot of the heavy lifting for our functionality, without tying us into a specific solution. 
> This is great that we separate out this into its own layer because in the event we change the structure of our data,
> it won't have a large affect on the structure of the application itself.

## Configuration Layer
> The layer that brings all of the code components together and exposes them for usage. 
> This is where you'll be asserting how the system should work from a technical point of view. 
> This would be the layer in which you would apply your dependency injection to wire up your code.

##Fonts
http://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html
https://jameslouiecs.blogspot.com/2018/11/uncle-bobs-clean-architecture.html