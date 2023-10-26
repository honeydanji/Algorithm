

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main{
    
    public static void main(String[] args) throws IOException {
        // 입력 셋팅
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 초기 문자열
        String input = bf.readLine(); 
        char[] inputArray = input.toCharArray();
        List<Character> inputList = new LinkedList<>();
        for(char s : inputArray) {
            inputList.add(s);
        }
        
        // 
        ListIterator<Character> iter = inputList.listIterator();

        // 커서 이동
        while(iter.hasNext()) {
			iter.next();
		}

        // 명령어 횟수
        int num = Integer.parseInt(bf.readLine());

        // test
        String[] test;

        for(int i = 0; i < num; i++) {
            String command = bf.readLine();
            switch(command) {
                // 커서가 맨압 > 무시 or 왼쪽 이동
                case "L" :
                    if(iter.hasPrevious()) iter.previous();
                    break;
                // 커서가 맨뒤 > 무시 or 오른쪽 이동
                case "D" :
                    if(iter.hasNext()) iter.next();
                    break;
                // 커서가 맨압 > 무시 or 왼쪽 문자 삭제
                case "B" :
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                // "문자" 커서 왼쪽에 추가
                default :
                test = command.split(" ");
                iter.add(test[1].charAt(0));
                break;
            }
        }
        for(char a : inputList) {
            bw.write(a);
        }

        bw.flush();
		bw.close(); 
    }
}
/* TIP
 * 해당 문제에서는 요소를 추가 및 삭제 하는 경우가 많다.
 * 배열처럼 고정되어 있으면 안되고 List를 사용하는 것이 좋겠다.
 * 커서 위치가 핵심
 * 
 * ArrayList : 요소에 빠르게 접근가능, 그러나 요소를 추가하거나 제거할 때 느림
 * LinkedList : 요소를 빠르게 추가하거나 제거가 가능함. 단 순차적으로 접근할 때 느림
 * 
 * String 은 무거워서 시간에 영향을 줄 수 있음. 그러므로 char로 변경
 * 
 * Interface Iterator<E> 를 사용하면 요소를 더 효율적으로 추가 및 삭제 가능.
 * https://minhamina.tistory.com/18  
 * 위 링크를 가보자. 관련 개념 설명이 잘되어 있다.
 * LinkedList로 풀었을 때 왜 시간초과가 생기는 지도 알아보자.
 * https://minhamina.tistory.com/17
 * 위 링크를 참고하자
*/ 

