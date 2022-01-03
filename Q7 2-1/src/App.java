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

        System.out.println("10진수를 기수변환합니다.");
        do{
            do{
                System.out.print("음수가 아닌 기수변환을 할 수: ");
                n = stdIn.nextInt();
            }while(n < 0);
    
            do{
                System.out.print("몇 진수로 변환할까요? (2~36): ");
                m = stdIn.nextInt();
            }while(m < 2 || m > 36);
    
            dno = cardConv(n, m, cno);
            System.out.print(m+"진수로는 ");

            for(int i = dno - 1; i >= 0; i--){
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");
    
            
            System.out.print("한번 더 진행할까요?(1 : Yes, 0 : No):");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
