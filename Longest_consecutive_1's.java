import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {
	 Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    String s=Integer.toBinaryString(n);//binary conversion
		    int c=0,max=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='1')
		        c++;
		        else
		        c=0;
		        if(c>0&&max<c)
		        max=c;
		    }
		    System.out.println(max);
		}
	 }
}
