import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("입력되 수의 합을 구합니다.");
        System.out.println("n의 값: ");
        int std = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i < std){
            sum += i;
            i++;
        }
        System.out.println("i의 값은: "+i); /*i의 값이 루프에서 4일때 루프는 종료되기 때문에 최종적이 i의 값은 n+1이 됩니다.*/
        System.out.println(sum);
    }
}
