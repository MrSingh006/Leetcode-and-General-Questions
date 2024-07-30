package ZZPractice;

public class GeneralTesting {
    public static void main(String[] args) {
        Double a = 10.0;
        Double b = 5.0;
        Double c = 0.00;
        System.out.println(a - c);
        Double d = Double.parseDouble(c.toString());

        if( d <= a-b)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
