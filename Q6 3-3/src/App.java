import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("��ڼ�: "); //�迭�� ���� �Է�
        int num = stdIn.nextInt();
        int []x = new int[num];

        System.out.println("������������ �Է��ϼ���.");

        System.out.print("ù��° ��Ҹ� �Է��Ͻÿ�"); //ù ��� �ۼ�
        x[0] = stdIn.nextInt();

        for(int i = 1; i < num; i++){ //������������ �ۼ��ϵ� ���������� �ƴϸ� �Է� �ݺ�
            do{
                System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }
        
        System.out.println("�˻��� ��: "); //�˻��� �� �Է�
        int k = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, k); // Arrays�� �ִ� BinarySearch�޼��带 ���

        if(idx < 0){
            System.out.println("���� ����Ʈ�� ����"+idx+"�Դϴ�."); //����� �Ҵ� ���� ���!!
        }
        else{
            System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
        }
    }
}
