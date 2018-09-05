package ocp.study.part1;

/*
 1.3 Describe a lambda expression; 
 refactor the code that uses an anonymous inner class to use a lambda expression; below.
 describe type inference (https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html)
 and target typing (https://stackoverflow.com/questions/33196325/java-8-target-typing)
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        // old school anon imp class
        carryOutWork(new FunctionalInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in SimpleFun impl...");
            }
        });

        // new lambda anon imp class
        carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));

    }

    public static void carryOutWork(FunctionalInterface sfi) {
        sfi.doWork();
    }

}

class RunnableTest {
    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        r1.run();
        r2.run();

    }
}