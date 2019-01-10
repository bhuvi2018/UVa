/*package whatever //do not write package name here */


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		while(true)
		{
		    int n=in.nextInt();
		    int d=in.nextInt();
		    int m=in.nextInt();
		    int year=in.nextInt();
		    
		    if(n==0&&d==0&&m==0&&year==0)
		    break;
		    
		    GregorianCalendar c= new GregorianCalendar(year,m-1,d);
		    
		   c.add(Calendar.DATE, n);
		    
		    System.out.println(c.get(Calendar.DATE)+" "+
				       (c.get(Calendar.MONTH)+1)+" "+
				       c.get(Calendar.YEAR));
		}
	}
}
