/*
EEEEEEEEE
dddd-dddd
CCC---CCC
bb-----bb
A-------A
*/

class program133
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			if(i==5)
			{
				for(int j=1;j<=(n*2)-1;j++)
					System.out.print((char)(n+64));	
			}
			else
			{
				for(int j=i;j>=1;j--)
					if(i%2!=0)
						System.out.print((char)(i+64));
					else
						System.out.print((char)(i+96));

				for(int j=1;j<=((n-i)*2)-1;j++)
					System.out.print("-");
				for(int j=i;j>=1;j--)
					if(i%2!=0)
						System.out.print((char)(i+64));
					else
						System.out.print((char)(i+96));

			}
			System.out.println();
		}
	}
}