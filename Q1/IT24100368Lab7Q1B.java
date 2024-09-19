import java.util.Scanner;
public class IT24100368Lab7Q1B
{
	public static void main (String []args)
	{
		Scanner input = new Scanner (System.in);
		

		int mark1,mark2,mark3,mark4,i ;
		double avg;
		
		for(i = 1;i <= 3;i++)
		{
			System.out.println("Student " +i);
			System.out.println("Enter marks: ");

			mark1=input.nextInt();
			mark2=input.nextInt();
			mark3=input.nextInt();
			mark4=input.nextInt();
		

			avg = (mark1 + mark2 + mark3 + mark4)/4.0;
			System.out.println("Average is : "+ avg);

		
		
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

			System.out.println( );
		}
		
	}

}