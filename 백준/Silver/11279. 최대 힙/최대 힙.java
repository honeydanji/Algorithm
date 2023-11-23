
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int input;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testCase; i++) {
            input = sc.nextInt();

            if (input == 0) {
                // 비어 있는 경우
                if(pq.isEmpty()) {
                    sb.append(input + "\n");
                    continue;
                }
                // 제일 큰값 삭제와 동시에 출력
                int output = pq.poll();
                if (i != testCase - 1) {
                    sb.append(output + "\n");
                }else {
                    sb.append(output);
                }
            }else {
                pq.add(input);
            }
        }

        System.out.println(sb);
    }    
}
