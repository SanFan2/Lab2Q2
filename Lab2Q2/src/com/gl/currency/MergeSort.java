package com.gl.currency;

public class MergeSort {
	
	static void merge(int arr[], int left, int mid, int right) {
		// To find size of 2 sub-arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		// To create temporary arrays
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		// To copy data to temporary arrays
		for (int i = 0; i< n1; ++i)
			leftArray[i] = arr[left+1];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 +j];
		
		// To merge temporary arrays
		 int i=0, j=0; //Initial indices of 1st and 2nd sub-arrays
		 
		 //Initial index of merged sub-array 
		 int k = left;
		 while (i < n1 && j < n2) {
			 if (leftArray[i] >= rightArray[j]) {
				 arr[k] = leftArray[i];
				 i++;
			 } else {
				 arr[k] = rightArray[j];
				 j++;
			 }
			 k++;
		 }
		 
		 // To copy remaining elements of L[] if any
		 while (i < n1) {
			 arr[k] = leftArray[i];
			 i++;
			 k++;			 
		 }
		 
		 // To copy remaining elements of R[] if any
		 while (j < n2) { 
			 arr[k] = rightArray[j];
			 j++;
		 }
		 k++;
	 }
		 
		 // Main method that sorts the array left to right using Merge Sort
		 public static void sort (int arr[], int left, int right) {
			 if (left < right) {
				 // To find the middle point
				 int mid = (left + right)/ 2;
				 
				 // To sort 1st and 2nd half, method calling itself
				 sort(arr, left, mid);
				 sort(arr, mid + 1, right);
				 
				 // Merging the sorted halves
				 merge (arr, left, mid, right);
			 }
		 }
	}

