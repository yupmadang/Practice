import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        IntAryQueue s = new IntAryQueue(64);

        while(true){
            System.out.println("���� �뷮:"+s.size()+"/"+s.capacity()+"�Դϴ�.");
            System.out.println("(1)��ť (2)��ť (3)��ũ (4)���� (5)�˻� (6)���� (7)����Ȯ�� (0)����");
            System.out.print("��带 ����: ");
            
            int menu = stdIn.nextInt();

            switch(menu){

            }
        }


    }
}
