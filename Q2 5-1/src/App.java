import java.util.Scanner;

public class App { //��Ϳ�� ���� ��Ŭ���� ȣ���� ����
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

        System.out.println("�ִ������� ���մϴ�.");
        System.out.print("������ �Է�: "); int x = stdIn.nextInt();
        System.out.print("������ �Է�: "); int y = stdIn.nextInt();

        System.out.println("�� ���� �ִ������� "+gcd(x,y)+"�Դϴ�.");
    }
}
