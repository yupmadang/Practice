import java.util.Scanner;

public class App { /*���� �ݺ��� �̿��� ���� ��� Q10 1-2*/
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        do{
            System.out.println("a�� ��: ");
            a = stdIn.nextInt();
            System.out.println("b�� ��: ");
            b = stdIn.nextInt();

            System.out.println("a���� ū���� �Է��Ͻÿ�.");
            

        }while(a >=b);

        int result = b - a;
        System.out.println(result);
    }
}
