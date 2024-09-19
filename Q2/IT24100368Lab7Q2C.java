public class IT24100368Lab7Q2C
{
	public static void main (String []args)
	{
		int i,j,k=5;

		for(i = 5; i >= 1; i--)
		{
			for(j = 1; j <= k; j++)
			{
				System.out.print(k);
			}
			System.out.print("\n");
			k = k - 1;
		}
	}
}