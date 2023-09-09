import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			double P = Double.parseDouble(st.nextToken());
			//목적지 도달할 수 있는 우주선의 수를 저장할 변수
			int count = 0;
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				double v = Double.parseDouble(st.nextToken());
				double f = Double.parseDouble(st.nextToken());
				double c = Double.parseDouble(st.nextToken());
				
				//목적지에 도달할 수 있는 우주선일 경우에 count에 1을 더한다.
				if((P / v) * c <= f) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}