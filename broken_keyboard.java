import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
class Main 
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
        {
            LinkedList<Character> a=new LinkedList<>();
            int n=0;
            
           
            for(char c: s.toCharArray())
            {
                if(c=='[')
                    n=0;
                else if(c==']')
                    n=a.size();
                else    
                    a.add(n++,c);
                    
            }
            StringBuilder sb=new StringBuilder();
            for( char c: a)
                sb.append(c);
            System.out.println(sb.toString());
            
        }
        
    }
}
