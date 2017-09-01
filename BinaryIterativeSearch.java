package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Iterative";
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length-1;
		int guess;
		while (min<=max) {
			guess = (min+max)/2;
			if (arr[guess]==target) {
				return guess;
			} else if (arr[guess]>target) {
				max = guess-1;
			} else {
				min = guess +1;
			}
		}
		return -1;
	}

}
