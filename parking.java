
import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			ArrayList<Integer> a=new ArrayList<Integer>(n);
			for(int i=0;i<n;i++)
			   a.add(sc.nextInt());
			int x=Collections.max(a);
			int y=Collections.min(a);
			int z=(x-y)*2;
			System.out.println(z);
	}
}
}
