import java.util.*;


class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while(true){
            double H = sc.nextInt(), U = sc.nextInt() , 
        D = sc.nextInt(), F = sc.nextInt();
            if(H==0&&U==H&&D==0&&F==0){break;}
            double d= 0;  
            long days = 0;
            F = (U*F)/100.0;
            while(true){
                days++; 
                if(U>=0){
                d+= U; } 
                if(d>H){break;}
                d-= D;  
                if(d<0){break;}
                U-= F;
       
            }
        if(d>=0){sb.append("success on day "+days).append('\n');}  
        else{sb.append("failure on day " + days).append('\n');}  
        }
        System.out.print(sb.toString());
    }
}
