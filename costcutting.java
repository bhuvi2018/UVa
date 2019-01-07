import java.util.*;
import java.lang.*;
import java.io.*;

class costcutting {
public static void main (String[] args) 
{
Scanner in=new Scanner(System.in);
int T=in.nextInt();
for(int i=0;i<T;i++)
{
    ArrayList<Integer>a=new ArrayList<Integer>();
    a.add(in.nextInt());
    a.add(in.nextInt());
    a.add(in.nextInt());
    Collections.sort(a);
    System.out.println("Case "+(i+1)+": "+a.get(1));
}
}
}
