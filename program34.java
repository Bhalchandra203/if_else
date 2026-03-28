/*
1
1A
1A1
1B1A
1B1A1
1C1B1A
*/

class program34
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
				int temp=i;
			for(int j=1;j<=i;j++)
				if(j%2!=0)
					System.out.print((1));
				else
					System.out.print((char)((j/2)+64));
					temp--;
			System.out.println();
		}	
	}
}