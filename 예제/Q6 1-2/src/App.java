import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("�Էµ� ���� ���� ���մϴ�.");
        System.out.println("n�� ��: ");
        int std = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i < std){
            sum += i;
            i++;
        }
        System.out.println("i�� ����: "+i); /*i�� ���� �������� 4�϶� ������ ����Ǳ� ������ �������� i�� ���� n+1�� �˴ϴ�.*/
        System.out.println(sum);
    }
}
