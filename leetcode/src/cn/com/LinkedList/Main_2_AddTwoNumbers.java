package cn.com.LinkedList;

/**
 * @author lvxinran
 * @date 2020/1/15
 * @discribe leetcode 2. 两数相加
 */
public class Main_2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = l1.val + l2.val;
        return add(i,l1,l2);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2,int add) {
        int i = l1.val + l2.val+add;
        return add(i,l1,l2);
    }
    public ListNode add(int add,ListNode l1,ListNode l2){
        ListNode node = new ListNode(add%10);

        if(add>=10){
            node.next=addTwoNumbers(l1.next==null?new ListNode(0):l1.next,l2.next==null?new ListNode(0):l2.next,1);
        }else{
            if(l1.next==null&&l2.next==null){
                return node;
            }
            node.next=addTwoNumbers(l1.next==null?new ListNode(0):l1.next,l2.next==null?new ListNode(0):l2.next);
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(5);
//        ListNode n3 = new ListNode(3);
//        n1.next = n2;
//        n2.next = n3;
//        ListNode n4 = new ListNode(5);
//        ListNode n5 = new ListNode(6);
//        ListNode n6 = new ListNode(7);
//
//        n4.next=n5;
//        n5.next = n6;
        ListNode listNode = new Main_2_AddTwoNumbers().addTwoNumbers(n1, n2);

    }
}
