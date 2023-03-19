package abstractClassExample.humans;

public class Teen extends Human{

    public String favouriteMusic;
    public Teen(String name, int age, String favouriteMusic) {
        super(name, age);
        this.favouriteMusic = favouriteMusic;
    }

    @Override
    public String move() {
        if (age == 16) return "Only" + favouriteMusic + "can make me move!";
        if (age == 17) return "I cant move!";
        return "Moving 50 meters.";
    }

    @Override
    public String gotoLocation(String location) {
        if (location.equals("kitchen")) return "I eat " + favouriteMusic + " for dinner!";
        if (location.equals("school")) return "I do not got to school!";
        return "Going to " + location;
    }
    @Override
    public void grow (int food, int water) throws Exception{
        if (food < 3 || water < 2 ){
            throw new Exception("I need more!");
        }
        
//This way we are also preserving the original behaviour of this method         
        super.grow(food, water);
    }
}
