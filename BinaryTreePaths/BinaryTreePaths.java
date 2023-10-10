package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    
    private BinaryNode root;

    public void setRoot(BinaryNode root){
        this.root = root;
    }

    public List<String> getPaths(){
        List<String> paths = new ArrayList<>();
        if(root == null){
            return paths;
        }

        preOrderTraversal(root, "", paths, 0);
        return paths;
    }

    public void preOrderTraversal(BinaryNode node, String path, List<String> paths, int sum){
        path += node.getData();
        sum += node.getData();

        if(node.getLeft() == null && node.getRight() == null){
            paths.add(path);
            paths.add("sum of traversed nodes is " + sum);
            return;
        }

        if(node.getLeft()!=null){
            preOrderTraversal(node.getLeft(), path + "->", paths, sum);
        }
        if(node.getRight()!=null){
            preOrderTraversal(node.getRight(), path + "->", paths, sum);
        }

    }
}
