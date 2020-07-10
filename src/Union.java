import java.util.Scanner;

public class Union {
	int[] id;
	public Union(int N) {
		id=new int[N];
		System.out.println("Enter the elements \n");
		for(int i=0;i<N;i++)
		{
			id[i]=i;
		}
	}
	public boolean connected(int p, int q)
	{
		return (id[p]==id[q]);
	}
	public void union(int p, int q) {
		int pid=id[p];
		int qid=id[q];
		for(int i=0;i<id.length;i++)
		{
			if(id[i]==pid)
				id[i]=qid;
		}
	}
	public void display() {
		System.out.println("The array is");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]+"\t");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the no. of elements");
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		Union u= new Union(N);
		u.union(2, 5);
		u.union(5, 9);
		u.union(1, 5);
		u.union(1, 9);
		u.union(5, 8);
		System.out.println(u.connected(8, 9));
		u.display();
	}

}
