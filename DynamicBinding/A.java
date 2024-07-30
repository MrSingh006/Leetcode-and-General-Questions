package DynamicBinding;

public abstract class A {
    public void method1() {
        System.out.println("This is method 1 of class A");
    }

    public void method2() {
        System.out.println("This is method 2 of class A");
    }

    public abstract void method3();

    public final void method4() {
        System.out.println("This is final method 4 of class A");
    }

    public static void method5() {
        System.out.println("This is static method 5 of class A");
    }
    private void method6() {
        System.out.println("This is private method 6 of class A");
    }

    private void privateMethodOfClassA() {
        System.out.println("This is private method of class A");
    }

    public static void staticMethodOfClassA() {
        System.out.println("This is static method of class A");
    }

}

