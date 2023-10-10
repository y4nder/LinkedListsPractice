package BinaryTreePaths;

import java.util.List;

public class Main {
    public static void main(String[] args){
        BinaryTreePaths btp = new BinaryTreePaths();
        NodePaths nodePaths = new NodePaths();
        btp.setRoot(nodePaths.createPaths());
        List<String> paths = btp.getPaths();
        for(String path : paths){
            System.out.println(path);
        }
    }
}
