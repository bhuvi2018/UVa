
import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		ArrayList<Integer> a=new ArrayList<Integer>();
	    		while(in.hasNextInt())
	    		{
	    		    int s=in.nextInt();
	    		    a.add(s);
	                Collections.sort(a);
	                if(a.size()%2==0)
	                    System.out.println((a.get(a.size()/2-1)+a.get(a.size()/2))/2);
	                else
	                	System.out.println(a.get(a.size()/2));
	    		}
	}
}
