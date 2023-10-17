import java.util.Scanner;

public class Main {
	public static int R(int n) {
		if (n < 0)
			return 0;
		if (n == 0)
			return 1;

		return R(n - 1) + R(n - 2) + R(n - 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TestCase
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int tc = sc.nextInt();
			long[] Plus = new long[tc + 1];

			for (int j = 0; j <= tc; j++) {
				Plus[j] = R(j);
			}
			
			System.out.println(Long.toString(Plus[tc]));

		}
	}
}


