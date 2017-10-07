package inner.local;

public class LocalInnerExample {
    private int data = 30;//instance variable

    private void display() {
        int value = 23;

        class LocalInnerClass {
            private void msg() {
                System.out.println(data);
                System.out.println(value);
            }
        }
        LocalInnerClass aClass = new LocalInnerClass();
        aClass.msg();
    }

    public static void main(String args[]) {
        LocalInnerExample obj = new LocalInnerExample();
        obj.display();
    }
}
