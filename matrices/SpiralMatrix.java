package matrices;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpiralMatrix sp =new SpiralMatrix();
        sp.spiralOrder(matrix);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int minRowLength=0;
        int maxRowLength=matrix.length-1;
        int minColumnLength = 0;
        int maxColumnLength=matrix[0].length-1;

        List<Integer> elementList =new ArrayList<Integer>();

        while(maxRowLength>=minRowLength && maxColumnLength>=minColumnLength)
        {
            for(int i=minColumnLength;i<=maxColumnLength;i++)
            {
                elementList.add(matrix[minRowLength][i]);
            }
            minRowLength++;

            for(int i=minRowLength;i<=maxRowLength;i++)
            {
                elementList.add(matrix[i][maxColumnLength]);
            }
            maxColumnLength--;


            if(minRowLength<=maxRowLength)
            {
                for(int i=maxColumnLength;i>=minColumnLength;i--)
                {
                    elementList.add(matrix[maxRowLength][i]);
                }
            }
            maxRowLength--;

            if(minColumnLength<=maxColumnLength)
            {
                for(int i=maxRowLength;i>=minRowLength;i--)
                {
                    elementList.add(matrix[i][minColumnLength]);
                }
            }
            minColumnLength++;
        }
        elementList.stream().forEach(System.out::println);
        return null;
    }
}
