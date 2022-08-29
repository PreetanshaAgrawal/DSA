import java.util.Arrays;

public class MaxSumRectangleLargerThanK {
    public static int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int sum[] = new int[m];
        int max_Sum = Integer.MIN_VALUE;

        for (int cS = 0; cS < n; cS++) {
            Arrays.fill(sum, 0);
            for (int cE = cS; cE < n; cE++) {
                for (int row = 0; row < m; row++) {
                    sum[row] += matrix[row][cE];
                }

                int currSum = Helper(sum, k);
                if (currSum <= k)
                    max_Sum = Math.max(max_Sum, currSum);
            }
        }
        return max_Sum;
    }

    static int Helper(int sum[], int k) {
        
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<sum.length;i++)
        {
            int s=0;
            for(int j=i;j<sum.length;j++)
            {
                s+=sum[j];
                if(s<=k)
                ans=Math.max(ans,s);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // int matrix[][] = {
        // {1,0,1},
        // {0,-2,3}
        // };
        int matrix[][] = { { 5, -4, -3, 4 }, { -3, -4, 4, 5 }, { 5, 1, 5, -4 } };

        System.out.println(maxSumSubmatrix(matrix, 8));
    }
}
