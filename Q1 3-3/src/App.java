import java.util.Scanner;
//자바 자료구조 검색, 보초법
public class App {
    static int SeqSearchSen(int []arr, int n, int key){
        int i = 0;
        arr[n] = key; //보초 생성
        /*while(true){
            if(arr[i] == key){
                break;
            }
            i++;
        }*/
        for(i = 0; i < n; i++){ /*for문으로 수정한 식을 작성합니다.*/
            if(arr[i] == key){
                break;
            }
        }
        return i == n ? -1 : i;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 입력: ");
        int num = stdIn.nextInt();
        int[]arr = new int[num+1];

        for(int i = 0; i < num; i++){
            System.out.print("각 요소의 값을 입력하시오.: ");
            arr[i] = stdIn.nextInt();
        }

        System.out.print("검색할 요소: ");
        int key = stdIn.nextInt();

        int idx = SeqSearchSen(arr, num, key);
        if(idx == -1){
            System.out.println("찾으시는 값이 없습니다.");
        }
        else{
        System.out.println("찾으시는 요소는 arr["+idx+"]에 있습니다.");
        }

        
    }
}
