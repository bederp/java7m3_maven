package dog;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();

        pets.add(new Cat("Tiger") {
            @Override
            public void beFriendly() {
                System.out.println("I'm Tiger, not friendly!");
            }
        });

        pets.add(new Pet() {
            @Override
            public String getName() {
                return "Just a Pet";
            }

            @Override
            public void beFriendly() {
                System.out.println("Friendly as a Pet");
            }
        });

        pets.add(new SpecialRoboDog());

        pets.add(new RoboDog(){
            @Override
            public void beFriendly() {
                System.out.println("I'm more friendly than anyone else!");
            }
        });

        for (Pet pet : pets) {
            pet.beFriendly();

        }
    }

    static class SpecialRoboDog extends RoboDog {
        public void beFriendly() {
            System.out.println(getName()
                    + ": I'm very special for you!");
        }
    }
}



