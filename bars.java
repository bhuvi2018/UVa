import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int w=in.nextInt();
		    int n=in.nextInt();
		    
		    int d[]=new int[1004];
		    d[0]=1;
		    for(int i = 0; i < n; i++) 
		    {
            int p=in.nextInt();
            for(int j = w-p; j >= 0; j--) 
            {
                if(d[j]==1)
                       d[j+p] = 1;
            }
        }
        if(d[w]==1)
        System.out.println("YES");
        else
        System.out.println("NO");
		    
		}
	}
}
