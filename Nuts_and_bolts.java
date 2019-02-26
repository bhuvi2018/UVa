import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    char a[]=new char[n];
		    char b[]=new char[n];
		    for(int j=0;j<n;j++)
		    a[j]=in.next().charAt(0);
		    for(int j=0;j<n;j++)
		    b[j]=in.next().charAt(0);
		    Arrays.sort(a);
		    Arrays.sort(b);
		    ArrayList<Character> c=new ArrayList<Character>();
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]==b[j])
		        c.add(a[j]);
		    }
		    for(int j=0;j<c.size();j++)
		    {
		        System.out.print(c.get(j)+" ");
		    }
		    System.out.println();
		    for(int j=0;j<c.size();j++)
		    {
		        System.out.print(c.get(j)+" ");
		    }
		    System.out.println();
		}
	 }
