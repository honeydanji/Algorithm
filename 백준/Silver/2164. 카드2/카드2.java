
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input = 1;

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            q.add(input++);
        }

        do {
            if(q.size() == 1) {
                break;
            }
            q.poll();
            q.add(q.poll());

        } while(q.size() > 1);

        System.out.println(q.peek());
    }
    
}
