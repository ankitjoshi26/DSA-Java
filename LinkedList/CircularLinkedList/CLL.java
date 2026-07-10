package LinkedList.CircularLinkedList;
    public class CLL{
        Node head;
        Node tail;

        public void insert(int value){
            Node node = new Node(value);

            if(head == null){
                head = node;
                tail = node;
                node.next = head;
                return;
            }

            // insert first

            node.next = head;
            head = node;
            tail.next = head;

            // insert last:

            // tail.next = node;
            // node.next = head;
            // tail = node;
        }

        public void display(){
            Node temp = head;
            if(head != null){
                do{
                    System.out.print(temp.value + " -> ");
                    temp = temp.next;
                }while(temp != head);
            }
        }

        private class Node{
            int value;
            Node next;

            public Node(int value){
                this.value = value;
            }

            public Node(int value, Node next){
                this.value = value;
                this.next = next;
            }
        }
    }