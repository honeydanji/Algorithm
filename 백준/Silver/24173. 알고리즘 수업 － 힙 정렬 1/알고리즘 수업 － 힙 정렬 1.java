
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int count = 0;
    private static int a;
    private static boolean check = false;

    public static void main(String[] args) throws IOException {
        
        // 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스, 교환 위치
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 정수형 배열
        int[] test = new int[Integer.parseInt(st.nextToken())];
        String[] temp = bf.readLine().split(" ");

        // 교환 위치
        a = Integer.parseInt(st.nextToken());

        for(int i = 0; i < temp.length; i++) {
            test[i] = Integer.parseInt(temp[i]);
        }

        // 힙정렬
        heapSort(test);
        if(!check && count < a) {
            System.out.println(-1);
        }
    }

   // Heap Sort 메소드
    public static void heapSort(int[] A) {

        // 최초로 힙 만들기
        buildMinHeap(A);
        int n = A.length;

        // 배열을 힙에서 꺼내서 정렬
        for (int i = n - 1; i > 0; i--) {
            // 힙의 루트와 마지막 요소를 교환 >> 정렬하기 루트에 있는 값을 맨뒤로 보내므로써 순차적으로 정렬이 가능함.
            swap(A, 0, i);
            // 힙 속성을 만족하도록 heapify 호출
            heapify(A, 0, i - 1);
        }
    }

    // 최소 힙을 만들기 위한 메소드
    public static void buildMinHeap(int[] A) {
        int n = A.length;
        // 배열의 중간부터 시작하여 각 노드를 힙으로 만든다
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, i, n - 1);
        }
    }

    // 주어진 인덱스에서 힙 속성을 만족하도록 하는 메소드
    public static void heapify(int[] A, int k, int n) {
        int left = 2 * k + 1;
        int right = 2 * k + 2;
        int smaller;

        // 오른쪽 자식이 존재하는 경우 >> 왼쪽부터 자식이 채워지기 때문에 오른쪽 자식이 있으면 자식은 2명
        if (right <= n) {
            // 두 자식 중 작은 값을 선택 >> 자식중 가장 작은 값이랑 부모를 변경해야 두번일 안한다.
            smaller = (A[left] < A[right]) ? left : right;
        } else if (left <= n) {
            // 왼쪽 자식만 존재하는 경우 >> 왼쪽 자식을 부모랑 변경하변 된다.
            smaller = left;
        } else {
            // 자식이 없는 경우
            return;
        }

        // 최소 힙 속성이 만족되지 않으면 교환하고 재귀적으로 heapify 호출
        if (A[smaller] < A[k]) {
            // 교환 일어남
            swap(A, k, smaller);
            heapify(A, smaller, n);
        }
    }

    // 두 요소를 교환하는 메소드
    public static void swap(int[] A, int i, int j) {
        // 교환 일어남
        count++;
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        if(count == a) {
            if(A[i] < A[j]) {
                System.out.println(A[i] + " " + A[j]);
            }else {
                System.out.println(A[j] + " " + A[i]);
            }
            check = true;
        }
    }
}