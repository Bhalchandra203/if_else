/*
EdCbA
EdCb
EdC
Ed
E
Ed
EdC
EdCb
EdCbA
*/

class program59
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<=n;j++)
					if(i%2!=0)
						System.out.print((char)(n-j+1+64));
					else
						System.out.print((char)(n-j+i+96));
			}
			else
			{
				for(int j=1;j<=i-n+1;j++)
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));

			}
			System.out.println();
		}
	}
}