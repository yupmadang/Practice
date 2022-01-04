import java.util.Scanner;

public class YMD{
        int y, m, d;

        static int MDAY[][] = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        };
    
        static int isLeap(int year){ /*윤년을 구분하는 메서드*/
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }

        YMD(int y, int m, int d){
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n){ /*몇 일 뒤의 날짜를 구하는 메서드*/
            YMD temp = new YMD(this.y, this.m, this.d);
            if(n < 0){ /*일수가 역으로 갈 경우 before메서드에 음수를 대입하면 after가 된다.*/
                return (before(-n));
            }
            temp.d += n; /*현재 날짜와 경과 일수를 더함.*/

            while(temp.d > MDAY[isLeap(temp.y)][temp.m-1]){
                temp.d -= MDAY[isLeap(temp.y)][temp.m-1]; /*더한 일 수에 */
                if(++temp.m > 12){ /*월이 12보다 클 경우 년을 증가하고 월을 1로 변경*/
                    temp.y++;
                    temp.m = 1;
                }
                
            }
            return temp;
        }
        
        YMD before(int n){ /*몇 일 전의 날짜를 구하는 메서드*/
            YMD temp = new YMD(this.y, this.m, this.d);
            if(n < 0){
                return (after(-n));
            }
            temp.d -= n;

            while(temp.d < 1){
                temp.d += MDAY[isLeap(temp.y)][temp.m-1];
                if(--temp.m < 1){/*월이 1월인 경우*/
                    temp.y--;/*전년도로 이동*/
                    temp.m = 12;/*월은 12월로 시작*/
                }
                temp.d += MDAY[isLeap(temp.y)][temp.m-1];/*일수에 그 달의 총 일수를 더하여 일을 계산*/
            }
            return temp;
        }

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner (System.in);

        System.out.println("날짜를 입력하세요");
        System.out.print("년 : "); int y = stdIn.nextInt();
        System.out.print("월 : "); int m = stdIn.nextInt();
        System.out.print("일 : "); int d = stdIn.nextInt();
        YMD date = new YMD(y, m, d);

        System.out.println("몇 일 앞 / 뒤의 날짜를 구할까요?");
        int n = stdIn.nextInt();
        YMD d1 = date.after(n);
        System.out.printf("%d일 뒤의 날짜는 %d년%d월%d일 입니다\n",n,d1.y,d1.m,d1.d);
        YMD d2 = date.before(n);
        System.out.printf("%d일 앞의 날짜는 %d년%d월%d일 입니다\n",n,d2.y,d2.m,d2.d);
    }
}
