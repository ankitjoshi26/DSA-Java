package LinkedList.SinglyLinkedList;

import java.util.Arrays;


public class LL {
    private Node head; // store first node
    private Node tail; // store last node

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertRecursion(int value, int index){
        head = insertRec(value,index,head);
    }
    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    public void insertFirst(int value){
        Node node = new Node(value);  // create new box (node)
        node.next = head;             
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertPosition(int value, int position){
        if(position == 0){
            insertFirst(value);
            return;
        }

        if(size == position){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < position; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;

    }

    // public void insertLast(int value){   // without using tail
    //     Node node = new Node(value);

    //     Node temp = head;

    //     while (temp.next != null) {
    //         temp = temp.next;
    //     }

    //     temp.next = node;
    //     size += 1;
    // }

    public void deleteFirst(){
        if(size == 1){
            head = null;
            tail = null;
        }

        head = head.next;
        size -= 1; 
    }

    // public void deleteLast(){   // using size variable
    //     if (size == 0) {
    //         System.out.println("list is empty");
    //         return;
    //     }

    //     if(size == 1){
    //         deleteFirst();
    //         return;
    //     }

    //     Node temp = head;

    //     for(int i=1;i<=size-2;i++){
    //         temp = temp.next;
    //     }

    //     temp.next = null;
    //     tail = temp;
    //     size--;
    // }

    public void deleteLast(){
        if(size == 0){
            return;
        }

        if(size == 1){
            deleteFirst();
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;

    }

    public void deletePosition(int index){
        if(index == 0){
            return;
        }

        if(index == 1){
            deleteFirst();
            return;
        }

        if(index == size){
            deleteLast();
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
        
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next; 

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}