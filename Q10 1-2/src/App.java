import java.util.Scanner;

public class App { /*사전 반복을 이용한 뺄셈 계산 Q10 1-2*/
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        do{
            System.out.println("a의 값: ");
            a = stdIn.nextInt();
            System.out.println("b의 값: ");
            b = stdIn.nextInt();

            System.out.println("a보다 큰값을 입력하시오.");
            

        }while(a >=b);

        int result = b - a;
        System.out.println(result);
    }
}
