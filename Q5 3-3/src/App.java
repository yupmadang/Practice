import java.util.Scanner;

public class App {
    static int search(int a[], int n, int k){
        int p1 = 0;
        int p2 = n - 1;

        do{
            int pc = (p1 + p2) / 2;

            if(a[pc] == k){
                    for(; pc > p1; pc--){
                        if(a[pc - 1] < k ){ // 찾는 값과 동일한 값이 앞에 있는 경우 제일 아ㅍ의 동일한 값을 구하는 식
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

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]："); // 맨 앞 요소를 읽어 들임
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("찾는 값："); // 키 값을 입력 받음
		int k = stdIn.nextInt();

		int idx = search(x, num, k); // 배열 x에서 값이 k인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(k + "은 x[" + idx + "]에 있습니다.");
	}
}
