import java.util.Scanner;

public class App {
    static int gcd(int x, int y){
        while(y != 0){
           int temp = y;
            y = x % y;
            x = temp; 
        }
        return x;
    }
    static int gcdArray(int[] a, int start, int y){
        if(y == 1){ //요소의 갯수가 1개인 경우
            return a[start];
        }
        else if(y == 2){ //요소의 갯수가 2개인 경우
            return gcd(a[start], a[start + 1]);
        }
        else //요소의 갯수가 3개 이상인 경우
			return gcd(a[start], gcdArray(a, start + 1, y - 1));
        
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 최대공약수를 구합니다.");
        System.out.print("요솟수 입력: "); int x = stdIn.nextInt();
        int[] s = new int[x];

        for(int i = 0; i < x; i++){
            do{
                System.out.print("요소입력: ");
                s[i] = stdIn.nextInt();
            }while(s[i] <= 1);
        }

        System.out.println("배열의 최대공약수는 "+gcdArray(s, 0, x)+"입니다.");
    }
}
