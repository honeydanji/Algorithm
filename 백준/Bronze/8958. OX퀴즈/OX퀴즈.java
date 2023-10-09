import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력횟수
		int n = sc.nextInt();
		char[] c;
		int numO = 0;
		int numTotal = 0;
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			c = s.toCharArray();
			for(int j = 0; j < c.length; j++) {
				if(c[j] == 'O') {
					numO++;
					numTotal += numO;
				}else {
					numO = 0;
				}
			}
			System.out.println(numTotal);
			numTotal = 0;
			numO = 0;
		}
	}
}