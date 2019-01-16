import java.util.*;
class Array2 {
	public static void main(String args[])
	{int array[],i,position;
	array = new int[10];
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the numbers");
	for(i=0;i<10;i++)
	array[i]= scan.nextInt();
	System.out.println("Enter a number to know its index");
	int search = scan.nextInt();
	position = insert(array,search);
	if (position == -1)
	System.out.println(+search "is not present at any position");
	else
	System.out.println(+seach "is present at "position);
		}
		public static int insert(int array[],int find) {
		for(i=0;i<10;i++) {
		if(array[i] == find)
		return i;
		}
		return 1;
		}
	}
}