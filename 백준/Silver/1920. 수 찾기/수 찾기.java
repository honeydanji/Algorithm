import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자연수 N 입력
        int N = Integer.parseInt(br.readLine());

        // 배열 A 입력
        int[] arrA = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        // 배열 A 정렬
        Arrays.sort(arrA);

        // 찾을 숫자의 개수 M 입력
        int M = Integer.parseInt(br.readLine());

        // M개의 숫자를 입력받아 이진 탐색으로 찾기
        int[] arrM = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        for (int i = 0; i < M; i++) {
            // 이진 탐색으로 숫자 찾기
            int result = binarySearch(arrA, arrM[i]);

            // 결과 출력
            System.out.println(result);
        }
    }

    // 이진 탐색 함수
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1; // 찾았을 경우
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // 찾지 못했을 경우
    }
}
