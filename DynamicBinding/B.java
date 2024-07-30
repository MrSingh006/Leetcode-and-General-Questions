package DynamicBinding;

public class B extends A {

    public void method1() {
        System.out.println("This is method 1 of class B");
    }

//    Either make class B abstract or give implementation to method3
    @Override
    public void method3() {
        System.out.println("This is implementation of abstract method3");
    }

/*
    Final method cannot be override C.T.
    public final void method4() {
        System.out.println("This is method 4 of class A");
    }
*/

    public static void method5() {
        System.out.println("This is static method 5 of class B");
    }

    private void method6()
    {
        System.out.println("Only class B method 6");
    }

    private void privateMethodOfClassB() {
        System.out.println("This is private method of class B");
    }

    public static void staticMethodOfClassB() {
        System.out.println("This is static method of class B");
    }

}
