package GeneralQuestions;

public class SwapTwoNum {
    public static void main(String[] args)
    {
        int a= 40;
        int b= 200;
        swapNum(a,b);
    }

    private static void swapNum(int a, int b) {
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Reverse numbers are : a="+a+" b="+b);
    }
}
