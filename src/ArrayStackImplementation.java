import java.util.Scanner;

public class ArrayStackImplementation {
	private String [] s;
	private int n=0;
	public ArrayStackImplementation(int size) {
		// TODO Auto-generated constructor stub
		s=new String[size];
	}
	public boolean isEmpty() {
		return n==0;
	}
	public void push(String item) {
		s[n++]=item;
	}
	public String pop() {
		String item=s[--n];
		s[n]=null;
		return item;
	}
	
	public void display() {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the stack");
		int size=scn.nextInt();
		ArrayStackImplementation stk=new ArrayStackImplementation(size);
		System.out.println(stk.isEmpty());
		stk.push("Pranav");
		stk.push("Prakhar");
		stk.push("Prabhu");
		stk.pop();
		stk.display();
	}

}
