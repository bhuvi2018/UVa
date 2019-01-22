
import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    	    int t=in.nextInt();
	    	    while(t-->0)
	    	    {
	    	        int n=in.nextInt();
	    	        n*=567;
	    	        n/=9;
	    	        n+=7492;
	    	        n*=235;
	    	        n/=47;
	    	        n-=498;
	    	        int c=0,s=0;
	    	        while(c<2)
	    	        {
	    	            s=n%10;
	    	            n/=10;
	    	            c++;
	    	        }
	    	        System.out.println(Math.abs(s));
	    	    }
	}
}
