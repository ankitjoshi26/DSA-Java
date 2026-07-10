package LinkedList;

import LinkedList.SinglyLinkedList.LL;
import LinkedList.CircularLinkedList.CLL;
import LinkedList.DoublyLInkedLIst.DLL;

public class main {
    public static void main(String[] args){
        LL list = new LL();
        // DLL dll = new DLL();

        // singly linked list

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertFirst(1);
        // list.insertLast(18);
        // list.insertPosition(11,3);

        // list.deleteFirst();
        // list.deleteLast();
        // list.deletePosition(3);

        list.insertRecursion(88, 2);

        list.display();


        // double linked list

        // dll.insertFirst(23);
        // dll.insertFirst(13);
        // dll.insertFirst(53);

        // // dll.insertLast(103);

        // dll.insetAtPos(11, 2);


        // dll.display();


        // CLL cll = new CLL();
        // cll.insert(10);
        // cll.insert(20);
        // cll.insert(30);

        // cll.display();

    }
}