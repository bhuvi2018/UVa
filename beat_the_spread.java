import java.util.*;
import java.lang.*;
import java.io.*;
 

class beat_the_spread
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int s=in.nextInt();
			int d=in.nextInt();
			int f=0;
			for(int a=s,b=0;a>=b;a--,b++)
			{
				if(a-b==d)
				{
					System.out.println(a+" "+b);
					f=1;
					break;
				}
			}
			if(f==0)
			System.out.println("impossible");
		}
	}
}
