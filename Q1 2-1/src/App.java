import java.util.Scanner;
import java.util.Random;

public class App { /*����� ���� ������ �Է¹޴� ����*/
    static int maxOf(int a[]){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        System.out.println("����� �� �Է�");
        /*int num = stdIn.nextInt();*/
        int num = rand.nextInt(10);

        int height[] = new int[num];
        for(int i = 0; i < num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println( height[i]);
        }

        System.out.println("�ִ� ����" +maxOf(height)+"�Դϴ�.");
    }
}