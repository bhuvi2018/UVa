/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		int t=in.nextInt();
	    		while(t-->0)
	    		{
	    		    ArrayList<Integer> a=new ArrayList<Integer>();
	    		    ArrayList<Integer> b=new ArrayList<Integer>();
	    		    ArrayList<Integer> c=new ArrayList<Integer>();
	    		    ArrayList<Character> d=new ArrayList<Character>();
	    		    ArrayList<Integer> co=new ArrayList<Integer>();
	    		    while(in.nextInt())
	    		    {   
	    		        a.add(in.nextInt());
	    		        b.add(in.nextInt());
	    		        c.add(in.nextInt());
	    		        d.add(in.next().charAt(0));
	    		        co.add(0);
	    		    }
	    		    for(int i=0;i<a.size();i++)
	    		    {
	    		        for(int j=i;j<a.size();j++)
	    		        {
	    		            if(d.get(j)=='C')
	    		            {
	    		                sum+=c.get(j);
	    		                co.get(j)+=1;
	    		            }
	    		            else if(d.get(j)=='I'&&co.get(j)==0)
	    		            sum+=20;
	    		        }
	    		    }
	    		System.out.println();
	    		}
	}
}
