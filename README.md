# Virtual Pet Shelter

Welcome to Derek's Virtual Pet Shelter! This is a basic application that demonstrates knowledge of Java and its uses.
Some of concepts used in this application include classes, methods, instance variables, while and for loops, and maps.
Overall, this is a simple application. The user interface is minimal, and the game assumes the user will play nice.

You cannot win at this game. You can only lose! The goal is to maintain all the pets in the shelter. 
You must monitor their attributes: hunger, thirst, happiness.
Hunger and thirst must stay below 20, while happiness must not hit 0. You must maintain a balance.

This application is made up of three classes. 
The VirtualPet class sets up the basics of the game. This class defines the variables of the pets, the getter methods, 
and other methods that change attributes of a pet.
The VirtualPetShelter class holds the more complex methods of the package. This class holds all of the methods
that will be called on from the Application. This is also where the map is housed. 
The VirtualPetShelterApp class is where the main method lives. The main method calls upon other methods to activate them.
One of the other important methods within this class is the GameLoop method. This keeps the game going!

This game also incorporates a Tick method. This method simulates the change of attributes as time passes. 
After each turn, the Tick method is called upon, and the attributes of each pet is adjusted accordingly.
