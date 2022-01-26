package sortingAlgorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {7, 1, 3, 5, 2};
		int n = arr.length;
		
		System.out.println("Array before selection sort:");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}
		
		for(int i=0; i<n-1; i++) {
			int smallest = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[smallest]) {
					smallest = j;
				}
			}
			
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("\nArray after selection sort:");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}

	}

}
