# COMMAND Lab

1. create an IStone interface with a method signature: ```void activate();```
1. create an abstract class Person
   1. for now it will be empty
   1. it is abstract because we don't want instances of Person.
1. Create a concrete implementation of IStone named: ```PowerStone```
   1. the implementation of ```activate``` will increase the power of the Person
   1. This will require person to have a power field and a setter for power
   1. IStone will need to be updated so that the activate method takes a person parameter.
1. Create a concrete implementation of person
   1. Give the person an IStone field
   1. Define a method to call IStone.activate()
1. Update Powerstone to use a singleton
1. Create a SpaceStone
   1. Add a location to Person
   1. SpaceStone changes location of the person
   1. Consider some form of inner class
1. 
 ## Step n
   ### IStone
      
