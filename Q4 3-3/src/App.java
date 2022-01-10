import java.util.Scanner;

public class App {
    static int search(int a[], int n, int k){
        System.out.print("   |");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%4d" ,i);
        }

        System.out.println();

        System.out.print("---+");
        for(int i = 0; i < a.length; i++){
            System.out.print("----");
        }
        System.out.println();
        int p1 = 0;
        int p2 = n - 1;
        do{
            int pc = (p1 +p2) / 2;
            if (p1 != pc)
                System.out.printf(String.format("%%%ds<-%%%ds+", (p1 * 4) + 1, (pc - p1) * 4), "", "");
            else
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            if (pc != p2)
                System.out.printf(String.format("%%%ds->\n", (p2 - pc) * 4 - 2), "");
            else
                System.out.println("->");
            System.out.printf("%3d|", pc);

            for (int i = 0; i < n; i++)
				System.out.printf("%4d", a[i]);
			System.out.println("\n   |");

            if(k == pc){
                return pc;
            }
            else if (a[pc] < k){
                p1 = pc + 1;
            }
			else{
                p2 = pc - 1;
            }
        }while(p1 <= p2);
        return -1;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟수 입력: ");
        int num = stdIn.nextInt();

        int x[] = new int[num];

        for(int i = 0; i < x.length; i++){
            System.out.println("값을 입력: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값 입력: ");
        int k = stdIn.nextInt();

        int idx = search(x, num, k);

        if(idx == -1){
            System.out.println("찾으시는 값이 없습니다.");
        }
        else{
            System.out.println("찾으시는 값은 x["+idx+"]에 있습니다");
        }
    }
}
