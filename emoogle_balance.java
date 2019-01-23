
import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		int t,c=1;
	    		while((t=in.nextInt())!=0)
	    		{
	    		    int z=0,s=0;
	    		    for(int j=0;j<t;j++)
	    		    {
	    		        int m=in.nextInt();
	    		        if(m==0)
	    		        z++;
	    		        else
	    		        s++;
	    		    }
	    		    System.out.println("Case "+(c++)+": "+(s-z));
	    		}
	}
}
