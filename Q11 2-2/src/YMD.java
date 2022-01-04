import java.util.Scanner;

public class YMD{
        int y, m, d;

        static int MDAY[][] = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        };
    
        static int isLeap(int year){ /*������ �����ϴ� �޼���*/
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }

        YMD(int y, int m, int d){
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n){ /*�� �� ���� ��¥�� ���ϴ� �޼���*/
            YMD temp = new YMD(this.y, this.m, this.d);
            if(n < 0){ /*�ϼ��� ������ �� ��� before�޼��忡 ������ �����ϸ� after�� �ȴ�.*/
                return (before(-n));
            }
            temp.d += n; /*���� ��¥�� ��� �ϼ��� ����.*/

            while(temp.d > MDAY[isLeap(temp.y)][temp.m-1]){
                temp.d -= MDAY[isLeap(temp.y)][temp.m-1]; /*���� �� ���� */
                if(++temp.m > 12){ /*���� 12���� Ŭ ��� ���� �����ϰ� ���� 1�� ����*/
                    temp.y++;
                    temp.m = 1;
                }
                
            }
            return temp;
        }
        
        YMD before(int n){ /*�� �� ���� ��¥�� ���ϴ� �޼���*/
            YMD temp = new YMD(this.y, this.m, this.d);
            if(n < 0){
                return (after(-n));
            }
            temp.d -= n;

            while(temp.d < 1){
                temp.d += MDAY[isLeap(temp.y)][temp.m-1];
                if(--temp.m < 1){/*���� 1���� ���*/
                    temp.y--;/*���⵵�� �̵�*/
                    temp.m = 12;/*���� 12���� ����*/
                }
                temp.d += MDAY[isLeap(temp.y)][temp.m-1];/*�ϼ��� �� ���� �� �ϼ��� ���Ͽ� ���� ���*/
            }
            return temp;
        }

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner (System.in);

        System.out.println("��¥�� �Է��ϼ���");
        System.out.print("�� : "); int y = stdIn.nextInt();
        System.out.print("�� : "); int m = stdIn.nextInt();
        System.out.print("�� : "); int d = stdIn.nextInt();
        YMD date = new YMD(y, m, d);

        System.out.println("�� �� �� / ���� ��¥�� ���ұ��?");
        int n = stdIn.nextInt();
        YMD d1 = date.after(n);
        System.out.printf("%d�� ���� ��¥�� %d��%d��%d�� �Դϴ�\n",n,d1.y,d1.m,d1.d);
        YMD d2 = date.before(n);
        System.out.printf("%d�� ���� ��¥�� %d��%d��%d�� �Դϴ�\n",n,d2.y,d2.m,d2.d);
    }
}
