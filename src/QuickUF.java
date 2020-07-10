import java.util.Scanner;

public class QuickUF {
	int[] id;

	public QuickUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	boolean connected(int p, int q) {
		return (root(p) == root(q));
	}

	void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

	void display() {
		System.out.println("The array is: \n");
		for (int i = 0; i < id.length; i++)
			System.out.println(id[i] + "\t");
	}

	public static void main(String[] args) {
		System.out.println("Enter  the no. of elements ");
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		QuickUF uf = new QuickUF(N);
		uf.union(2, 8);
		uf.union(5, 9);
		uf.union(3, 7);
		uf.union(9, 1);
		uf.union(7, 9);
		System.out.println(uf.connected(2, 9));
		uf.display();
	}
}
