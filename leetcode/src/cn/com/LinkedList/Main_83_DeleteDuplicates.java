package cn.com.LinkedList;

/**
 * @author lvxinran
 * @date 2020/1/15
 * @discribe 83. 删除排序链表中的重复元素
 */
public class Main_83_DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
       while(temp!=null){
           while(temp.next!=null&&temp.next.val==temp.val) {
               temp.next = temp.next.next;
           }
           temp = temp.next;
       }
       return head;
    }
}
