/*
1
1F
1E1
1D1C
1B1A1
*/

class program36
{
	public static void main(String args[])
	{
		int n=5 ;
		char c=(char)(((n*n)/4)+64);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				if(j%2!=0)
					System.out.print(1);
			else
				System.out.print(c--);
			
			System.out.println();
		}
		
	}
}