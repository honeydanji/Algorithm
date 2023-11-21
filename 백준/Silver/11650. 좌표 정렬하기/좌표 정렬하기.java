import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    // 좌표를 표현하는 Point 클래스 정의
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수 입력
        int testCase = Integer.parseInt(bf.readLine());

        // 좌표를 저장할 리스트 생성
        List<Point> allPoint = new ArrayList<>();
        String[] xy;

        // 테스트 케이스 수만큼 반복하여 좌표를 입력받아 리스트에 추가
        for (int i = 0; i < testCase; i++) {
            xy = bf.readLine().split(" ");
            allPoint.add(new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1])));
        }

        // Collections.sort()를 사용하여 좌표 리스트를 정렬
        Collections.sort(allPoint, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                // x 좌표를 비교하고, 같으면 y 좌표를 비교하여 정렬
                if (o1.x != o2.x) {
                    return Integer.compare(o1.x, o2.x);
                } else {
                    return Integer.compare(o1.y, o2.y);
                }
            }
        });

        // 정렬된 좌표를 출력
        for (Point a : allPoint) {
            System.out.println(a.x + " " + a.y);
        }
    }
}
