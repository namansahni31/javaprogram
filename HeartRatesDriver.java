import java.util.*;
class HeartRatesDriver
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(system.in);
	HeartRates my HeartRate[]=new HeartRates[2];
	for(int count=0;count<(myHeartRate.length);count++)
	{
	System.out.println("Enter first name: ");
	String firstName=input.nextLine();
	System.out.println("enter last name: ");
	String lastName=input.nextLine();
	System.out.println("enter birthdate: "+"\nmm"+"\ndd"+"\nyear");
	int month=input.nextInt();
	int day=input.nextInt();
	int year=input.nextInt();
	input.nextLine();
	myHeartRate[count]=new HeartRates(firstName,lastName,month,day,year);
	System.out.println("firstName"+"\t"+"last name"+"\t"+"age in years"+"\t"+"maximum heartrates"+"\t"+"targetheartrate\n");
	System.out.println(firstname +"\t"+lastName+"\t"+my HeartRate[count].getAge()+"\t"+myHeartRate(count.MaximumHeartrate()myHeartRate[count].targetHeartRate();
	}
	}
}