import java.util.Scanner;

public class App {
    static int search(int a[], int n, int k){
        int p1 = 0;
        int p2 = n - 1;

        do{
            int pc = (p1 + p2) / 2;

            if(a[pc] == k){
                    for(; pc > p1; pc--){
                        if(a[pc - 1] < k ){ // ã�� ���� ������ ���� �տ� �ִ� ��� ���� �Ƥ��� ������ ���� ���ϴ� ��
                            break;
                        }
                    }
                return pc;
            }
            else if(k <= a[pc]){
                p2 = pc - 1;
            }
            else if(k >= a[pc]){
                p1 = pc + 1;
            }
        }while(p1 <= p2);
        return -1;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��"); // �� �� ��Ҹ� �о� ����
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); // �ϳ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int k = stdIn.nextInt();

		int idx = search(x, num, k); // �迭 x���� ���� k�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(k + "�� x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
