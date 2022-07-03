import java.util.Scanner;

class MissingNumberFinder {

 public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int size = in .nextInt();
 int[] arr = new int[size-1];
 for(int i=0;i<size-1;i++)
 arr[i] = in.nextInt();
 System.out.println(missingNumberFinder(arr, size));
 }
 static int missingNumberFinder(int array[], int n) {
 // write your code here
 	int realSum= (n*(n+1))/2;
 	int arraySum=0;
 	int missingNumber=0;
 	for (int i=0;i<n-1;i++){
 		arraySum+=array[i];

 	}
 	missingNumber=realSum-arraySum;
 	return missingNumber;

	}
}