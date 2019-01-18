import java.io.*;
import java.util.*;
import java.lang.*;

class Main
{
    public static boolean anagram(String a,String b)
    {
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(c.length!=d.length)
        return false;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=d[i])
            return false;
        }
        return true;
    }
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int m=t;
		while(t-->0)
		{
		    int n=in.nextInt(),j=0;
		    int y=0;
		    String s[]=new String[n];
		    ArrayList<String>s2=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    s[i]=in.next();
		    String s1;
		    
		    while(!(s1=in.next()).equals("END"))
		    {
		    s2.add(s1);
		    j++;
		    }
		    if(t!=(m-1))
		    System.out.println();
		    int c=0;
		    for(int i=0;i<j;i++)
		    {
		        System.out.println("Anagrams for: "+s2.get(i));
		        for(int k=0;k<n;k++)
		        {
		            
		            if(anagram(s2.get(i),s[k]))
		            {
		                ++c;
		                System.out.println("  "+c+") "+s[k]);
		            }
		            
		        }
		        if(c==0)
		        System.out.println("No anagrams for: "+s2.get(i));
		        c=0;
		    }
		}
	}
}

