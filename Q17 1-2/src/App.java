import java.util.Scanner;

public class App {
    static void nspira(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < n-i; j++){
                System.out.print(' ');
            }

            for (int j = 1; j <= i*2-1; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int n = stdIn.nextInt();
        nspira(n);

    }
}
