import java.util.Scanner;

public class App {
    static void copy(int a[], int b[]){
        for(int i =0; i < b.length; i++){
            a[i] = b[i];
        }
    }
    public static void main(String[] args) throws Exception { /*�迭�� �����ϴ� ����*/
        Scanner stdIn = new Scanner(System.in);

        System.out.println("��ڼ�: ");
        int num = stdIn.nextInt();
        int x[] = new int[num]; /*����� ������ �̸� ������ �ϰ� ���*/
        int y[] = new int[num];

        for(int i = 0; i < num; i++){
            y[i] = stdIn.nextInt();
        }

        copy(x, y);
        
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i]); 
        }
        System.out.println();

        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]);
        }
    }
}
