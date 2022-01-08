import java.util.Scanner;
class App {
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++){
            System.out.printf("%4d", k);
        }
		System.out.println();

		System.out.print("---+"); /*---+---------------�κ� ����*/
		for (int k = 0; k < 4 * n + 2; k++){
            System.out.print("-");
        }
		System.out.println();

		for (int i = 0; i < n; i++) { /*���������� ��ĳ���ϴ� ����� ����, ���� ��ƴ�.......*/
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), ""); /*%%�� String.fomat���� %�� �ν�*/
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++){
                System.out.printf("%4d", a[k]);
            }
			System.out.println("\n   |");
			if (a[i] == key){
                return i;
            }
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ� �Է£�");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}

		System.out.print("�˻� �� ����");
		int s = stdIn.nextInt();

		int idx = seqSearchEx(x, num, s);

		if (idx == -1){
            System.out.println("ã�� ��Ұ� �����ϴ�.");
        }
		else{
            System.out.println("ã�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
        }
	}
}
