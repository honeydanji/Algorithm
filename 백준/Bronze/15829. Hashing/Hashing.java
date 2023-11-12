import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] test = bf.readLine().split("");
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += ((int)test[i].charAt(0) - 96) * (int)Math.pow(31, i);
        }
        System.out.println(total);
    }
    
}
