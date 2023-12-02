import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(bf.readLine());

        int[] test = new int[testCase];

        for(int i = 0; i < testCase; i++) {
            test[i] = Integer.parseInt(bf.readLine());
        } 

        Arrays.sort(test);

        for(int a : test) {
            bw.write(a + "\n");
        }
        bw.flush();

    }

}
