package vkproject;
import java.util.Arrays;

public class missingnum {


	   public static void main(String[] args) {
	       int[] arr1 = {5, 3, 1, 2};
	       int[] arr2 = {7, 5, 6, 1, 4, 2};

	       System.out.println("Missing numbers in arr1:");
	       findMissingNumbers(arr1);

	       System.out.println("Missing numbers in arr2:");
	       findMissingNumbers(arr2);
	   }

	   public static void findMissingNumbers(int[] arr) {
	       Arrays.sort(arr);
	       int i = 1;

	       while (i < arr.length) {
	           if (arr[i] - arr[i - 1] == 1) {
	               
	           } else {
	             
	               for (int j = arr[i - 1] + 1; j < arr[i]; j++) {
	                   System.out.println(j);
	               }
	           }
	           i++;
	       }
	   }
	}



