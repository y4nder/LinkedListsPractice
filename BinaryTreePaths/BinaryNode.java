package BinaryTreePaths;

public class BinaryNode {
    private int data;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int data){
        this.data = data;
    }

    public BinaryNode(int data, BinaryNode left, BinaryNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //getters
    public int getData(){
        return data;
    }

    public BinaryNode getLeft(){
        return left;
    }

    public BinaryNode getRight(){
        return right;
    }

    //setters
    public void setLeft(BinaryNode left){
        this.left = left;
    }

    public void setRight(BinaryNode right){
        this.right = right;
    }
}
