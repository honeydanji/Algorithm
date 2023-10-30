
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] test;
		int[] itest;
		
		while(true) {
			test = bf.readLine().split(" ");
			itest = new int[3];
			for(int i = 0; i < test.length; i++) {
				itest[i] = Integer.parseInt(test[i]);
			}
			Arrays.sort(itest);
			
			if(itest[0] == 0){
				break;
			}
			else if(Math.pow(itest[2], 2) == Math.pow(itest[0], 2) + Math.pow(itest[1], 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		};
			
	}

}
