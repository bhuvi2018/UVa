/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		int c=1;
	    		while(in.hasNext())
	    		{
	    		    String s=in.next();
	    		    if(s.equals("#"))
	    		    break;
	    		    switch(s)
	    		    {
	    		        case "HELLO" :
	    		            System.out.println("Case "+(c++)+":"+" ENGLISH");
	    		            break;
	    		            
	    		        case "HOLA" :
	    		            System.out.println("Case "+(c++)+":"+" SPANISH");
	    		            break;
	    		            
	    		        case "HALLO" :
	    		            System.out.println("Case "+(c++)+":"+" GERMAN");
	    		            break;
	    		            
	    		        case "BONJOUR" :
	    		            System.out.println("Case "+(c++)+":"+" FRENCH");
	    		            break;
	    		            
	    		        case "CIAO" :
	    		            System.out.println("Case "+(c++)+":"+" ITALIAN");
	    		            break;
	    		            
	    		        case "ZDRAVSTVUJTE" :
	    		            System.out.println("Case "+(c++)+":"+" RUSSIAN");
	    		            break;
	    		            
	    		        default :
	    		            System.out.println("Case "+(c++)+":"+" UNKNOWN");
	    		            break;
	    		    }
	    		}
	}
}
