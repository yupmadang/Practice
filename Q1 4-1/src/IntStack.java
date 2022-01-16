public class IntStack {
    private int ptr;
    private int max;
    private int[] stk;

    public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = new int[max];
        }catch(OutOfMemoryError e){
            max = 0;
        }
    }
 
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public int push(int x) throws OverflowIntStackException{
        if(ptr >= max){
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if(ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException{
        if(ptr >= max){
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <= 0;
    }

    public boolean isFull(){
        return ptr >= max;
    }

    public int indexOf(int x){
        for(int i= 0; i < ptr - 1; i++){
            if(stk[i] == x){
                System.out.println("찾으시는 값이 " +i+ "에 있습니다.");
                return i;
            }
        }
        return -1;    
    }

    public void dump(){
        if(ptr <= 0){
            System.out.println("스택이 비어있습니다.");
        }
        else{
            for(int i = 0; i < ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}