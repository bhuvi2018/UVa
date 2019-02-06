import java.io.*;
import java.util.*;

class Main {
   public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> b = new ArrayList<Integer>();
            List<Integer> al = new ArrayList<Integer>();
            while(input.hasNext()){
                   String str = input.next();
                   if(str.equals("#")) break;
                   int n = input.nextInt();
                   int m = input.nextInt(); 
                   a.add(n);
                   b.add(m);
                   al.add(m);
                 }
            
                   int limit = input.nextInt(); 
                   int index = 0,count = 0; 
                   for(int i=0;i<limit;i++){
                             index = smallest(b,al,a);   
                             System.out.println(a.get(index));    
                    }}
                    public static int smallest(List<Integer> b,List<Integer> al,List<Integer> a){
                         int min1 = 100000,min = 0;    
                         for(int i=0;i<b.size();i++){
                                       if(b.get(i)<min1){
                                         min1 = b.get(i);
                                         min = i;  
                                       }
                                      if(b.get(i)==min1){
                                          if(a.get(i)<a.get(min)){
                                             min1 = b.get(i); 
                                             min = i;
                                       }
                                     }
                                  }
                          b.set(min, b.get(min)+al.get(min));
                          return min;
                    }
}
