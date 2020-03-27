package cn.com.Array;

/**
 * @author lvxinran
 * @date 2020/3/27
 * @discribe 999. 车的可用捕获量
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 *
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 *
 * 返回车能够在一次移动中捕获到的卒的数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/available-captures-for-rook
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main_999_NumRookCaptures {
    public static void main(String[] args) {

    }
    public int numRookCaptures(char[][] board) {
        int count = 0 ;
        out:for(int i = 0 ; i < board.length;i++){
            for(int j = 0 ; j <board[i].length;j++){
                if(board[i][j]!='R'){
                    continue;
                }
                for(int k = i ; k<8;k++){
                    if(board[k][j]=='B'){
                        break;
                    }
                    if(board[k][j]=='p'){
                        count++;
                        break;
                    }
                }
                for(int k = j ; k<8;k++){
                    if(board[i][k]=='B'){
                        break;
                    }
                    if(board[i][k]=='p'){
                        count++;
                        break;
                    }
                }
                for(int k = i ; k>0;k--){
                    if(board[k][j]=='B'){
                        break;
                    }
                    if(board[k][j]=='p'){
                        count++;
                        break;
                    }
                }
                for(int k = j ; k>0;k--){
                    if(board[i][k]=='B'){
                        break;
                    }
                    if(board[i][k]=='p'){
                        count++;
                        break;
                    }
                }
                break out;
            }
        }
        return count;
    }
}
