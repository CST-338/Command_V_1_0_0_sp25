# COMMAND Lab

1. create an IStone interface with a method signature: ```void activate();```
1. create an abstract class Person
   1. for now it will be empty
   1. it is abstract because we don't want instances of Person.
1. Create a concrete implementation of IStone named: ```PowerStone```
   1. the implementation of ```activate``` will increase the power of the Person
   1. This will require ```Person``` to have a power field and a setter/getter for power
   1. <s>IStone will need to be updated so that the activate method takes a person parameter. </s>
   1. PowerStone will need to be updated so that the constructor takes a ```Person```
1. Create a concrete implementation of Person
   1. Give the concrete Person an way to hold an IStone
   1. Define a method to call IStone.activate()

## Part 2

1. Update PowerStone to use a singleton
   1. Remove Person from IStone constructor
      2. When a person ADDs the stone add the person to the stone at the same time.
   2. Include addOwner
   3. Include removeOwner
2. Add a toString to Person
3. Add a toString to IStone

1. Create a SpaceStone
   1. Add a location to Person
   1. SpaceStone changes location of the person
   1. Consider some form of inner class?
1. Add deactivate to IStone
   2. Implement in PowerStone
   3. Implement in Space Stone
4. Implement a new way to  

      
