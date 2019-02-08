import java.io.*;
import java.util.*;

class Main {
	
	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while (!(s=br.readLine()).equals("0")) {
			int N=Integer.parseInt(s);
			long cost=0;
			TreeMap<Integer,Integer> map=new TreeMap<>();
			for (int i=0;i<N;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				int k=Integer.parseInt(st.nextToken());
				for (int i2=0;i2<k;i2++) {
					int num=Integer.parseInt(st.nextToken());
					map.put(num,map.getOrDefault(num,0)+1);
				}
				
				int highest=map.lastKey();
				if (map.get(highest)==1) map.remove(highest);
				else map.put(highest,map.get(highest)-1);
				
				int lowest=map.firstKey();
				if (map.get(lowest)==1) map.remove(lowest);
				else map.put(lowest,map.get(lowest)-1);
				
				cost+=(highest-lowest);
			}
			System.out.println(cost);
		}
	}
}
