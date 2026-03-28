class program3
{
	public static void main(String args[])
	{
		int a=50,b=20,c=30,d=40;
		if(a>b)
			if(a>c)
				if(a>d)
					System.out.print("a is Bigger");
				else
					System.out.print("d is Bigger");
			else
				if(c>d)
					System.out.print("c is Bigger");
				else
					System.out.print("d is Bigger");
		else
			if(b>c)
				if(b>d)
					System.out.print("b is Bigger");
				else
					System.out.print("d is Bigger");
			else
				if(c>d)
					System.out.print("c is Bigger");
				else
					System.out.print("d is Bigger");


					
	}	
}