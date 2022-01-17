import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        IntAryQueue s = new IntAryQueue(64);

        while(true){
            System.out.println("현재 용량:"+s.size()+"/"+s.capacity()+"입니다.");
            System.out.println("(1)엔큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (6)제거 (7)상태확인 (0)종료");
            System.out.print("모드를 선택: ");
            
            int menu = stdIn.nextInt();

            switch(menu){

            }
        }


    }
}
