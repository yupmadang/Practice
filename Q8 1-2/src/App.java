import java.util.Scanner;

public class App {

    static int sumof(int a, int b){
        int sum = 0;
        while(a >= b){
            sum += b;
            b++;
            if(b == a){
                break;
            }
        }
        while(b >= a){
            sum += a;
            a++;
            if(a == b){
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("두 수를 입력하시오.");
        System.out.println("a : ");
        int a = stdIn.nextInt();
        System.out.println("b : ");
        int b = stdIn.nextInt();

        System.out.println(sumof(a, b));
    }
}
