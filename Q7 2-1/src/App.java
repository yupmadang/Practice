import java.util.Scanner;

public class App {
    static int cardConv(int x, int r, char[]d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print(r+"|        "+x+"..."+x % r+"\n");
        System.out.print(" +----------\n");

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
            if(x != 0){
                System.out.print(r+"|        "+x+"..."+x % r+"\n");
                System.out.print(" +----------\n");
            }
            else{
                System.out.print("          "+x+"..."+x % r+"\n");
            }
            
        }while(x != 0);
        return digits;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n, m, dno, retry;
        char[] cno = new char[32];

        System.out.println("10������ �����ȯ�մϴ�.");
        do{
            do{
                System.out.print("������ �ƴ� �����ȯ�� �� ��: ");
                n = stdIn.nextInt();
            }while(n < 0);
    
            do{
                System.out.print("�� ������ ��ȯ�ұ��? (2~36): ");
                m = stdIn.nextInt();
            }while(m < 2 || m > 36);
    
            dno = cardConv(n, m, cno);
            System.out.print(m+"�����δ� ");

            for(int i = dno - 1; i >= 0; i--){
                System.out.print(cno[i]);
            }
            System.out.print("�Դϴ�.");
    
            
            System.out.print("�ѹ� �� �����ұ��?(1 : Yes, 0 : No):");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
