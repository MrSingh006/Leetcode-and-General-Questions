package GeneralQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 71;
        isPrime(num);
    }

    private static void isPrime(int num) {
        boolean flag = false;
        for(int i =2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                flag = true;
            }
        }
        if(flag)
        {
            System.out.println("number is not prime");
        } else if (num==2) {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is prime");
        }

    }
}
