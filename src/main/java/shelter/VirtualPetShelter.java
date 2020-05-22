package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getAllPets() { return pets.values();}

    public VirtualPet getVirtualPet(String petName) { return pets.get(petName); }

    public void addPet (VirtualPet petToAdd ) { pets.put(petToAdd.getPetName(), petToAdd); }

    public void removePet (String petName) { pets.remove(petName); }

    public void feedPets (int hunger) {
        return VirtualPet.getHunger
    }


}

// [ ] include appropriate instance variable(s) to store the pets who reside at the shelter
//- [ ] include methods that:
//	- [ ] return a `Collection` of all of the pets in the shelter
//	- [ ] return a specific `VirtualPet` given its name
//	- [ ] allow intake of a homeless pet (adding a pet to the shelter)
//	- [ ] allow adoption of a homeless pet (removing a pet from the shelter)
//	- [ ] feed all of the pets in the shelter
//	- [ ] water all of the pets in the shelter
//	- [ ] plays (or performs some other interaction(s)) with an individual pet in the shelter
//- [ ] include a `tick` method that calls the `tick` method for each of the pets in the shelter, updating their needs