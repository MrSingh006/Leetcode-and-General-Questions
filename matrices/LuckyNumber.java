package matrices;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
//        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        LuckyNumber lnum = new LuckyNumber();
        lnum.luckyNumbers(matrix);
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        int columnIndex =0;
        List<Integer> finalList = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (min >= matrix[i][j])
                {
                    min=matrix[i][j];
                    columnIndex = j;
                }
            }
            System.out.println("Minimum value = "+min);
            System.out.println("Column Index value = "+columnIndex);
            int max = matrix[i][columnIndex];
            for(int k = 0; k < matrix.length; k++)
            {
                if (max <= matrix[k][columnIndex])
                {
                    max=matrix[k][columnIndex];
                }
            }
            System.out.println("Maximum value = "+max);
            if(min==max)
            {
                finalList.add(min);
            }
        }
        System.out.println("Final List is");
        finalList.stream().forEach(System.out::println);
        return finalList;
    }
}
