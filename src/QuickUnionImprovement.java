import java.util.Scanner;

public class QuickUnionImprovement {
	int [] id;
	int [] sz;

	public QuickUnionImprovement(int N) {
		id=new int[N];
		for(int i=0;i<N;i++)
			id[i]=i;
	}
	private int root(int i)
	{
		while(i!=id[i])
			i=id[i];
		return i;
	}
	boolean connceted(int p, int q) {
		return (root(p)==root(q));
	}
	
	void union(int p, int q) {
		sz=new int[id.length];
		int i=root(p);
		int j=root(q);
		if(i==j)
			return;
		if(sz[i]<sz[j]) {
			id[i]=j;
			sz[j]+=sz[i];
		}
		else {
			id[j]=i;
			sz[i]+=sz[j];
		}
	}
	
	void display()
	{
		System.out.println("The array is: \n");
		for(int i=0;i<id.length;i++)
			System.out.println(id[i]);
	}
	public static void main(String[] args) {
		System.out.println("Enter the no. of elements");
		Scanner scn=new Scanner(System.in);
		int N= scn.nextInt();
		QuickUnionImprovement ui= new QuickUnionImprovement(N);
		ui.union(1, 3);
		ui.union(4, 9);
		ui.union(5, 9);
		ui.union(4, 8);
		ui.union(3, 4);
		ui.display();
	}

}
