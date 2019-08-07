public class ListNode{
	int val;
	ListNode next;	
}

class solution{
	public ListNode Element(int val,ListNode head){
		if(head==null){
			return head;
		}
		ListNode p=head,q=head.next;
		while(q!=null){
			if(q.val=val){
				p.next=q.next;
				q=q.next;				
			}
			else{
				p=p.next;
				q=q.next;
			}			
		}
		if(head.val=val){
			head=head.next;
		}
		return head;
}