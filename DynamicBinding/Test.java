package DynamicBinding;

public class Test {
    public static void main(String[] args) {
         B b = new B();
         b.method1();
         b.method2();
         b.method3();
         b.method4();
         B.method5();

//         This method cannot be called due to problem of ambiguity
//         b.method6();

//        Cannot access this method as it is private
//        b.privateMethodOfClassB();

         B.staticMethodOfClassB();

//         Cannot access this method as it is private
//         b.privateMethodOfClassA();

         B.staticMethodOfClassA();

        System.out.println("\n");

        A a = new B();
        a.method1();
        a.method2();
        a.method3();
        a.method4();
        A.method5();
//        a.method6();
    }
}
