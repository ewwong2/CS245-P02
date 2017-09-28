//package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Recursive";
	}

	@Override
	public int search(int[] arr, int target) {
		return searchh(0,arr.length-1,arr,target);
	}

	/*
	There's no need to have different function names.  It actually can be more confusing to have
	overloaded funcitons with different names.
	*/	
	private int searchh(int min, int max, int[] arr, int target) {
		int guess = (min+max)/2;
		if (min>max) {
			return -1;
		} else if (arr[guess]==target) {
			return guess;
		} else if (arr[guess]>target) {
			return searchh(min,guess-1,arr,target);
		} else {
			return searchh(guess+1,max,arr,target);
		}
	}

}
