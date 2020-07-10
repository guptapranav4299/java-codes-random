import java.util.Scanner;

public class mergeSort {
	
	public static void merge(int [] arr,int [] aux, int low,int mid,int high) {
//		copy contents from arr to aux array
		for(int m=low;m<=high;m++)
		{
			aux[m]=arr[m];
		}
		
//		merge in the main array from aux array
		int i=low;
		int j=mid+1;
		for(int k=low;k<=high;k++) {
			if(i>mid)
				arr[k]=aux[j++];
			else if(j>high) {
				arr[k]=aux[i++];
			}
			else if(aux[j]<aux[i])
				arr[k]=aux[j++];
			else 
				arr[k]=aux[i++];
		}
	}
	public static void sort(int [] arr,int [] aux, int low, int high) {
		if(high<=low)
			return ;
		int mid=low+(high-low)/2;
		sort(arr,aux,low,mid);
		sort(arr,aux,mid+1,high);
		merge(arr,aux,low,mid,high);

	}
	
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int [] arr= {5,2,3,1};
		int [] aux= new int[arr.length];
		sort(arr,aux,0,arr.length-1);
		display(arr);
		
	}

}
