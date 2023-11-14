import java.util.*;

public class Main{
    public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);

			int time_H = sc.nextInt();
			int time_H2 = 0;
			int time_M = sc.nextInt();

			int M = sc.nextInt();
			
			if((0 <= time_H && time_H <= 23) && (0 <= time_M && time_M <= 59)) {
				if((time_M + M) > 59) {
					if(((time_M+M) / 60) >= 0) {
						time_H2 = ((time_M+M) / 60);
					}
				}
				if((time_H + time_H2) > 23) {
					System.out.println(((time_H + time_H2)-24)+ " " + ((M+time_M)%60));
				}else {
					System.out.println((time_H + time_H2) + " " + ((M+time_M)%60));
				}
			}
    }
		
}