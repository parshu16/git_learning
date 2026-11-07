package KUNAL_JAVA;
public class CustomeStack{
    protected int []data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomeStack(){
        this(DEFAULT_SIZE);
    }

    public CustomeStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!.");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    private boolean isFull(){
        return ptr==data.length-1;//ptr is at last index
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Can not pop from an Empty Stack!.");
        }
        // int removed=data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Can not peek from an empty stack!.");
        }
        return data[ptr];
    }
    private boolean isEmpty() {
        return ptr==-1;
    }
}