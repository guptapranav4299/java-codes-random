
public class LinkedList {
	Node head;
	
	private class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public void insertNodeFront(int data)
	{
//		step1 allocate memory to the new node
		Node first=new Node(data);
//		step 2 assign data to the new node
		first.data=data;
//		step3 assign newnode.next to the head
		first.next=head;
//		move the head to the new node
		head=first;
		
	}
	public void insertNodeat(Node previous, int data)
	{
		if(previous==null)
		{
			System.out.println("Invalid operation");
		}
//		assign memory to the new node
		Node current=new Node(data);
//		assign data to the new node
		current.data=data;
//		connect previous.next to the current.next node
		current.next=previous.next;
//		connect previous.next to current
		previous.next=current;	
	}
	public void insertAtLast(int data) {
//		step1 assign memory to the new node
		Node current=new Node(data);
//		step2 asign data to that node 
		current.data=data;
//		step 3 set last node to head
		Node last=head;
//		step4 set pointer of current as null 
		current.next=null;
//		step5 check for empty ll
		if(head==null) {
			head=current;
			return;
		}
//		step6 traverse the whole ll to reach at last
		while(last.next!=null)
		{
			last=last.next;
		}
//		assign current to last.next
		last.next=current;
	}
	public void deleteKey(int key) {
		Node temp=head;
		Node prev=null;
		
//		check if the key is in head
		while(temp!=null && temp.data==key) {
			head=temp.next;
			System.out.println("Deleting");
			return;
		}
//		then traverse till the end of the list
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
//		key is between the list
		prev.next=temp.next;
		
	}
	
	public void deleteatPosition(int position) {
//		check for empty ll
		if(head==null)
			return;
//		assign head to temp
		Node temp=head;
		
//		if given position is head
		if(position==0)
		{
			head=temp.next;
			return;
		}
//		traverse the ll
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp=temp.next;
		}
//		if position is out of the ll
		if(temp==null || temp.next==null)
			return;
		
//		assign next to the next tonext of temp and temp.next to next
		Node next=temp.next.next;
		temp.next=next;
	}
	public void countNodes() {
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		System.out.println(count);
	}
	
	public void countRecursives(Node temp)
	{ 
		int count=0;
		if(head==null) {
			count=0;
			System.out.println(count);
			return;
		}
		countRecursives(head.next);
	}
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.insertNodeFront(5);
		ll.insertAtLast(10);
		ll.insertAtLast(15);
		ll.insertNodeat(ll.head.next, 12);
//		ll.deleteKey(10);
//		ll.deleteatPosition(2);
		ll.display();
		ll.countNodes();
		ll.countRecursives(null);
	}

}
