import java.util.Scanner;

public class App {

    static void swap(int a[], int idx, int idx2){
        int t = a[idx];
        a[idx] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int a[]){
        for(int i = 0; i < a.length / 2; i++){
            swap(a, i, a.length - i - 1);
            System.out.print("a["+i+"]와" + "a["+(a.length-i-1)+"]"+"를 교체합니다");
            for(int j = 0; j < a.length; j++){
                System.out.print(a[j]+" ");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟값 : ");
        int num = stdIn.nextInt();

        int x[] = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("요소를 입력하시오: ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);
        System.out.println(x);
    }
}
