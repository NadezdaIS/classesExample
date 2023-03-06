package abstractClassExample.humans;

public class Baby extends Human{
    public Baby(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Crawling away!";
    }

    @Override
    public String gotoLocation(String location) {
        if (location.equals("school")) return "Baby does not want to got to " + location;
        return "Baby going to " + location;
    }
}
