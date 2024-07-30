package Pattern;

public class MirrorRightTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) //outer loop for number of rows(n)
        {
            for (int j = 5 - i; j > 0; j--) // inner loop for spaces
            {
                System.out.print(" "); // printing space
            }
            for (int j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("*"); // print star
            }
            System.out.println(); // ending line after each row
        }

//                                       OR

//        for(int i=0;i<5;i++)
//        {
//            for(int j=4;j>i;j--)
//            {
//                System.out.print(" ");
//            }
//            for(int k=0;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

}
