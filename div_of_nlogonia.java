import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t;
		StringBuilder answer = new StringBuilder();
		while ((t = in.nextInt()) != 0) {
			int x = in.nextInt(), y = in.nextInt();
			for (int i = 0; i < t; i++) {
				int x1 = in.nextInt(), y1 = in.nextInt();
				if (x1 > x && y1 > y)
					answer.append("NE\n");
				else if (x1 > x && y1 < y)
					answer.append("SE\n");
				else if (x1 < x && y1 < y)
					answer.append("SO\n");
				else if (x1 < x && y1 > y)
					answer.append("NO\n");
				else
					answer.append("divisa\n");
			}
		}
		System.out.print(answer.toString());
	}


