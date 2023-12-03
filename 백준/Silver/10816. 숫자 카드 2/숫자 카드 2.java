import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 상근이 카드 갯수
        int n = Integer.parseInt(bf.readLine());
        String[] nCard = bf.readLine().split(" ");

        // 비교 카드 갯수
        int m = Integer.parseInt(bf.readLine());
        String[] yesOrNo = bf.readLine().split(" ");

        Map<String, Integer> s = new LinkedHashMap<>();

        // 상근이 카드 중복 체크
        for(int i = 0; i < n; i++) {
            if (!s.containsKey(nCard[i])) {
                s.put(nCard[i], 1);
            } else {
                s.put(nCard[i], s.get(nCard[i]) + 1);
            }
        }

        // 상근이 카드와 비교 카드 비교
        for(int i = 0; i < m; i++) {
           if (s.containsKey(yesOrNo[i])) {
                sb.append(s.get(yesOrNo[i]) + " ");
           }else {
                sb.append(0 + " ");
           }
        }

        // 정답 출력
        System.out.println(sb);
    }
}