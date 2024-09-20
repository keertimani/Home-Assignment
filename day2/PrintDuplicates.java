package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] data = {2,5,7,7,5,9,2,3};
		System.out.println("Duplicates:");
		
		Arrays.sort(data);
		for (int i=0; i<data.length-1; i++) {
			if (data[i]==data [i+1]){
				System.out.println("duplicate value:" +data[i+1] );
			}
		}
	}

}
