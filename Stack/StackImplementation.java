package Stack;

public class StackImplementation {
	

	    private Node top;

	    public StackImplementation() {
	        this.top = top;
	    }
	   
	    void push(int element) {
	       
	        Node node=new Node();
	        node.data=element;
	        if(node==null) {
	            node.next=null;
	        }else {
	            node.next=top;
	            top=node;
	        }
	       
	    }
	   
	    void pop() {
	        if(top==null)
	            System.out.print("stack is empty");
	        else {
	            Node temp=top;
	            System.out.print("deleted element is:"+temp.data);
	           
	            top=temp.next;
	        }
	       
	    }
	   
	 public    void display() {
	        if(top==null)
	            System.out.println("Stack is empty");
	        else {
	            Node temp=top;
	        while(temp.next!=null) {
	            System.out.println(temp.data);
	                temp=temp.next;
	            }
	        System.out.println(temp.data);
	                   
	            }
}
	}

