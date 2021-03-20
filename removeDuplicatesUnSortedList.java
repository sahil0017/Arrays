package LinkedList;

public class removeDuplicatesUnSortedList {
	static Node head;
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	static void push(int data)
	{
		Node newnode=new Node(data);
		newnode.next=head;
		
		head=newnode;
	}
	
	public static Node getMiddle(Node head)
	{
		if(head==null )
			return head;
		
		Node slow_ptr=head;
		Node fast_ptr=head;
		
		while(fast_ptr.next!=null && fast_ptr.next.next!=null)
		{
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
		}
		
		return slow_ptr;
	}
	
	public static Node merge(Node head)
	{
		if(head==null || head.next==null)
			return head;
		
		Node Middle=getMiddle(head);
		Node nextmiddle=Middle.next;
		Middle.next=null;
		
		Node left=merge(head);
		Node right=merge(nextmiddle);
		
		Node sortedlist=mergeSort(left,right);
		
		return sortedlist;
	}
	
	public static Node mergeSort(Node left,Node right)
	{
		Node res=null;
		if(left==null)
			return right;
		else if(right==null)
			return left;
		
		if(left.data<=right.data)
		{
			res=left;
			res.next=mergeSort(left.next,right);
		}
		else
		{
			res=right;
			res.next=mergeSort(left,right.next);
		}
		return res;
	}
	
	public static void removeDuplicates(Node head)
	{
		if(head==null || head.next==null)
			return;
		Node temp=head;
		Node prev=head;
		
		while(temp!=null)
		{
			if(temp.data!=prev.data)
			{
				prev.next=temp;
				prev=temp;
			}
			
			temp=temp.next;
			
		}
		
		if(prev!=temp)
		{
			prev.next=null;
		}
	}
	
	public static Node removeDuplicate(Node head)
	{
		if(head==null)
			return head;
		
		@SuppressWarnings("unused")
		Node tofree=null;
		
		if(head.next!=null)
		{
			if(head.data==head.next.data)
			{
				tofree=head.next;
				head.next=head.next.next;
				removeDuplicate(head);
			}
			else
			{
				removeDuplicate(head.next);
			}
		}
		
		return head;
	}
	
	static void printList(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(8);
		push(6);
		push(1);
		push(1);
		push(2);
		push(7);
		push(4);
		
		System.out.println("Original List ");
		printList(head);
		
		head=merge(head);
		
		System.out.println("After Sorting ");
		printList(head);
		
		//removeDuplicates(head);
		
		head=removeDuplicate(head);
		
		System.out.println("After removing Duplicates ");
		printList(head);

	}

}
