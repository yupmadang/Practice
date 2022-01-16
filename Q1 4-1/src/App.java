import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);
        System.out.println("현재 용량 "+ s.size() + " / " + s.capacity());

        while(true){
            System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)용량확인 (6)검색 (7)비움 (0)종료"); //메뉴창 형성
            System.out.print("모드선택: ");

            int menu = stdIn.nextInt();
            int d;
            if(menu == 0) break;

            int x = 0;
            switch(menu){
                
                case 1: //푸시
                System.out.print("데이터: ");
                x = stdIn.nextInt();
                try{ //스택이 가득찬 예외를 처리
                    s.push(x);
                }catch(IntStack.OverflowIntStackException e){
                    System.out.println("스택이 가득 찼습니다.");
                }
                break;

                case 2: //팝
                try{// 스택이 빈 경우 예외를 처리
                    x = s.pop();
                    System.out.print("팝된 데이터는"+x+"입니다");
                }catch(IntStack.EmptyIntStackException e){
                    System.out.println("스택이 비어있습니다.");
                }
                break;
                
                case 3:
                try{ //피크 구현부 예외처리
                    x = s.peek();
                    System.out.print("피크된 값은"+x+"입니다.");
                }catch(IntStack.EmptyIntStackException e){
                    System.out.println("스택이 비어있습니다.");
                }
                break;
                
                case 4: //스택의 값 출력
                s.dump();
                break;

                case 5: //스택의 용량을 확인
                if(s.capacity() == 0){
                    s.isEmpty();
                }
                else if(s.capacity() == s.size()){
                    s.isFull();
                }
                else{
                    System.out.println("현재 용량 "+ s.size() + " / " + s.capacity());
                }
                break;

                case 6:
                try{ //요솟값을 검색
                    System.out.print("찾는 값: ");
                    x = stdIn.nextInt();
                    s.indexOf(x);
                }catch(IntStack.EmptyIntStackException e){
                    System.out.println("스택이 비어있습니다.");
                }
                break;

                case 7:
                do{ //스택을 비우는 모드
                    System.out.print("정말로 비울까요?(1 / 0):");
                    d = stdIn.nextInt();
                    if(d == 1){
                        s.clear();
                        break;
                    }
                    else if(d == 0){
                        break;
                    }
                }while(d != 1 || d != 0);
                break;
                
                default:
                System.out.println("모드가 존재하지 않습니다.");
            }
        }
    }
}
