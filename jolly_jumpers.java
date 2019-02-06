import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    while(in.hasNextInt())
	    {
	        int n=in.nextInt();
	        int[] a=new int[n];
	        int f=0;
	        a[0]=in.nextInt();
	        int b[]=new int[n];
	        for(int i=1;i<n;i++)
	        {
	            a[i]=in.nextInt();
	            b[i]=0;
	        }
	       for(int i=0;i<n-1;i++)
	       {
	           int s=Math.abs(a[i]-a[i+1]);
	           if(s<=n-1&&s!=0)
	               b[s-1]=1;
	       }
	       for(int j=0;j<n-1;j++)
	       {
	           if(b[j]==1)
	           f++;
	       }
	        if(f==n-1)
	        System.out.println("Jolly");
	        else
	        System.out.println("Not jolly");
	    }
	}
}
