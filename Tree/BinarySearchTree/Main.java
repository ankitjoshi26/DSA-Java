package Tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {2,4,3,1,6,8,5};
        tree.populate(nums);
        tree.display();
    }
}