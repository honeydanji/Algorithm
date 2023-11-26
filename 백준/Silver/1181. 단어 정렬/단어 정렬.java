import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> test = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String input = sc.next();

            // 단어 중복 체크
            if(!test.contains(input)) {
                test.add(input);
            }
        }

        Collections.sort(test, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }else if (o1.length() == o2.length()) {
                    for(int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) > o2.charAt(i)) {
                            return 1;
                        }else if(o1.charAt(i) == o2.charAt(i)) {
                            continue;
                        }else {
                            return -1;
                        }
                    }
                }
                return -1;
            }
        });
        for(String a : test) {
            System.out.println(a);
        }
    }    
}
