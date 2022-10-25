package Stack;

public class StackMain {

    public static void main(String[] args) {
        StackImplementation stack=new StackImplementation();
       
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Display stack");
        stack.display();    
        System.out.println("pop operation");
        stack.pop();
        System.out.println();
        System.out.println("Display stack");
        stack.display();

    }

}
