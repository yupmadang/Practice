import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("�ڸ��� ���");
        System.out.println("sec1 ��: ");
        int sec1 = stdIn.nextInt();
        int sec2;
        int sec3 = sec1;

        for(sec2 = 0; sec3 > 0; sec2++){
            sec3 = sec3 / 10;
        }   
        System.out.println("�ڸ����� "+sec2+" �Դϴ�."); 
    }
}
