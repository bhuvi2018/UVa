import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
 
public class Main 
{
    	public static void main (String[] args)throws IOException
	{
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        String s=br.readLine();
	        int h=Integer.parseInt(s.substring(0,2));
	        int m=Integer.parseInt(s.substring(3));
	        do{
	            if(m==59)
	                h=(h+1)%24;
	       m=(m+1)%60;
	        }while(!pal(h,m));
	        System.out.println(string(h,m));
	    }
	}
	    static String string(int h, int m)
	    {
	        String str=Integer.toString(h*100+m);
	        for(;str.length()<4;)
	        str=0+str;
	        return str.substring(0,2)+":"+str.substring(2);
	        
	    }
	    static boolean pal(int h,int m)
	    {
	         String str=Integer.toString(h*100+m);
	         for(int i=0;i<str.length()/2;i++)
	         {
	             if(str.charAt(i)!=str.charAt(str.length()-i-1))
	                return false;
	         }
	        return true;
	    }
	
}
