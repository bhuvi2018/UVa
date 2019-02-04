import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String s=sc.nextLine();
		if(s.equals("#"))
		   break;
			char [] c =s.toCharArray();
			if(next_permutation(c))
			{
				System.out.println(new String(c));
			}
			else
			{
			     System.out.println("No Successor");
			}
		     	
		}
	}
		static boolean next_permutation(char[] p) {
        for (int a = p.length - 2; a >= 0; --a) {
            if (p[a] < p[a + 1]) {
                for (int b = p.length - 1;; --b) {
                    if (p[b] > p[a]) {
                        char t = p[a];
                        p[a] = p[b];
                        p[b] = t;
                        for (++a, b = p.length - 1; a < b; ++a, --b) {
                            t = p[a];
                            p[a] = p[b];
                            p[b] = t;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
