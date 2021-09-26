package algorithms.CodingAssignment.Services;

public class MergeSort {
	
	void mergeDescending(double[] arr, int left, int mid, int right) {
		int n1 = mid - left +1;
		int n2 = right - mid;
		
		double arrL[] = new double[n1];
		double arrR[] = new double[n2];
		
		for(int i=0; i<n1; ++i) {
			arrL[i] = arr[left + i];
		}
		for(int j=0; j<n2; ++j) {
			arrR[j] = arr[mid + 1 + j];
		}
		
		int i=0, j=0;
		
		int k = left;
		while (i < n1 && j < n2) {
			if(arrL[i] >= arrR[j]) {
				arr[k] = arrL[i];
				i++;
			}
			else {
				arr[k] = arrR[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = arrL[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = arrR[j];
			j++;
			k++;
		}
	}
	
	void mergeAscending(double[] arr, int left, int mid, int right) {
		int n1 = mid - left +1;
		int n2 = right - mid;
		
		double arrL[] = new double[n1];
		double arrR[] = new double[n2];
		
		for(int i=0; i<n1; ++i) {
			arrL[i] = arr[left + i];
		}
		for(int j=0; j<n2; ++j) {
			arrR[j] = arr[mid + 1 + j];
		}
		
		int i=0, j=0;
		
		int k = left;
		while (i < n1 && j < n2) {
			if(arrL[i] <= arrR[j]) {
				arr[k] = arrL[i];
				i++;
			}
			else {
				arr[k] = arrR[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = arrL[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = arrR[j];
			j++;
			k++;
		}
	}
	
	void sort(double[] arr, int left, int right, Boolean reverse) {
		
		if(left < right) {
			int mid = left + (right-left)/2;
			
			sort(arr, left, mid, reverse);
			sort(arr, mid+1, right, reverse);
			
			if(reverse==true)
				mergeDescending(arr, left, mid, right);
			
			else
				mergeAscending(arr, left, mid, right);
		}
	}
	
	public double[] getSortedArray(double[] arr, Boolean reverse) {
		
		sort(arr, 0, arr.length-1, reverse);
		
		return arr;
	}
	

	


}
