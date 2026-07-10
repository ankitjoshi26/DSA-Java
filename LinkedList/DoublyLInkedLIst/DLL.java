package LinkedList.DoublyLInkedLIst;
public class DLL{
    Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node; 
    }

    public void insertLast(int value){
        Node node = new Node(value);

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insetAtPos(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }

        Node temp = head;

        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next, temp);

        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse order");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }
    
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}