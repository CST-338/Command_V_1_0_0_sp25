# COMMAND Lab

1. create an IStone interface with a method signature: ```void activate();```
2. create an abstract class Person
   1. for now it will be empty
   1. it is abstract because we don't want instances of Person.
3. Create a concrete implementation of IStone named: ```PowerStone```
   4. the implementation of ```activate``` will increase the power of the Person
   5. This will require person to have a power field and a setter for power
   6. IStone will need to be updated so that the activate method takes a person parameter.
1. Create a concrete implementation of person
   2. Give the person an IStone field
   3. Define a method to call IStone.activate()
4. Update Powerstone to use a singleton
5. Create a SpaceStone
   6. Add a location to Person
   7. SpaceStone changes location of the person
   8. Consider some form of inner class
9. 
 ## Step n
   ### IStone
      
