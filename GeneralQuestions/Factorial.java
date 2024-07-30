package GeneralQuestions;

public class Factorial {
    public static void main(String[] args) {
        int num =10;
        getFactorial(num);
    }

    private static void getFactorial(int num) {
        int fact =1;
        for(int i =num;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
