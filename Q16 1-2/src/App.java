import java.util.Scanner;

public class App {
    static void spira(int n){
        for (int i=0; i<n; i++) {
            for (int j=1; j<n-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("값을 입력하시오.");
        int n = stdIn.nextInt();
        spira(n);
        
    }
}
