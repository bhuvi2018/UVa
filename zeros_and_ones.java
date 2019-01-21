/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		int co=1;
	    		while(in.hasNext())
	    		{
	    		    String s=in.next();
	    		    char []ss=s.toCharArray();
	    		    int n=in.nextInt();
	    		    System.out.println("Case "+(co++)+":");
	    		    if(n==0)
	    		    break;
	    		    for(int i=0;i<n;i++)
	    		    {
	    		        int a=in.nextInt();
	    		        int b=in.nextInt();
	    		        int min=Math.min(a,b);
	    		        int max=Math.max(a,b);
	    		        int c1=0,c2=0;
	    		        for(int j=min;j<=max;j++)
	    		        {
	    		            if(ss[j]=='0')
	    		            c1++;
	    		            else if(ss[j]=='1')
	    		            c2++;
	    		        }
	    		        if(c1==max-min+1||c2==max-min+1)
	    		        {
	    		            System.out.println("Yes");
	    		        }
	    		        else
	    		        System.out.println("No");
	    		    }
	    		}
	}
}
