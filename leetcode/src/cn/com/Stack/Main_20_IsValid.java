package cn.com.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author lvxinran
 * @date 2020/1/17
 * @discribe 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
public class Main_20_IsValid {
//    public boolean isValid(String s) {
//        if(s.isEmpty()){
//            return true;
//        }
//        Map<Character,Character> charMap = new HashMap<>();
//        charMap.put('(',')');
//        charMap.put('[',']');
//        charMap.put('{','}');
//        Stack<Character> chaStack = new Stack<>();
//        for(char ch:s.toCharArray()){
//            if(chaStack.empty()){
//                chaStack.push(ch);
//                continue;
//            }
//            if(charMap.get(chaStack.peek())!=null&&charMap.get(chaStack.peek())==ch){
//                chaStack.pop();
//            }else{
//                chaStack.push(ch);
//            }
//        }
//        return chaStack.empty();
//    }
    public boolean isValid(String s) {
        char[] t = s.toCharArray();
        char[] a = new char[t.length/2];
        int index = 0;
        for(char c:t) {
            switch(c) {
                case '(':
                case '[':
                case '{':
                    if(index<a.length) {
                        a[index++]=c;
                    }else {
                        return false;
                    }
                    break;
                case ']':
                case '}':
                    c--;
                case ')':
                    c--;
                    if(index<=0 || a[--index]!=c) {
                        return false;
                    }
                    break;
            }
        }
        return index==0;
    }

    public static void main(String[] args) {
        System.out.println(new Main_20_IsValid().isValid("{}"));
    }
}
