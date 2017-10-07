package dog;

public class Cat implements Pet {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void beFriendly() {
        System.out.println(name
                + ": I'm friendly!");
    }
}
