class program4
{
	public static void main(String args[])
	{
		int a=50,b=20,c=30,d=40,e=60;
		if(a>b)
			if(a>c)
				if(a>d)
					if(a>e)
						System.out.print("a is Bigger");
					else
						System.out.print("e is Bigger");
				else
					if(d>e)
						System.out.print("d is Bigger");
					else
						System.out.print("e is Bigger");
			else
				if(c>d)
					if(c>e)
						System.out.print("c is Bigger");
					else
						System.out.print("e is Bigger");
				else
					if(d>e)
						System.out.print("d is Bigger");
					else
						System.out.print("e is Bigger");
		else
			if(b>c)
				if(b>d)
					if(b>e)
						System.out.print("b is Bigger");
					else
						System.out.print("e is Bigger");
				else
					if(d>e)
						System.out.print("d is Bigger");
					else
						System.out.print("e is Bigger");
			else
				if(c>d)
					if(c>e)
						System.out.print("c is Bigger");
					else
						System.out.print("e is Bigger");
				else
					if(d>e)
						System.out.print("d is Bigger");
					else
						System.out.print("e is Bigger");



	}
}