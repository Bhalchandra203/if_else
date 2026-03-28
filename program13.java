/*
1
2
4
5
7
8
10

*/

class program13
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
				continue;
			else
				System.out.println(i);
		}		
	}
}