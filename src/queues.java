
public class queues {
	
	private class Node {
		String item;
		Node next;
	}
	private Node first,last;
	
	public boolean isEmpty() {
		return first==null;
	}
	public void enqueue(String item) {
		Node oldlast=last;
		last=new Node();
		last.item=item;
		last.next=null;
		if(isEmpty())
		{
			first=last;
		}
		else {
			oldlast.next=last;
		}
	}
	public String dequeue() {
		String item=first.item;
		first=first.next;
		if(isEmpty()) {
			last=null;     
		}
		return item;
	}

	public queues() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
