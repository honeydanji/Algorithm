import java.util.*;

public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

    int[] A = new int[9];

    for (int i = 0; i < A.length; i++) {
        A[i] = sc.nextInt();
    }
    int max = A[0];
    int j = 0;
    
    for (int i = 1; i < A.length; i++) {
        if (A[i] > max) {
            max = A[i];
        }
    }

    System.out.println(max);
    for(int a : A) {
    	j++;
    	if(max == a) {
    		System.out.println(j);
    	}
    }
    }
}