package cn.com.Array;

/**
 * @author lvxinran
 * @date 2020/4/7
 * @discribe 面试题 01.07. 旋转矩阵
 *  给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 *
 * 不占用额外内存空间能否做到？
 *
 *  
 *
 * 示例 1:
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-matrix-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main_0107_Rotate {
    public static void main(String[] args) {
        int[][] array = new int[][]{ { 1,2,3,4,5},{ 6, 7, 8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] array1 = new int[][]{ { 1,2,3,4},{ 6, 7, 8,9},{11,12,13,14},{16,17,18,19}};

        new Main_0107_Rotate().rotate(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0 ; j <array1[i].length;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rotate(int[][] matrix) {
        int max = matrix.length-1;
        for(int i = 0;i<matrix.length/2;i++){
            for(int j = i ; j < max-i;j++){
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[max-j][i];
                matrix[max-j][i] =  matrix[max-i][max-j];
                matrix[max-i][max-j]= matrix[j][max-i];
                matrix[j][max-i] = temp;
            }
        }
    }
}
