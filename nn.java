import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Mirrorp {

	public static void main(String[]args)throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char [] mirror=new char [128];
		mirror['A']='A';
		mirror['E']='3';
		mirror['3']='E';
		mirror['H']='H';
		mirror['I']='I';
		mirror['J']='L';
		mirror['L']='J';
		mirror['M']='M';
		mirror['O']='O';
		mirror['S']='2';
		mirror['2']='S';
		mirror['T']='T';
		mirror['U']='U';
		mirror['V']='V';
		mirror['W']='W';
		mirror['X']='X';
		mirror['Y']='Y';
		mirror['Z']='5';
		mirror['5']='Z';
		mirror['1']='1';
		mirror['8']='8';
		
		String s;

		while ((s=br.readLine())!=null) {
			boolean Pl = true;
			boolean Mir = true;
			char [] c=s.replace("0","O").toCharArray();
			
			
			for (int i=0;i<c.length/2 && Pl;i++) {
				Pl = (c[i]==c[c.length-1-i]);
			}
			
			for (int i=0;i<c.length/2 && Mir;i++) {
				Mir = (mirror[c[i]]==c[c.length-1-i]);
			}
			if (c.length%2==1) {
				Mir = Mir && mirror[c[c.length/2]]==c[c.length/2];
			}
			
			StringBuilder sb=new StringBuilder(s);
			if (!Pl&& !Mir) {
				sb.append(" -- is not a palindrome.\n");
			}else if (Pl && !Mir) {
				sb.append(" -- is a regular palindrome.\n");
			} else if (!Pl&& Mir) {
				sb.append(" -- is a mirrored string.\n");
			} else {
				sb.append(" -- is a mirrored palindrome.\n");
			}
			
			System.out.println(sb.toString());
		}
	}
}







