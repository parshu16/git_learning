package KUNAL_JAVA;

class StackMain {
    public static void main(String[] args)throws StackException {
        CustomeStack stack=new CustomeStack(5);
        stack.push(18);
        stack.push(3);
        stack.push(45);
        stack.push(2);
        stack.push(90);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());

    }
}
