public class App {

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        if(max < d){
            max = d;
        }
        return max;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(max4(1,2,3,4));
        System.out.println(max4(5,2,6,1));
    
    }
}
