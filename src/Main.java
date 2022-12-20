public class Main {
    public static void main(String[] args) {


        BinaryTree tree=new BinaryTree();

        tree.add(5);
        tree.add(3);
        tree.add(2);

        System.out.println(tree.min());
        System.out.println(tree.max());
        System.out.println(tree.contains(3));


    }
}