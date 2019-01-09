/*package whatever //do not write package name here */

import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt())
		{
		    int m=in.nextInt();
		     if(m<0)
		     break;
		     double d=in.nextDouble();
		     double l=in.nextDouble();
		     int n=in.nextInt();
		     double [] values=new double [m+1];
		     for(int i=0;i<n;i++)
		     {
		         int mo=in.nextInt();
		         double r=in.nextDouble();
		         r=1-r;
		         for(int j=mo;j<values.length;j++)
		         values[j]=r;
		     }
		     double mp=l/m;
			double owe=l;
			double car=(l+d)*values[0];
			int month=1;
			while (owe > car && month<values.length) {
				owe-=mp;
				car*=values[month];
				month++;
			}
			month--;
			
			if (month==1) {
				System.out.println("1 month");
			} else {
				System.out.println(month+" months");
			}
		}
	}
}
