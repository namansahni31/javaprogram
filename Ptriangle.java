import java.util.*;
public class Ptriangle
{
	public static void main(String args[]) {
	int r,i,k,num=1,j;
	Scanner scan = new Scanner(System.in);
	System.out.print("eneter the number of rows");
	r = scan.nextInt();
	for(i=0;i<r;i++)
	{
	for(k=r;k>i;k--)
	{
	System.out.print(" ");
     num = 1;
     for(j=0;j<=1;j++)
     {
     System.out.print(num+ " ");
     num =num * (i-j) / (j+1);
     }
     System.out.println():
	}
	}
	}
}