public class App {
    static int min3(int a, int b, int c){
        int max = a;
        if(max > b); max = b;
        if(max > c); max = c;

        return max;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("�ּڰ��Դϴ�.");
        System.out.println(min3(5,6,4));
        
    }
}
