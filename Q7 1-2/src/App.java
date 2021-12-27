import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n까지의 합을 구하는 예제입니다");
        System.out.println("n의 값: ");
        int n = stdIn.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
