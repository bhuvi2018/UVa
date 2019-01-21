
import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		int t=in.nextInt();
	    		int c=1;
	    		while(t-->0)
	    		{
	    		    int n=in.nextInt();
	    		    int a[]=new int[n];
	    		    for(int j=0;j<n;j++)
	    		    {
	    		        a[j]=in.nextInt();
	    		    }
	    		    int c1=0,c2=0;
	    		    for(int j=0;j<n-1;j++)
	    		    {
	    		        if(a[j]>a[j+1])
	    		        c1++;
	    		        else if(a[j]<a[j+1])
	    		        c2++;
	    		    }
	    		    System.out.println("Case "+(c++)+":"+" "+c2+" "+c1);
	    		}
	}
}
