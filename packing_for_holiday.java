
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
	    		    int l=in.nextInt();
	    		    int m=in.nextInt();
	    		    if(n<=20&&m<=20&&l<=20)
	    		    System.out.println("Case "+(c++)+":"+" good");
	    		    else
	    		    System.out.println("Case "+(c++)+":"+" bad");
	    		}
	}
}
