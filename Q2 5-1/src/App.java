import java.util.Scanner;

public class App { //재귀용법 없이 유클리드 호제법 구현
    static int gcd(int x, int y){
        while(y != 0){
            int temp = y;
			y = x % y;
			x = temp;
        }
        return x;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("최대공약수를 구합니다.");
        System.out.print("정수를 입력: "); int x = stdIn.nextInt();
        System.out.print("정수를 입력: "); int y = stdIn.nextInt();

        System.out.println("두 수의 최대공약수는 "+gcd(x,y)+"입니다.");
    }
}
