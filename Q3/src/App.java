import java.util.Scanner;
//배열에 요소들을 추가하고 이들을 찾는 문제
public class App {
    static int serchArr(int a[], int n, int k, int idx[]){// 한번씩 순환을 하면서 특정 요소를 찾는 메서드
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
        System.out.println("요솟수를 입력하세요: ");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        int y[] = new int[num];

        for(int i = 0; i < x.length; i++){
            System.out.println("값을 입력: ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("찾으시는 값을 입력: ");
        int k = stdIn.nextInt();

        int idx = serchArr(x, num, k, y);
        if(idx == 0){
            System.out.println("찾으시는 값이 없습니다.");
        }
        else{
            for(int i = 0; i < idx; i++){
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
            }
        }
        
    }
}
