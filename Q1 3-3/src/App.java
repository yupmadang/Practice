import java.util.Scanner;
//�ڹ� �ڷᱸ�� �˻�, ���ʹ�
public class App {
    static int SeqSearchSen(int []arr, int n, int key){
        int i = 0;
        arr[n] = key; //���� ����
        /*while(true){
            if(arr[i] == key){
                break;
            }
            i++;
        }*/
        for(i = 0; i < n; i++){ /*for������ ������ ���� �ۼ��մϴ�.*/
            if(arr[i] == key){
                break;
            }
        }
        return i == n ? -1 : i;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("��ڼ� �Է�: ");
        int num = stdIn.nextInt();
        int[]arr = new int[num+1];

        for(int i = 0; i < num; i++){
            System.out.print("�� ����� ���� �Է��Ͻÿ�.: ");
            arr[i] = stdIn.nextInt();
        }

        System.out.print("�˻��� ���: ");
        int key = stdIn.nextInt();

        int idx = SeqSearchSen(arr, num, key);
        if(idx == -1){
            System.out.println("ã���ô� ���� �����ϴ�.");
        }
        else{
        System.out.println("ã���ô� ��Ҵ� arr["+idx+"]�� �ֽ��ϴ�.");
        }

        
    }
}
