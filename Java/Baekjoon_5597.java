package Java;

import java.util.*;
import java.util.stream.IntStream;

public class Baekjoon_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int[] B = IntStream.rangeClosed(1, 30).toArray();
		int i = 0;

        while(true) {
            int a = sc.nextInt();
            if(B[i] == a) {
                i = 0;
            }else{
                i++;
            }
            if(i == 29){
                System.out.println(a);
                break;
            }
        }
	}
}	
	