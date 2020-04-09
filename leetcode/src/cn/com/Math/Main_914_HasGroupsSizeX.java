package cn.com.Math;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author lvxinran
 * @date 2020/3/27
 * @discribe 914. 卡牌分组
 * 给定一副牌，每张牌上都写着一个整数。
 *
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 *
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main_914_HasGroupsSizeX {
    public static void main(String[] args) {

    }

    /**
     * 求解最大公因数
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for(int i :deck)
            count[i]++;
        int mapper = -1;
        for(int i = 0 ; i <10000;i++){
            if(count[i]==1){
                return false;
            }
            if(count[i]==0){
                continue;
            }
            if(mapper==-1){
                mapper = count[i];
            }else{
                mapper =gcd(mapper,count[i]);
            }

        }
        return mapper>=2;
    }
    int gcd(int a, int b){
        return b==0?a :gcd(b,a%b);
    }
}
