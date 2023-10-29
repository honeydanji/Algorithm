
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = bf.readLine().split(" ");
		String ss = "";

		for(int i = 0; i < s.length; i ++) {
			ss += s[i];
		}
		
		if(ss.equals("12345678")) System.out.println("ascending");
		else if (ss.equals("87654321")) System.out.println("descending");
		else System.out.println("mixed");
	}
}
