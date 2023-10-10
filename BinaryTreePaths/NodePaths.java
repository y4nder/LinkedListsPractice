package BinaryTreePaths;

public class NodePaths {
    public BinaryNode createPaths(){
        BinaryNode r1 = new BinaryNode(3);
        BinaryNode r2 = new BinaryNode(1);
        BinaryNode r3 = new BinaryNode(2);
        BinaryNode r4 = new BinaryNode(5);
        BinaryNode r5 = new BinaryNode(4);
        BinaryNode r6 = new BinaryNode(6);

        r1.setLeft(r2);
        r2.setLeft(r3);
        r3.setLeft(r4);
        r4.setLeft(r5);
        r4.setRight(r6);
        r5.setLeft(r6);

        return r1;
    }
}
