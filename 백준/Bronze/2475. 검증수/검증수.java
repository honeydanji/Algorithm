import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언\

		String[] a = bf.readLine().split(" ");
		int total = 0;
		
		for(int i = 0; i < 5; i++) {
			total += Math.pow(Integer.parseInt(a[i]), 2);
		}
		
		System.out.println(total % 10);
	}

}
