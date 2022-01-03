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
    while(--m != 0){ /*달이 0이 될 일이 없으니 달을 감소시켜가면서 반복조건 형성*/
        d += mdays[isLeap(y)][m-1]; /*감소하는 달의 일수를 모두 더함. 이 때 일은 자동으로 더해지니 별도의 식을 불필요함*/
    }
    return d;
}
public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해의 경과 일수를 계산합니다.");

        do{
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            System.out.printf("그 해 %d일 째입니다.\n",dayOfYear(day, month, year));

            System.out.print("다시 하시겠습니까? (1. 예 / 0. 아니오) : ");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
