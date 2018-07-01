package implementations;

public class Main {
    public static void main(String[] args){
//        List<Integer> list=new LinkedList<>();
//
//        list.add(1);
//        list.add(5);
//        list.add(5);
//        list.add(14);
//
//        //list.traverse();
//
//        list.remove(14);
//        list.traverse();
//        Stack<Integer> stack=new Stac<>();
//
//        stack.push(2);
//        stack.push(5);
//        stack.push(89);
//
//        //stack.pop();
//        //stack.pop();
//
//        //System.out.println(stack.peek());
//
//        stack.traverse();
        Tree<Integer> binaryTree=new BinarySearchTree<>();

        binaryTree.addNode(8);
        binaryTree.addNode(5);
        binaryTree.addNode(10);
        binaryTree.addNode(9);
        binaryTree.addNode(12);
        binaryTree.addNode(2);
        binaryTree.addNode(2);

        binaryTree.traverse();


    }
}
