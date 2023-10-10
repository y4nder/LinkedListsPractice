package SinglyLinkedList;
public class Main {
    public static void main(String[] args){
        MyLinkedList m = new MyLinkedList();
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insert(4);
        m.insert(5);
        m.insert(6);
        m.show();
        System.out.println(m.getMiddleNode());        
    }
}
