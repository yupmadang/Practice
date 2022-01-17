public class IntAryQueue {
    private int max;
    private int ptr;
    private int[] queue;

public class EmptyIntAryQueue extends RuntimeException{
    public EmptyIntAryQueue(){}
}

public class OverflowIntAryQueue extends RuntimeException{
    public OverflowIntAryQueue(){}
}

public int enQueue(int x) throws OverflowIntAryQueue{
    if(ptr >= max){
       throw new OverflowIntAryQueue();
    }
    return queue[ptr++] = x;
}

public int deQueue() throws EmptyIntAryQueue{
    if(ptr <= 0){
        throw new EmptyIntAryQueue();
    }
	int x = queue[0];
	for (int i = 0; i < ptr - 1; i++){
        queue[i] = queue[i + 1];
    }		 
	ptr--;
	return x;
}

public int peek() throws EmptyIntAryQueue{
    if(ptr <= 0){
        throw new EmptyIntAryQueue();
    }
    return queue[ptr - 1];
}

public void dump(){
    if(ptr <= 0){
        System.out.println("큐가 비어있습니다.");
    }
    else{
        for(int i = 0; i < ptr; i++){
            System.out.print(queue[i]+ " ");
        }
        System.out.println();
    }
}

public boolean isEmpty(){
    return ptr <= 0;
}

public boolean isFull(){
    return ptr >= max;
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

public int indexOf(int x){
    for(int i = ptr - 1; i >= 0; i--){
        if(queue[i] == x){
            return i;
        }
    }
    return -1;
}

public IntAryQueue(int capacity){
    max = capacity;
    ptr = 0;
    

    try{
        queue = new int[max];
    }catch (OutOfMemoryError e){
        System.out.println("큐가 생성되지 않았습니다.");
    }
}
    
    
}
