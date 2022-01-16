import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);
        System.out.println("���� �뷮 "+ s.size() + " / " + s.capacity());

        while(true){
            System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�뷮Ȯ�� (6)�˻� (7)��� (0)����"); //�޴�â ����
            System.out.print("��弱��: ");

            int menu = stdIn.nextInt();
            int d;
            if(menu == 0) break;

            int x = 0;
            switch(menu){
                
                case 1: //Ǫ��
                System.out.print("������: ");
                x = stdIn.nextInt();
                try{ //������ ������ ���ܸ� ó��
                    s.push(x);
                }catch(IntStack.OverflowIntStackException e){
                    System.out.println("������ ���� á���ϴ�.");
                }
                break;

                case 2: //��
                try{// ������ �� ��� ���ܸ� ó��
                    x = s.pop();
                    System.out.print("�˵� �����ʹ�"+x+"�Դϴ�");
                }catch(IntStack.EmptyIntStackException e){
                    System.out.println("������ ����ֽ��ϴ�.");
                }
                break;
                
                case 3:
                try{ //��ũ ������ ����ó��
                    x = s.peek();
                    System.out.print("��ũ�� ����"+x+"�Դϴ�.");
                }catch(IntStack.EmptyIntStackException e){
                    System.out.println("������ ����ֽ��ϴ�.");
                }
                break;
                
                case 4: //������ �� ���
                s.dump();
                break;

                case 5: //������ �뷮�� Ȯ��
                if(s.capacity() == 0){
                    s.isEmpty();
                }
                else if(s.capacity() == s.size()){
                    s.isFull();
                }
                else{
                    System.out.println("���� �뷮 "+ s.size() + " / " + s.capacity());
                }
                break;

                case 6:
                try{ //��ڰ��� �˻�
                    System.out.print("ã�� ��: ");
                    x = stdIn.nextInt();
                    s.indexOf(x);
                }catch(IntStack.EmptyIntStackException e){
                    System.out.println("������ ����ֽ��ϴ�.");
                }
                break;

                case 7:
                do{ //������ ���� ���
                    System.out.print("������ �����?(1 / 0):");
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
                System.out.println("��尡 �������� �ʽ��ϴ�.");
            }
        }
    }
}
