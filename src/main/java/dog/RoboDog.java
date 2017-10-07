package dog;

public class RoboDog extends Robot implements Pet {
    RoboDog() {
        super("Noname Robodog");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void beFriendly() {
        System.out.println(name
                + ": I'm friendly!");
    }
}

