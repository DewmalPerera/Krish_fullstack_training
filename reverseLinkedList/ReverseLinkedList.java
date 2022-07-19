package reverseLinkedList;

public class ReverseLinkedList {
	
	static Node start;

 static class Node{
        int data;
        Node next;

        Node(int a){
            data=a;
            next=null;
        }
    }

    Node reversefunction(Node node){
        Node previous=null;
        Node current=node;
        Node next=null;
        
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        
        node=previous;
        return node;
    }
    
    

    void printlinkedlist(Node node){
    	
        while(node!=null){
            System.out.print(node.data + " ");
            node=node.next;
        }
    }

    public static void main(String args[]){
    	
    	ReverseLinkedList set=new ReverseLinkedList();
    	
    	set.start=new Node(50);
    	set.start.next=new Node(10);
    	set.start.next.next=new Node(20);
    	set.start.next.next.next=new Node(40);
    	set.start.next.next.next.next=new Node(60);

        System.out.println("Normal Linked List");
        
        set.printlinkedlist(start);
        
        start = set.reversefunction(start);
        System.out.println("");
        System.out.println("Reversed Linked List");
        set.printlinkedlist(start);
    }

}

