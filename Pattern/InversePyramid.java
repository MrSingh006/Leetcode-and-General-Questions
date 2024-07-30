package Pattern;

public class InversePyramid {
    public static void main(String[] args) {
        int n=5;
        printInversePyramid(n);
    }

    private static void printInversePyramid(int n) {
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
