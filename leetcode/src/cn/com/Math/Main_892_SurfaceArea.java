package cn.com.Math;

/**
 * @author lvxinran
 * @date 2020/3/26
 * @discribe 892. 三维形体的表面积
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 *
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 *
 * 请你返回最终形体的表面积。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surface-area-of-3d-shapes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main_892_SurfaceArea {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(grid[0][0]);
        System.out.println(new Main_892_SurfaceArea().surfaceArea(grid));
    }
    public int surfaceArea(int[][] grid) {
        int amountArea = 0;
        if(grid.length<1){
            return 0;
        }
        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0 ; j < grid[i].length;j++){
                if(grid[i][j]==0){
                    continue;
                }
                amountArea+=(grid[i][j]<<2)+2;
                if(i-1>=0){
                    amountArea-=2*(grid[i][j]<grid[i-1][j]?grid[i][j]:grid[i-1][j]);
                }
                if(j-1>=0){
                    amountArea-=2*(grid[i][j]<grid[i][j-1]?grid[i][j]:grid[i][j-1]);
                }
            }
        }
        return amountArea;
    }
}
