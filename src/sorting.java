import java.util.Scanner;

public class sorting {

//	In this we divide the array into 2 subarrays the first element is compared 
//	with the rest of the the elements of the 2nd subarray when an element is lesser 
//	than minIndex element we just copy its index in the minIndex, since the arr[i] is  
//	already present so we swap both arr[i]	and arr[minIndex]
	public static void selectionSort(int[] arr, int size) {
		for (int i = 0; i < size - 1; i++) {
			int minIndex = i;
			for (int j = i; j < size; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	Lets understand in the form of cards between 5,7,8 cards if we want to insert 6 card then  
//	we we will compare 6 with 8, 8 is greater than 6 so 8 will be shifter towards 1 step forward
//	since 6 is already present in current_element and then we will backshift the index  
//	 then we will compare 6 with 7 7 is greater so 7 will be frontshifted and index backshifted.
//	When 6 is compared with 5 so the loop terminates and we put 6 in front of 5.

	public static void insertionSort(int[] arr, int size) {
		for (int i = 1; i <= size - 1; i++) {
			int current_element = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current_element) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current_element;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void cylindricRotation(int[] arr, int size) {
		int temp = arr[size - 1], i;
		for (i = size - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		for (i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int pivotedBinarySearch(int[] arr, int size, int key) {
		int end = size - 1;
		int pivot = findPivot(arr, 0, end);

		if (pivot == -1)
			return binarySearch(arr, 0, end, key);

		if (arr[pivot] == key)
			return pivot;

		if (arr[0] <= key)
			return binarySearch(arr, 0, pivot - 1, key);
		return binarySearch(arr, pivot + 1, end, key);
	}

	public static int findPivot(int[] arr, int start, int end) {
		end = arr.length - 1;
		if (end < start)
			return -1;

		if (end == start)
			return start;

		int mid = (start + end) / 2;
		if (mid < end && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > start && arr[mid] < arr[mid - 1])
			return mid - 1;

		if (arr[start] >= arr[end])
			return findPivot(arr, 0, mid - 1);
		return findPivot(arr, mid + 1, end);
	}

	public static int binarySearch(int[] arr, int start, int end, int key) {
		end = arr.length - 1;
		if (start > end)
			return -1;

		int mid = (start + end) / 2;
		if (arr[mid] == key)
			return mid;

		if (arr[mid] < key)
			return binarySearch(arr, (mid + 1), end, key);
		return binarySearch(arr, start, (mid - 1), key);
	}

	public static void productSubArray(int[] arr, int size) {
		int product = 1;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				product *= arr[j];
			}
		}

		System.out.println(product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		int size = scn.nextInt();
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
//		selectionSort(arr,size);
//		insertionSort(arr,size);
//		cylindricRotation(arr,size);
//		System.out.println(pivotedBinarySearch(arr,size,3));
		productSubArray(arr, size);
	}

}
