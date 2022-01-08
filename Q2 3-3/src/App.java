import java.util.Scanner;
class App {
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++){
            System.out.printf("%4d", k);
        }
		System.out.println();

		System.out.print("---+"); /*---+---------------부분 구현*/
		for (int k = 0; k < 4 * n + 2; k++){
            System.out.print("-");
        }
		System.out.println();

		for (int i = 0; i < n; i++) { /*순차적으로 스캐닝하는 별찍기 구현, 가장 어렵다.......*/
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), ""); /*%%는 String.fomat에서 %로 인식*/
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

		System.out.print("요솟수 입력：");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색 할 값：");
		int s = stdIn.nextInt();

		int idx = seqSearchEx(x, num, s);

		if (idx == -1){
            System.out.println("찾는 요소가 없습니다.");
        }
		else{
            System.out.println("찾는 값은 x[" + idx + "]에 있습니다.");
        }
	}
}
