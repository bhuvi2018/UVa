
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class clock_hands
{
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (!s.equals("0:00")) {

            String[] cl = s.split(":");

            double h = Integer.parseInt(cl[0]), m = 
                       Integer.parseInt(cl[1]);
        	double angle =Math.abs((30*h + m/2.0) - 6*m);
        	
        	if(angle>180) angle=360-angle; 

            System.out.printf("%.3f\n", angle);
            s = in.nextLine();
		}
	}
}
