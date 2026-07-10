package LinkedList.Questions;

public class lengthOfCycle {

    static class LL {
        Node head;
        Node tail;

        // Insert at end
        public void insert(int value) {
            Node node = new Node(value);

            if (head == null) {
                head = node;
                tail = node;
                return;
            }

            tail.next = node;
            tail = node;
        }

        // Find length of cycle
        public int lengthCycle(Node head) {
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if (fast == slow) {
                    Node temp = slow;
                    int length = 0;

                    do {
                        temp = temp.next;
                        length++;
                    } while (temp != slow);

                    return length;
                }
            }
            return 0;
        }

        // Create a cycle for testing
        public void createCycle(int position) {
            if (position < 0) return;

            Node cycleNode = head;
            for (int i = 0; i < position && cycleNode != null; i++) {
                cycleNode = cycleNode.next;
            }

            if (tail != null) {
                tail.next = cycleNode;
            }
        }

        public void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        private static class Node {
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
    }

    public static void main(String[] args) {

        LL list = new LL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

        // Creates cycle: 50 -> 30
        list.createCycle(2);

        System.out.println("Length of cycle: " + list.lengthCycle(list.head));
    }
}