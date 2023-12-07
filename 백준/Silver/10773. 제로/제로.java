import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> st = new Stack<>();

        int n = Integer.parseInt(bf.readLine());
        int input;
        int total = 0;

        for(int i = 0; i < n; i++) {
            input = Integer.parseInt(bf.readLine());
            if (input > 0) {
                st.push(input);
                total += input;
            }else {
                total -= st.pop();
            }
        }
        System.out.println(total);
    }
}
