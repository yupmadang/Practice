import java.util.Scanner;

public class App {
    static int med3(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                return b;
            }
            else if(c >= a){
                return a;
            }
            else{
                return c;
            }
        }
        else if(a > c){
            return a;
        }
        else if(b > c){
            return c;
        }
        else{
            return b;
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();
        System.out.println("중앙값을 구하는 프로그램입니다.");
        System.out.println("중앙값은 "+ med3(a, b, c)+"입니다.");


    }
}
