import java.util.Scanner;

public class App {

    static int sumOf(int a[]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }

        return sum;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("©Д╪з╪Ж: ");
        int num = stdIn.nextInt();

        int x[] = new int[num];

        for(int i = 0; i < num; i++){
            x[i] = stdIn.nextInt();
        }

        System.out.print("гу: "+sumOf(x));
        
    }
}
