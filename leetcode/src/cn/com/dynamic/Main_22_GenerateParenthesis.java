package cn.com.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lvxinran
 * @date 2020/4/9
 * @discribe 22. 括号生成
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *  
 *
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main_22_GenerateParenthesis {
    public static void main(String[] args) {
        new Main_22_GenerateParenthesis().generateParenthesis(3);

    }
//    public List<String> generateParenthesis(int n) {
//
//
//        List<List<String>> dp = new LinkedList<>();
//        if (n == 0)
//            return dp.get(0);
//        List<String> list0 = new LinkedList<>();
//        list0.add("");
//        dp.add(list0);
//        List<String> list1 = new LinkedList<>();
//        list1.add("()");
//        dp.add(list1);
//        for(int i = 2;i< n+1;i++){
//            List<String> temp = new LinkedList<>();
//            for(int j = 0 ; j <i;j++){
//                List<String> p = dp.get(j);
//                List<String> q = dp.get(i-1-j);
//                for (String s : p) {
//                    for (String s1 : q) {
//                        StringBuilder builder = new StringBuilder();
//                        builder.append("(").append(s).append(")").append(s1);
//                        temp.add(builder.toString());
//                    }
//
//                }
//            }
//            dp.add(temp);
//        }
//        System.out.println();
//        return dp.get(n);
//    }


//    ---------------------------------------
//    public static List<String> generateParenthesis(int n) {
//        List<String> result = new ArrayList<>();
//        generate("", result, 0, n * 2);
//        return result;
//    }
//
//    public static void generate(String current, List<String> result, int cnt, int n) {
//        if (n == 0 && cnt ==0) {
//            result.add(current);
//        } else if (n <= 0) {
//            // do nothing
//        } else if (cnt >0) {
//            generate(current + "(", result, cnt + 1, n - 1);
//            generate(current + ")", result, cnt - 1, n - 1);
//        } else if (cnt == 0) {
//            generate(current + "(", result, 1, n -1);
//        }
//
//    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        if (n < 0) return list;
        dfs(0, n, n, new char[n << 1], list);
        return list;
    }

    private void dfs(int idx, int leftRemain, int rightRemain, char[] string, List<String> list) {
        if (idx == string.length) {
            list.add(new String(string));
            return;
        }

        // 枚举这一层所有可能的选择
        // 选择一种可能之后，进入下一层搜索

        // 什么情况可以选择左括号？左括号的数量 > 0
        // 选择左括号，然后进入下一层搜索
        if (leftRemain > 0) {
            string[idx] = '(';
            dfs(idx+1, leftRemain-1, rightRemain, string, list);
        }

        // 当左括号、右括号的数量一样时，只能选择左括号
        // 什么情况可以选择右括号？(右括号的数量 > 0) && (右括号的数量 != 左括号的数量)
        // 选择右括号，然后进入下一层搜索
        if (rightRemain > 0 && leftRemain != rightRemain) {
            string[idx] = ')';
            dfs(idx+1, leftRemain, rightRemain-1, string, list);
        }
    }


}
