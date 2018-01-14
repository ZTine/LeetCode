public class AddTwoNums{
    public static void main(String[] args){

    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int tmpv = 0;
        int tmpd = 0;
        do{
            int tmp1,tmp2 = 0;
            if(l1 == null){
                tmp1 = 0;
                
            }else{
                tmp1 = l1.val;
                l1 = l1.next;
            }
            if(l2 == null){
                tmp2 = 0;
            }else{
                tmp2 = l2.val;
                l2 = l2.next;
            }
            tmpv = tmp1 + tmp2 + tmpd;
            tmpd = 0;
            if(tmpv > 9){
                tmpv = tmpv - 10;
                tmpd = 1;
            }
            ListNode tmpResult = new ListNode(tmpv);
            tail.next = tmpResult;
            tail = tmpResult;
        }while(l1 != null || l2 != null || tmpd == 1);
        return head.next;
    }
}
