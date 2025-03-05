# COMMAND Lab

## Part 1
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

## Part 2
1. Update Powerstone to use a singleton
   2. May incur other changes...
2. Update Person to have a toString
3. Add toString to IStone
   4. Implement in children
1. Create a SpaceStone
   1. Add a location to Person
   1. SpaceStone changes location of the person
   1. Consider some form of inner class
2. Add Deactivate to IStone
3. Make new Extension of Person
   4. Human?
 ## Step n
   ### IStone
      
