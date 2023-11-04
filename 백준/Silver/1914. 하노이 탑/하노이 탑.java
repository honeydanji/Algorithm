
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static void hanoi(int n, int start, int end) {

        // 원판이 1개인 경우
	    if (n == 1) {
            System.out.println(start + " " + end);
		    return;
	    } 

        // 원판이 2개 이상인 경우
        if (n > 1) {

            // N - 1 개의 원판을 2번으로 옮김
            hanoi(n - 1, start, 6 - start - end);

            // 남은 원판을 3번으로 옮김 >> 출력
            System.out.println(start + " " + end);

            // 2번에 있는 N - 1 개의 원판을 3번으로 옮김
            hanoi(n - 1, 6 - start - end, end);

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);
        System.out.println(result);
        if(n <= 20) {
            hanoi(n, 1, 3);
        }
    }    
}
