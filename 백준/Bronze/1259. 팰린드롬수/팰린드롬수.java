import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test;

        StringBuilder revers;

        while(true) {
            test = sc.nextLine();
            revers = new StringBuilder(test).reverse();
            if (Integer.parseInt(test) == 0) {
                break;
            }
            if(test.equals(revers.toString())) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
