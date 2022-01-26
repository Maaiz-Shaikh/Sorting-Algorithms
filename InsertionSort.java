package sortingAlgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {7, 1, 3, 5, 2};
		int n = arr.length;
		
		System.out.println("Array before insertion sort:");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}
		
		for(int i=1; i<n; i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		System.out.println("\nArray after insertion sort:");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}

	}

}
