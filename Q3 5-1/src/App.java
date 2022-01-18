import java.util.Scanner;

public class App {
    static int gcd(int x, int y){
        while(y != 0){
           int temp = y;
            y = x % y;
            x = temp; 
        }
        return x;
    }
    static int gcdArray(int[] a, int start, int y){
        if(y == 1){ //����� ������ 1���� ���
            return a[start];
        }
        else if(y == 2){ //����� ������ 2���� ���
            return gcd(a[start], a[start + 1]);
        }
        else //����� ������ 3�� �̻��� ���
			return gcd(a[start], gcdArray(a, start + 1, y - 1));
        
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("�迭�� �ִ������� ���մϴ�.");
        System.out.print("��ڼ� �Է�: "); int x = stdIn.nextInt();
        int[] s = new int[x];

        for(int i = 0; i < x; i++){
            do{
                System.out.print("����Է�: ");
                s[i] = stdIn.nextInt();
            }while(s[i] <= 1);
        }

        System.out.println("�迭�� �ִ������� "+gcdArray(s, 0, x)+"�Դϴ�.");
    }
}
