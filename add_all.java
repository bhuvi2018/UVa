import java.io.*;
import java.util.*;

class Main {
	
	public static void main (String [] abc){
	    Scanner in=new Scanner(System.in);
	    while(true)
		{
		    int t=in.nextInt();
		    if(t==0)
		    break;
		    int a[]=new int[t];
		    for(int i=0;i<t;i++)
		    a[i]=in.nextInt();
		    Arrays.sort(a);
		    int c=0,s=0;
		     c=a[0];
		    for(int j=1;j<t;j++)
		    {
		        c+=a[j];
		       s+=c;
		    }
		    System.out.println(s);
		}
	}
}
