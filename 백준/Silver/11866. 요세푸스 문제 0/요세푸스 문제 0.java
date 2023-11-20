
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bf.readLine().split(" ");
        List<Integer> test = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= Integer.parseInt(nk[0]); i++) { // 10
            q.add(i);
        }
        
        for(int i = 0; i < Integer.parseInt(nk[1]); i++) {

            if(Integer.parseInt(nk[1]) == 1) {
                test.addAll(q);
                formatArray(test);
                break;
            }

            // k번째를 배열에 저장
            if(i == Integer.parseInt(nk[1]) - 1) {
                test.add(q.poll());
                i = 0;
            }

            // 머리에 있는 값을 꼬리에 추가
            q.add(q.poll());
            
            
            if(test.size() == Integer.parseInt(nk[0])) {
                break;
            }
        }
        System.out.println(formatArray(test));
    }

    private static String formatArray(List<Integer> array) {
        StringBuilder sb = new StringBuilder("<");

        for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));

            if (i < array.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(">");
        return sb.toString();
    }
}
