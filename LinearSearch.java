//package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Linear Search";
	}

	@Override
	public int search(int[] arr, int target) {
		int i = 0;
		while (i<arr.length) {
			if (arr[i]==target) {
				return target;
			} else {
				i++;
			}
		}
		return -1;
	}

}
