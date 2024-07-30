package Java8Employee.string;

public class Test {
    public static void main(String[] args) {
        String s= "Paurav";
        String s1= "Paurav";
        String s2=new String("Paurav");
        boolean flag = false;
        if(s1==s2)
        {
            flag =true;
        }
        System.out.println(flag);
    }

}
