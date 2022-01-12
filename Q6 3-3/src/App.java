import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: "); //배열의 길이 입력
        int num = stdIn.nextInt();
        int []x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("첫번째 요소를 입력하시오"); //첫 요소 작성
        x[0] = stdIn.nextInt();

        for(int i = 1; i < num; i++){ //오름차순으로 작성하되 오름차순이 아니면 입력 반복
            do{
                System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }
        
        System.out.println("검색할 값: "); //검색할 값 입력
        int k = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, k); // Arrays에 있는 BinarySearch메서드를 사용

        if(idx < 0){
            System.out.println("삽입 포인트의 값은"+idx+"입니다."); //요소의 할당 값을 출력!!
        }
        else{
            System.out.println("x["+idx+"]에 있습니다.");
        }
    }
}
