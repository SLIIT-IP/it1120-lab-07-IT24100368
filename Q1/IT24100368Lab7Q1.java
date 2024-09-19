import java.util.Scanner;
public class IT24100368Lab7Q1
{
	public static void main(String []args)
	{
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter marks for four subjects: ");
		
		int mark1,mark2,mark3,mark4;
		double avg;
				
		System.out.print("Enter Subject Mark 1: ");
		mark1 = input.nextInt();

		System.out.print("Enter Subject Mark 2: ");
		mark2 = input.nextInt();
	
		System.out.print("Enter Subject Mark 3: ");
		mark3 = input.nextInt();
		
		System.out.print("Enter Subject Mark 4: ");
		mark4 = input.nextInt();

		avg =( mark1 + mark2 + mark3 + mark4 )/ 4.0;
		System.out.println("Average is : "+avg );
		
		if(avg < 100 && avg > 75)
		{
			System.out.println("Overall Grade is : Distinction");
		}
		else if(avg < 74 && avg > 50)
		{
			System.out.println("Overall Grade is : Credit");
		}
		else
		{
			System.out.println("Overall Grade is : Fail");
		}
	}
}