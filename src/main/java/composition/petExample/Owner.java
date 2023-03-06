package composition.petExample;

public class Owner {
    private String name;
    private String location;
// Composition - one class owning the other
    private Pet pet;

    public Owner(String name, String location, Pet pet) {
        this.name = name;
        this.location = location;
        this.pet = pet;
    }

    public String sayHello() {
        return "My name is " + this.name + ", my pet's name is " + this.pet.getName();
    }
    public String feedPet (){
        this.pet.setHungerLevel(pet.getHungerLevel() - 1);
        return  this.pet.getName() + " has been feed! His hunger level is " + this.pet.getHungerLevel();
    }
    public String walkPet () {
        this.pet.setHungerLevel(pet.getHungerLevel() + 1);
        return  this.pet.getName() + " has been on a walk! His hunger level is "+ this.pet.getHungerLevel();
    }

}
