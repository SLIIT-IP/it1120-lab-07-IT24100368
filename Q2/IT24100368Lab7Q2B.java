public class IT24100368Lab7Q2B
{
	public static void main(String []args)
	{
		
		int i,j,k=1;
		for(j = 1; j <= 5; j++)
		{
			System.out.print(j + " ");

			for(i = 1; i <= k; i++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			k = k + 1;
		}
	}
}