import java.util.Scanner;

public class App {

    static void triangleLB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        triangleLB(n);
    }
}
