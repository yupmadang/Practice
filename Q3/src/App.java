import java.util.Scanner;
//�迭�� ��ҵ��� �߰��ϰ� �̵��� ã�� ����
public class App {
    static int serchArr(int a[], int n, int k, int idx[]){// �ѹ��� ��ȯ�� �ϸ鼭 Ư�� ��Ҹ� ã�� �޼���
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == k){
                idx[count++] = i;
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("��ڼ��� �Է��ϼ���: ");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        int y[] = new int[num];

        for(int i = 0; i < x.length; i++){
            System.out.println("���� �Է�: ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("ã���ô� ���� �Է�: ");
        int k = stdIn.nextInt();

        int idx = serchArr(x, num, k, y);
        if(idx == 0){
            System.out.println("ã���ô� ���� �����ϴ�.");
        }
        else{
            for(int i = 0; i < idx; i++){
                System.out.println("�� ���� " + "x[" + y[i] + "]�� �ֽ��ϴ�.");
            }
        }
        
    }
}
