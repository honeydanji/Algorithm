
import java.util.Scanner;

public class Main {
    
    private static boolean[] flag_a;
    private static boolean[] flag_b;
    private static boolean[] flag_c;
    private static int[] pos;
    private static int count;

    private static void setQueen(int n) {
        flag_a = new boolean[n];
        flag_b = new boolean[2 * n - 1];
        flag_c = new boolean[2 * n - 1];
        pos = new int[n];
        count = 0;
    }

    static void set(int i, int n) {
        for (int j = 0; j < n; j++) {
            if(flag_a[j] == false && flag_b[i + j] == false && flag_c[i - j + (n - 1)] == false) {
                pos[i] = j;
                if (i == n - 1) {
                    count++;
                }else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + (n - 1)] = true;
                    set(i + 1, n);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + (n - 1)] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        setQueen(n);
        set(0,n);
        System.out.println(count);
    }

}
