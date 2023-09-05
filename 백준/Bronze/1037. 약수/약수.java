import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		
		// 약수 갯수
		int N = Integer.parseInt(bf.readLine());
		
		int[] num = new int[N];
		
		String[] input = bf.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0] * num[N-1]);
	}
}
