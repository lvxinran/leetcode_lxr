package cn.com.LinkedList;

/**
 * @author lvxinran
 * @date 2020/1/15
 * @discribe leetcode 19. 删除链表的倒数第N个节点
 */
public class Main_19_RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1){
            return null;
        }
        ListNode tem = head;
       for(int i = 0 ; i<n+1;i++){
           tem = tem.next;
           if(tem==null&&i!=n){
               return head.next;
           }
       }
       if(tem!=null){
           removeNthFromEnd(head.next,n);
       }else{
           head.next = head.next.next;
       }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//        ListNode n5 = new ListNode(5);
        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        new Main_19_RemoveNthFromEnd().removeNthFromEnd(n1, 2);
    }

}