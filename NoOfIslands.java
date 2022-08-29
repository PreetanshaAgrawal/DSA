public class NoOfIslands {
    static int noofIslands(char grid[][]){
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    helper(grid, i, j);
                }
            }
        }
        return count;
    }

    static void helper(char grid[][], int row, int col){
        if(row < 0 || col < 0|| row >= grid.length || col >= grid[row].length || grid[row][col] == '0') return;

        grid[row][col] = '0';

        helper(grid, row+1, col);
        helper(grid, row-1, col);
        helper(grid, row, col+1);
        helper(grid, row, col-1);

        return;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1','0','0','0'},
            {'1', '1','0','0','0'},
            {'0', '0','1','0','0'},
            {'0', '0','0','1','1'}
        };

        System.out.println(noofIslands(grid));
    }
}
