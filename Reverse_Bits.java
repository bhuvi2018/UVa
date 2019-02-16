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
		    long n=in.nextLong();
		    String s=Long.toBinaryString(n);
		    int ss=32-s.length();
		    for(int j=0;j<ss;j++)
		    s="0"+s;
		    StringBuilder s1=new StringBuilder();
		    s1.append(s);
		    s1.reverse();
		    s=s1.toString();
		    System.out.println(Long.parseLong(s,2));
		}
	 }
}
