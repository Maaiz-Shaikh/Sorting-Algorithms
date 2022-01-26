package sortingAlgorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {7, 1, 3, 5, 2};
		int n = arr.length;
		
		System.out.println("Array before bubble sort:");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}

		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("\nArray after bubble sort:");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}

	}

}
