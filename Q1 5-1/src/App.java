import java.util.Scanner;

public class App { // 재귀적 용법 없이 작성한 펙토리얼 
    static int factorial(int x){
        int fact = 1;

		while (x > 1)
			fact *= x--;
		return (fact);
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("값을 입력: "); int x = stdIn.nextInt();
        System.out.println(factorial(x));
    }
}
