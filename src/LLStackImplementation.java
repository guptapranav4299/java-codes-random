
public class LLStackImplementation {
	private Node first=null;
	private class Node{
		String item;
		Node next;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void push(String item) {
		Node oldfirst=first;
		first= new Node();
		first.item=item;
		first.next=oldfirst;
	}
	public String pop() {
		String item=first.item;
		first=first.next;
		return item;
	}
	public void display() {
		Node temp=first;
		while(temp!=null) {
			System.out.println(temp.item);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLStackImplementation stk=new LLStackImplementation();
		System.out.println(stk.isEmpty());
		stk.push("Pranav");
		stk.push("Prakhar");
		stk.push("Prabhu");
		stk.pop();
		stk.display();
	}

}
