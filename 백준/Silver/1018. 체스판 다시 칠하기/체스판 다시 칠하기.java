import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = bf.readLine().split(" ");
        int count;
        int min = 64;
        List<String[]> bw = new ArrayList<>();
        List<String[]> board = new ArrayList<>(List.of("BWBWBWBW".split(""),
                                                        "WBWBWBWB".split(""),
                                                        "BWBWBWBW".split(""),
                                                        "WBWBWBWB".split(""),
                                                        "BWBWBWBW".split(""),
                                                        "WBWBWBWB".split(""),
                                                        "BWBWBWBW".split(""),
                                                        "WBWBWBWB".split("")));

        for(int i = 0; i < Integer.parseInt(nm[0]); i++) {
            bw.add(bf.readLine().split(""));
        }
        
        // 체스판 비교 
        // B로 시작하는 체스판인 경우 : Count
        // W로 시작하는 체스파인 경우 : 64 - Count
        for(int ii = 0; ii < bw.size() - 7; ii++) {
            for(int jj = 0; jj < bw.get(0).length - 7; jj++) {
                count = 0;
                for(int i = ii; i < 8 + ii; i++) {
                    for(int j = jj; j < 8 + jj; j++) {
                        // Do it
                        if(!board.get(i - ii)[j - jj].equals(bw.get(i)[j])) {
                            count++;
                        }
                    }
                }

                // 최소값 구하기
                if(count < min || (64 - count) < min) {
                    if(count < (64 - count)) {
                        min = count;
                    }else {
                        min = (64 - count);
                    }
                }
            }
        }
        System.out.println(min);
    }
}
