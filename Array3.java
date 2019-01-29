import java.util.*;
public class Array3 {
	public static void main(String args[]) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the number of elements for first array");
	int n=scan.nextInt();
	int arr1[]=new int[n];
	System.out.println("enter elements");
	for(int i=0;i<n;i++) {
	arr1[i]=scan.nextInt();
	}
	for(int i:arr1) {
	System.out.println(i);
	}
	System.out.println("enter the number of elements for second array");
	int n2=scan.nextInt();
	int arr2[]=new int[n2];
	System.out.println("enter elements");
	for(int i=0;i<n;i++) {
	arr2[i]=scan.nextInt();
	}
	for(int i:arr2) {
	System.out.println(i);
	}
	int [] arr3 = new int[arr1.length + arr2.length];
	int i = 0,j = 0,k = 0;
	while(i < arr1.length && j < arr2.length) {
		if(arr1[i] < arr2[j]) {
			arr3[k] =arr1[i];
			i++;
		} else {
			arr3[k] = arr2[j];
			j++;
		}
		k++;
		}

		if(i < arr1.length) {
			System.arraycopy(arr1, i ,arr3, k, (arr1.length - i));
		}

		if(j < arr2.length) {
			System.arraycopy(arr2, j ,arr3, k, (arr2.length - j));
		}

       System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
	}
	
}