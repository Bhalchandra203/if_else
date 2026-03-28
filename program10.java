/*
1
3
5
7
9

*/

class program10
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			else
				System.out.println(i);
		}		
	}
}