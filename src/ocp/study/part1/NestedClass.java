package java_8_exam.topic1_1_inner_classes;
/*
 1.1 Describe and develop code that uses Java inner classes, including nested class, static class, local class, and anonymous classes
 */
/*
 A nested class is a class that is defined within another class. A nested class that is not
static is called an inner class. There are four of types of nested classes:
	> NESTED CLASS: A member inner class is a class defined at the same level as instance variables. It is not
	static. Often, this is just referred to as an inner class without explicitly saying the type.
	> LOCAL CLASS: A local inner class is defined within a method.
	> ANONYMOUS CLASS: An anonymous inner class is a special case of a local inner class that does not have a
	name.
	> STATIC CLASS: A static nested class is a static class that is defined at the same level as static
	variables.
 */

// Nested class / Member inner class
class NestedClass {
    private String greeting = "Hi";

    protected class Inner {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        NestedClass.Inner inner = new NestedClass().new Inner(); // one line
        NestedClass outer = new NestedClass();
//		outer.new Inner();
        outer.callInner();
    }
}

// Local inner class
class LocalInnerClass {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        LocalInnerClass outer1 = new LocalInnerClass();
        outer1.calculate();
    }
}

// Anon inner class
class AnonymousInnerClass {

    public static void main(String[] args) {
        AnonymousInnerClass anon = new AnonymousInnerClass();
        System.out.println(anon.admission(100));
    }

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}

// Static nested class
class StaticNestedClass {
    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}