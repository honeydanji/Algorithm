import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[] queue;
    private static int capacity;
    private static int front;
    private static int rear;
    private static int num;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 반복 횟수
        int n = Integer.parseInt(bf.readLine());

        // 기본 셋팅
        front = rear = num = 0;
        capacity = n;
        queue = new int[capacity];

        // 결과값 저장
        // int[] result = new int[n];
        List<Integer> result = new ArrayList<>();
        String[] pp;

        String inputValue = "";
        for(int i = 0; i < n; i++) {
            inputValue = bf.readLine();
            switch(inputValue) {
                case "pop" :
                int value = pop();
                if (value == -1) { // 값이 없으면 -1 저장
                    // result[i] = -1;
                    result.add(-1);
                    break;
                }else{
                    // result[i] = value;
                    result.add(value);
                    break;
                }
                
                case "size" :
                // result[i] = size();
                result.add(size());
                break;

                case "empty" :
                // result[i] = empty();
                result.add(empty());
                break;

                case "front" : 
                // result[i] = front();
                result.add(front());
                break;

                case "back" : 
                // result[i] = back();
                result.add(back());
                break;

                default : pp = inputValue.split(" "); 
                // result[i] = Integer.parseInt(pp[1]);
                // push(result[i]);
                push(Integer.parseInt(pp[1]));
                break;
            }
        }

        // 결과 출력
        for(int a : result) {
            System.out.println(a);
        }
    }
    
    private static void push(int pp) {
        queue[rear++] = pp;
        num++;
        if(rear == capacity) {
            rear = 0;
        }
    }

    private static int pop() {
        if (num <= 0) {
            return -1;
        }
        int pp = queue[front++];
        num--;
        if(front == capacity) {
            front = 0;
        }
        return pp;
    }

    private static int size() {
        return num;
    }

    private static int empty() {
        if (num <= 0) {
            return 1;
        }else{
            return 0;
        }
    }

    private static int front() {
        if(num <= 0) {
            return -1;
        }else{
            return queue[front];
        }
    }

    private static int back() {
        if(num <= 0) {
            return -1;
        }else{
            return queue[rear-1];
        }
    }
}
