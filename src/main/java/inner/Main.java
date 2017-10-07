package inner;

import inner.privateinner.PrivateInnerClassExample;
import inner.publicinner.PublicInnerClassExample;
import inner.staticinner.StaticInnerClassExample;

import java.awt.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PrivateInnerClassExample priv = new PrivateInnerClassExample();
        priv.printEven();

        PublicInnerClassExample pub = new PublicInnerClassExample();
        Iterator<Integer> iterator = pub.new EvenIterator();

        iterator.forEachRemaining(Main::printBiggerThan5);

        StaticInnerClassExample staticInnerClassExample = new StaticInnerClassExample.Builder("someName")
                .year(1982)
                .color(Color.BLACK)
                .build();

        System.out.println(staticInnerClassExample);
    }

    private static void printBiggerThan5(Integer integer) {
        if (integer > 5) {
            System.out.println(integer);
        }
    }
}
