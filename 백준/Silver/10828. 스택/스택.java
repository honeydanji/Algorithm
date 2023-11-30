import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
        	StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			
            //여기선 if로 했지만 스위치로 하는게 더 깔끔하다.
			if(S.equals("push")) stack.push(Integer.parseInt(st.nextToken()));
			else if(S.equals("pop")) {
				if(!stack.empty()) sb.append(stack.pop()).append("\n");
				else sb.append(-1).append("\n");
			}else if(S.equals("size")) {
                sb.append(stack.size()).append("\n");
			}else if(S.equals("empty")) {
				if(!stack.empty()) sb.append(0).append("\n");
				else sb.append(1).append("\n");
			}else {
				if(!stack.empty()) sb.append(stack.peek()).append("\n");
				else sb.append(-1).append("\n");
			}
		}
        System.out.println(sb);
	}

}