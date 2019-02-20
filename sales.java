import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n1=in.nextInt();
            int[] a=new int[n1];
            int cc=0;
            for(int j=0;j<n1;j++)
                a[j]=in.nextInt();
            for(int i=0;i<n1;i++)
            {
                int c=a[i];
                for(int j=0;j<i;j++)
                {
                    if(c>=a[j])
                    cc++;
                }
            }
            System.out.println(cc);
        }
    }
}
