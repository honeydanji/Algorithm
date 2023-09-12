import java.util.*;
import java.io.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder();
        int current = 1;

        for (int i = 0; i < n; i++) {
            while (current <= arr[i]) {
                st.push(current);
                result.append("+\n");
                current++;
            }

            if (st.peek() == arr[i]) {
                st.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result);
    }
}