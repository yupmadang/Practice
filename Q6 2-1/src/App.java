import java.util.Scanner;

public class App {

    static int CardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;

            
        }while(x != 0);
        return digits;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int no, cd, dno, retry;
        char[] cno = new char[32];

        System.out.println("10������ �����ȯ�մϴ�.");
        do{
            do{
                System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
                no = stdIn.nextInt();
            }while (no < 0);

            do{
                System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
                cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            dno = CardConv(no, cd, cno);

            /*System.out.print(cd + "�����δ� ");
            for(int i = dno -1; i >= 0; i--){
                System.out.print(cno[i]);
            }*/

            System.out.print(cd + "�����δ� "); /*�迭�� ���ʿ� ���ڸ��� �ִ� �޼���*/
            for(int i = 0; i <= dno - 1; i++){
                System.out.print(cno[i]);
            }

            System.out.println("�Դϴ�.");

            System.out.print("�ѹ� �� �ұ�� (1. ��/ 0. �ƴϿ�): ");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}

