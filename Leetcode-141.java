public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(head != null && head.next != null){
            if(set.contains(head.next)){
                return true;
            }
            set.add(head);
            head = head.next;
        }

        return false;
    }
}
