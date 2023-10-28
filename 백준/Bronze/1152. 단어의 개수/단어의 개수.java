
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = bf.readLine().split(" ");
		int count = 0;
		
		
		for(String ss : s) {
			if(ss.equals("")) {
				count++;
			}
		}
		System.out.println(s.length - count);
	}
}
