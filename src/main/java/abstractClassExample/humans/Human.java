package abstractClassExample.humans;
// Abstract class - some things are ready and used, some not
public abstract class Human {
    private String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void grow (int food, int water) throws Exception{
        this.age++;
    }
// We do not know how this method works, so it is abstract
// Same as overriding methods in each class, but it is safer
    public abstract String move();
    public abstract String gotoLocation(String location);

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
