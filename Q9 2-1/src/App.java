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
        for(int j = 0; j <= m - 1; j++){ /*윤년을 따져 2가지 경우의 1년 총 일수 계산*/
            remain += mdays[isLeap(y)][j];
        }
        for(int i = 0; i < m - 1; i++){ /*기존의 경과일 계산 식*/
            days += mdays[isLeap(y)][i];
        }
        return remain - days; /*총 일수에서 경과일을 빼고 난 후 반환*/
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        do{
            System.out.print("년 :"); int year = stdIn.nextInt();
            System.out.print("월 :"); int month = stdIn.nextInt();
            System.out.print("일 :"); int day = stdIn.nextInt();

            System.out.printf("남은 일수는 %d 입니다.\n",dayOfYear(day, month, year));

            System.out.print("다시 하시겠습니까? (1. 예 / 0. 아니오): ");
            retry = stdIn.nextInt();
            
        }while(retry == 1);
    }
}
