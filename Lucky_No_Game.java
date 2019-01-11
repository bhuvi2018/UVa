import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    int n=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c1=0,c2=0;
	    for(int i=0;i<n;i++)
	      {   int s=sc.nextInt();
	          if(s%a==0)
	             c1++;
	          else if(s%b==0)
	             c2++;
	      }
	      if(c1>c2)
	         System.out.println("BOB");
	      else
	         System.out.println("ALICE");
	}
	}
}

