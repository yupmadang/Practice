import java.util.Scanner;

public class App { // ����� ��� ���� �ۼ��� ���丮�� 
    static int factorial(int x){
        int fact = 1;

		while (x > 1)
			fact *= x--;
		return (fact);
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("���� �Է�: "); int x = stdIn.nextInt();
        System.out.println(factorial(x));
    }
}
