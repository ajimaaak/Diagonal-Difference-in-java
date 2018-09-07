import java.io.*;
import java.util.*;
import java.math.*;
class DiagonalDifference
{
    static void diagonal_diff(int mat[][],int n)
    {
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<i+1;j++)
                sum1+=mat[i][j];
        }
        int j=n-1;
        for(int i=0;i<n;i++)
        {
          sum2+=mat[i][j];
           j--;
        }
              System.out.print(""+Math.abs(sum1-sum2));
    }
    public static void main(String arg[])
    {
        int n=0;
        Scanner inp=new Scanner(System.in);
        n=inp.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[i][j]=inp.nextInt();
        
        diagonal_diff(matrix,n);
    }
}