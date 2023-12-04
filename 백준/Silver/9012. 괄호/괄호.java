import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s;
        Stack<String> st1;
        Stack<String> st2;

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            s = bf.readLine().split("");
            st1 = new Stack<>();
            st2 = new Stack<>();
            for(int j = 0; j < s.length; j++) {
                st1.push(s[j]);
            }

            while(!st1.isEmpty()) {
                if (st2.isEmpty()) {
                    st2.push(st1.pop());
                } else {
                    if(st1.peek().equals("(") && st2.peek().equals(")")) {
                        st1.pop();
                        st2.pop();
                    }else {
                        st2.push(st1.pop());
                    }
                }
            }
            if (st1.isEmpty() && st2.isEmpty()) {
                sb.append("YES" + "\n");
            }else {
                sb.append("NO" + "\n");
            }
        }
        System.out.println(sb);
    }    
}
