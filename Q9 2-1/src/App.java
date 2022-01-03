import java.util.Scanner;

public class App {
    static int mdays[][] = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int d, int m, int y){
        int days = d;
        int remain = 0;
        for(int j = 0; j <= m - 1; j++){ /*������ ���� 2���� ����� 1�� �� �ϼ� ���*/
            remain += mdays[isLeap(y)][j];
        }
        for(int i = 0; i < m - 1; i++){ /*������ ����� ��� ��*/
            days += mdays[isLeap(y)][i];
        }
        return remain - days; /*�� �ϼ����� ������� ���� �� �� ��ȯ*/
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        do{
            System.out.print("�� :"); int year = stdIn.nextInt();
            System.out.print("�� :"); int month = stdIn.nextInt();
            System.out.print("�� :"); int day = stdIn.nextInt();

            System.out.printf("���� �ϼ��� %d �Դϴ�.\n",dayOfYear(day, month, year));

            System.out.print("�ٽ� �Ͻðڽ��ϱ�? (1. �� / 0. �ƴϿ�): ");
            retry = stdIn.nextInt();
            
        }while(retry == 1);
    }
}
